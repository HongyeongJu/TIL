## 사전 작업

```sql
create table member (
    id varchar(20),
    pass varchar2(20),
    name varchar2(20),
    deptno varchar2(20));
create table mydept(
   deptno varchar2(20) primary key,
   deptname varchar2(20));
insert into mydept values('001', '전산실');
insert into mydept values ('002','영업');
alter table member
add (sal number(10), addr varchar2(20));
insert into member values('jang', '1111', '장동건', '005', 10000, '서울');
insert into member values('jang', '1111', '장동건', '005', 10000, '서울');
```

- 아무 데이터가 다 들어가는 상태이다.. 즉 데이터가 저장될 떄 데이터의 무결성이 필요하다 → 제약조건 5가지를 설정해주어야된다.

```sql
Alter table 테이블명
Add constraint 제약조건이름 추가할제약조건 명시
```

- 위에는 제약조건을 테이블 만든 상태에서 테이블에 추가를 시킨 것을 의미한다.
- 

### not null

```jsx
alter table member
modify (name varchar2(25) not null);
```

- not null만 add constraint가 아니라, modify를 사용하여 수정하면서 not null을 해야된다.
- add constraint 로 제약조건을 만들 수가 없음

### Unique

```jsx
DEPTNO                                   DEPTNAME
---------------------------------------- ----------------------------------------
001                                      전산실
002                                      영업
003                                      기획실

SQL> insert into mydept values('004', '기획실');

1 row created.

SQL> select * from mydept;

DEPTNO                                   DEPTNAME
---------------------------------------- ----------------------------------------
001                                      전산실
002                                      영업
003                                      기획실
004                                      기획실
alter table mydept
add constraint uq_deptname unique(deptname);
```

- mydept 테이블에 uq_deptname 이라고 불리는 제약조건을 deptname 칼럼에 unique 제약조건을 추가할 것이다 라는 뜻.

```sql
SQL> select owner,constraint_name, constraint_type, table_name
  2  from user_constraints;

OWNER
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
------------------------------------------------------
CONSTRAINT_NAME                                              CO TABLE_NAME
------------------------------------------------------------ -- -----------------------------
-------------------------------
SCOTT
SYS_C006998                                                  P  EMP

SCOTT
SYS_C007002                                                  P  MYDEPT

SCOTT
SYS_C007001                                                  P  MYEMP

OWNER
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
------------------------------------------------------
CONSTRAINT_NAME                                              CO TABLE_NAME
------------------------------------------------------------ -- -----------------------------
-------------------------------
SCOTT
SYS_C007003                                                  C  MEMBER

SCOTT
UQ_DEPTNAME                                                  U  MYDEPT
```

#### 참고

```sql
SQL> alter table member
  2  add constraint member_name_null telnum varchar2(20) not null;
alter table member
            *
ERROR at line 1:
ORA-01758: table must be empty to add mandatory (NOT NULL) column
```

- 위 에러는, 어떤 제약조건을 만들 때 데이터가 있으면 안되는 것들이 있다 때문에 하기전에 delete from 문으로 데이터들을 제약조건에 위배되는 것을 날려버렸다.

### Primary key

```sql
SQL> alter table member
  2  add constraint pk_id primary key(id);
SQL> insert into member values('jang', '1111', '장동건', '005', 10000, '서울' ,'010');
insert into member values('jang', '1111', '장동건', '005', 10000, '서울' ,'010')
*
ERROR at line 1:
ORA-00001: unique constraint (SCOTT.PK_ID) violated

SQL> insert into member values(null, '1111', '장동건', '005', 10000, '서울' ,'010');
insert into member values(null, '1111', '장동건', '005', 10000, '서울' ,'010')
                          *
ERROR at line 1:
ORA-01400: cannot insert NULL into ("SCOTT"."MEMBER"."ID")
```

- primary key는 not null과 unique 제약조건을 합쳐놓은 것과 같다.

```sql
Alter table 테이블명
Add constraint 제약조건명 foreign key(foreign key제약조건을 적용할 컬럼)
	references 테이블명(기본키 - foreign key에서 참조할 기본키)
```

### Foreign Key

```sql
SQL> alter table member
  2  add constraint fk_mem_deptno foreign key(deptno)
  3                 references mydept(deptno);
add constraint fk_mem_deptno foreign key(deptno)
               *
ERROR at line 2:
ORA-02298: cannot validate (SCOTT.FK_MEM_DEPTNO) - parent keys not found
```

- 제약조건은 데이터 insert 하기전에 줘야된다..!!! 안그럼 위와 같은 오류가 발생한다.

```sql
SQL> insert into mydept values('004', '인사과');

1 row created.

SQL> insert into mydept values('005', '고객지원실');

1 row created.

SQL> commit;

Commit complete.

SQL> alter table member
  2  add constraint fk_mem_deptno foreign key(deptno)
  3                 references mydept(deptno);

Table altered.
SQL> insert into member values('jang2', '1111', '장동건', '006', 10000, '서울' ,'010');
insert into member values('jang2', '1111', '장동건', '006', 10000, '서울' ,'010')
*
ERROR at line 1:
ORA-02291: integrity constraint (SCOTT.FK_MEM_DEPTNO) violated - parent key not found
```

- 이런 오류가 발생되었으면 pk에 없는 값을 fk로 작업을 했구나 라고 깨달으면 된다.

```sql
SQL> delete from mydept where deptno='005';
delete from mydept where deptno='005'
*
ERROR at line 1:
ORA-02292: integrity constraint (SCOTT.FK_MEM_DEPTNO) violated - child record found
```

- 위와 같은 오류가 발생하는것도 마찬가지로 멤버 테이블에 부서 번호가 005인 데이터에서 부서가 아예 삭제가 되는 것을 뜻하게 된다.

### Check

```sql
SQL> alter table member
  2  add constraint ck_sal check (sal between 5000 and 10000);
```

- ck_sal 이라는 이름으로 member 테이블의 sal을 5000 에서 10000 사이로 데이터를 제약조건을 건다.

```sql
SQL> insert into member values('jang5', '1111', '장동건 ' , '001', 10001, '서울', '010');
insert into member values('jang5', '1111', '장동건 ' , '001', 10001, '서울', '010')
*
ERROR at line 1:
ORA-02290: check constraint (SCOTT.CK_SAL) violated
```

- 만일 체크에 벗어난 범위를 입력받은다면, check contratint 오류가 발생한다.

```sql
SQL> insert into member values('kang', '1111', '장동건', '001', 5000, '부산', '010');

1 row created.

SQL> select * from member;

ID                                       PASS                                     NAME
                                             DEPTNO
SAL ADDR                                          TELNUM
---------------------------------------- ---------------------------------------- -----------
--------------------------------------- ---------------------------------------- ---------- -
--------------------------------------- ----------------------------------------
jang4                                    1111                                     장동건
                                             001                                           10
000 서울                                          010
kang                                     1111                                     장동건
                                             001                                            5
000 부산                                          010
jang                                     1111                                     장동건
                                             005                                           10
000 서울                                          010
alter table member
add constraint ck_addr check(addr in ('서울', '경기' ,'인천'));
```

### 제약조건 삭제하기

```sql
alter table member
drop constraint CK_ADDR;
```