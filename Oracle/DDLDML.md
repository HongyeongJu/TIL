

# DDL

## 1. 객체의 종류

- DBMS에서 관리되는 값들을 객체(DBMS에서 쓸 수 있는 기능을 표현해 놓은 것)
- 오라클의 모든 객체를 사용하기 위해서 정의해야 한다.

1. 테이블

   데이터를 저장하기 위한 객체

   기본저장구조

2. 시퀀스

   연속된 일련번호를 관리하는 객체

3. 뷰

   select문을 저장하기 위한 객체

4. 인덱스

   빠르게 검색되기 위해 사용되는 객체

## 2. DDL 명령어

### 1.create - 객체를 생성

```sql
SQL> create table member(
  2  id varchar2(20) primary key,
  3  pass varchar2(20),
  4  addr varchar2(20),
  5  point number(10),
  6  regDate date);
```

데이터 딕셔너리 : 오라클 내부에서 만들어주는 테이블

테이블 : 자신이 만든 테이블

### 2. alter - 객체의 구조를 변경

컬럼 추가 : alter table 테이블명 add (칼럼명)

```sql
SQL> alter table member
  2  add (tel varchar2(15), email varchar2(20));
```

칼럼 수정 : alter table 테이블명 modify (칼람명)

```sql
alter table member modify (tel varchar2(20));
```

칼럼 삭제 : alter table 테이블명 drop (칼럼명)

```sql
SQL> alter table member
  2  drop (tel, email);
```

### 3. drop - 객체를 삭제

```sql
SQL> drop table member;
```

### 4. rename - 객체의 이름을 변경

# DML



## 3. DML 명령어

- 명령문을 실행한 후 저장하기 위해서 commit을 해야 한다.

  ```sql
  SQL> create table member(
    2  id varchar2(20) primary key,
    3  pass varchar2(20),
    4  addr varchar2(20),
    5  state varchar2(20));
  기본 테이블
  ```

  ### 1. Inseart

  - 테이블에 레코드 삽입
  - 모든 컬럼에 값을 정의해야 하고 값이 없는 경우는 null이라고 명시

  [구문]

  insert into 테이블명 values (컬럼값1, 컬럼값2....)

  ```sql
  insert into member values('jang', '1234', '인천시', 'vip');
  ```

  insert into 테이블명 (컬럼명1, 컬럼명2 ...) values (값1, 값2...)

  ```sql
  insert into member values('lee', '1234', '인천시', null);
  ```

  ```sql
  insert into member(id, pass) values('kang', '3434');
  ```

  모든 insert 가 끝나면 commit을 해서 저장을 해주어야된다. 안해주면  rollback할때 예전에 했던것들도 다 사라짐.

  ```sql
  insert into member values('park', 'abcd', '춘천' , 'gold', sysdate);
  ```

  ### 2. Update

  - 레코드의 데이터를 변경
  - set절은 수정하고 싶은 컬럼과 컬럼값을 입력한다. 컬럼이 여러 개인 경우 콤마로 구분
  - where 절은 수정하고 싶은 레코드를 필터링할 조건을 정의
  - where 절을 추가하지 않으면 모든 컬럼이 변경된다.
  - where 절은 select문의 where절과 동일하게 작업

  [구문]

  update 테이블명

  set 컬럼명1 = 컬럼값, 컬럼명2 = 컬럼값2...

  where 조건

  ```sql
  update member
  set addr = '서울시';
  -> 이렇게하면 모든것이 다 서울시로 바뀐다.
  ```

  ```cpp
  rollback : 작업 취소
  ```

  ```sql
  update member
  set addr = '서울시'
  where addr is null or id = 'jang2';
  ```

  ### 3. Delete

  - 레코드 삭제
  - 조건을 주고 않으면 모든 레코드가 삭제

  [구문]

  delete [from] 테이블명

  where 조건

  ```cpp
  delete member
   where id = 'jang2';
  ```

[문제]

**1. 테이블생성하기**

- **테이블명(myemp)**
- **테이블구성하는 필드**

**empno : char(5)**

**ename: varchar2(10)**

**hiredate:date**

**sal : number(10)**

**memo : varchar2(10)**

```sql
create table myemp (
	empno char(5) primary key,
	ename varchar2(10),
	hiredate date,
	sal number(10),
	memo varchar2(10));
```

**2. 데이터입력하기**

**00001,scott,오늘날짜,3000,신입**

```sql
insert into myemp values('00001', 'scott', sysdate, 3000, '신입');
```

**3. 삽입된 데이터 저장하기**

```sql
commit;
```

**4. 전체 데이터 조회하기**

```sql
select * from myemp;
```

