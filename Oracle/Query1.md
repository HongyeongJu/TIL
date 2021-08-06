# 목차

1. [SQL-DB](#SQL-DB)
2. [숫자함수](#숫자함수)
3. [날짜관련함수](!날짜관련함수)
4. [변환함수](!변환함수)
5. [Null 관련함수](#Null 관련함수)
6. [그룹함수](#그룹함수)

# SQL-DB

select 컬럼명, 컬럼명....

from 테이블명1, 테이블2

where 조건

order by 정렬할 컬럼명1 정렬기준,

```sql
// 접속 초기 설정
conn scott/tiger
set linesize 300
// 시스템 메니저로 접속하기
conn system/asc48547

// 사용자 생성
create user scott identified by tiger

// 세션변경
alter session set "_ORACLE_SCRIPT"=true;

// 권한 부여
grant connect, resource to scott;

// hr에 연결 부여
grant unlimited tablespace to hr

select concat(ename, concat('의 급여', concat(sal, '만원')))
from emp
where sal< 1000;
select ename, hiredate
from emp
where substr(hiredate,1,2) = 81;

////////////////////////////
select ename, hiredate
from emp
where hiredate like '81%';
select ename, job, lpad(sal, 5,'*')
from emp
where sal <= 2000;
select ename, job, itrim(lpad(sal, 5,'*'),'*') 비고
from emp
where sal <= 2000;
select empno, ename, lower(job), deptno
from emp
where ename = upper('scott');
////////////////////////////

select empno, ename, lower(job), deptno
from emp
where lower(ename) = 'scott';
18버전 오류 해결
conn system/asc48547
grant unlimited tablespace to SCOTT;  // 테이블 스페이스 를 설정해줘야됨 18버전에서는
select empno, ename, job, sal, deptno
from emp
where substr(ename, 1, 1) >'K' and
substr(ename, 1,1)< 'Y'
order by ename;
select deptno, ename, ltrim(job,'A') dd, ltrim(sal, 1) d
from emp
where deptno = 10;
```

# 숫자함수

- round(반올림할 숫자나 컬럼, 숫자) : 반올림 , 숫자에 양수, 0, 음수

```sql
select round(1128.4567,2) from dual;
ROUND(1128.4567,2)
------------------
           1128.46

SQL> select round(1128.4567,-2) from dual;

ROUND(1128.4567,-2)
-------------------
               1100

SQL> select round(1128.4567, 0) from dual;

ROUND(1128.4567,0)
------------------
              1128
```

- trunc(버림을 수행할 숫자나 컬럼, 숫자) :지정한 자리로 버림 숫자에 양숭 , 0, 음수

```sql
SQL> select round(1128.4567, 0) from dual;

ROUND(1128.4567,0)
------------------
              1128

SQL> select trunc(1128.4567,0) from dual;

TRUNC(1128.4567,0)
------------------
              1128

SQL> select trunc(1128.4567,-2) from dual;

TRUNC(1128.4567,-2)
-------------------
               1100
```

- mod(숫자1, 숫자2) :숫자1을 숫자2로 나눈 나머지

```sql
SQL> select mod(10, 3) from dual;

 MOD(10,3)
----------
         1
```

- abs(숫자나 컬럼) :절대값

```sql
SQL> select abs(-2), abs(2) from dual;

   ABS(-2)     ABS(2)
---------- ----------
         2          2
```

- ceil(숫자나 칼럼) : 주어진 값보다 큰 가장 최소값을 구하는 함수.

```sql
SQL> select ceil(1128.4567) from dual;

CEIL(1128.4567)
---------------
           1129
```

# 날짜관련함수

오라클에서 날짜는 연산이 가능

1970년 1월 1일이 기준 (ms제품은 1900/1/1기준)

- months_between(날짜1 , 날짜2)

날짜1과 날짜2사이의 경과한 개월의 수

날짜1이 최근날짜

```sql
SQL> select months_between('2021/1/1', '2021/8/2') from dual;

MONTHS_BETWEEN('2021/1/1','2021/8/2')
-------------------------------------
                           -7.0322581
SQL> select months_between('2021/8/2', '2021/1/1'), trunc(months_between('2021/8/2', '2021/1/1'),0) from dual;

MONTHS_BETWEEN('2021/8/2','2021/1/1') TRUNC(MONTHS_BETWEEN('2021/8/2','2021/1/1'),0)
------------------------------------- ----------------------------------------------
                           7.03225806                                              7

SQL> select ename, hiredate, sysdate, months_between(sysdate, hiredate),
  2  trunc(months_between(sysdate, hiredate),0) months
  3  from emp
  4  where deptno = 10;
ENAME                HIREDATE SYSDATE  MONTHS_BETWEEN(SYSDATE,HIREDATE)     MONTHS
-------------------- -------- -------- -------------------------------- ----------
CLARK                81/06/09 21/08/02                        481.78927        481
KING                 81/11/17 21/08/02                       476.531205        476
MILLER               82/01/23 21/08/02                       474.337657        474
```

- add_month(날짜1, 숫자)

: 날짜에 숫자개월을 더함

```sql
SQL> select sysdate, add_months(sysdate, 6) from dual;

SYSDATE  ADD_MONT
-------- --------
21/08/02 22/02/02

20부서의 사원들의 입사일로 부터 5개월 후의 날짜를 출력하기

SQL> select ename, add_months(hiredate, 5)
  2  from emp
  3  where deptno =20;

ENAME                ADD_MONT
-------------------- --------
SMITH                81/05/17
JONES                81/09/02
SCOTT                83/05/09
ADAMS                83/06/12
FORD                 82/05/03
```

- next_day(날짜, 요일번호)

:정의된 날짜 이후의 날짜데이터에서 지정한 요일에 해당되는 날짜

요일번호의 인덱스 범위는 1~7 (일요일~토요일) 까지이다.

- last_day(날짜)

```sql
SQL> select sysdate, next_day(sysdate,5), last_day(sysdate) from dual;

SYSDATE  NEXT_DAY LAST_DAY
-------- -------- --------
21/08/02 21/08/05 21/08/31

SQL> select sysdate, next_day(sysdate+5, 7), last_day(sysdate) from dual;

SYSDATE  NEXT_DAY LAST_DAY
-------- -------- --------
21/08/02 21/08/14 21/08/31
```

- sysdate, sysdate-5, sysdate + 5 ← sysdate : 오늘 날짜

# 변환함수

데이터타입을 변환할 때 사용하는 함수

number(숫자) → character(문자) - >date(날짜)

1. to_char

[숫자 - > 문자]

숫자 format을 나타낼때 사용 (특수문자를 사용해서 표시)

9,0 : 숫자

, : 콤마

. : 소수점

$, L : 통화기호

[날짜→ 문자]

날짜데이터를 문자열로 변환할 때 사용(특수문자를 사용해서 표시)

YYYY, YY→ 년도 데이터

MM : 월

DD : 일

DY : 요일

HH : 시간

MI : 분

SS : 초

```sql
SQL> select 789789, to_char(789789, '9.999') from dual;

    789789 TO_CHAR(7897
---------- ------------
    789789 ######

SQL> select 789789, to_char(sal, '9.999') from emp;

    789789 TO_CHAR(SAL,
---------- ------------
    789789 ######
    789789 ######
    789789 ######
    789789 ######
    789789 ######
    789789 ######
    789789 ######
    789789 ######
    789789 ######
    789789 ######
    789789 ######

    789789 TO_CHAR(SAL,
---------- ------------
    789789 ######
    789789 ######
    789789 ######

SQL> select sal, to_char(sal, '9.999'), to_char(sal, 'L9,999')
  2  from emp
  3  ;

       SAL TO_CHAR(SAL, TO_CHAR(SAL,'L9,999')
---------- ------------ --------------------------------
       800 ######                   ?800
      1600 ######                 ?1,600
      1250 ######                 ?1,250
      2975 ######                 ?2,975
      1250 ######                 ?1,250
      2850 ######                 ?2,850
      2450 ######                 ?2,450
      3000 ######                 ?3,000
      5000 ######                 ?5,000
      1500 ######                 ?1,500
      1100 ######                 ?1,100

       SAL TO_CHAR(SAL, TO_CHAR(SAL,'L9,999')
---------- ------------ --------------------------------
       950 ######                   ?950
      3000 ######                 ?3,000
      1300 ######                 ?1,300

SQL> select to_char(sysdate, 'YYYY'), to_char(sysdate, 'MM'), to_char(sysdate, 'DD') from dual;

TO_CHAR( TO_C TO_C
-------- ---- ----
2021     08   02
```

1. 문자→ 숫자

to_number

1. 문자 → 날짜

to_date

# Null 관련함수

- nvl(null이 있는 컬럼, 변경할 값)

null인 경우 치환할 값은 반드시 컬럼의 데이터타입과 일치해야 한다.

만약 다른 값을 넣고 싶으면 컬럼의 타입을 변경해야 한다.

null값을 특정 값으로 변환

- nvl2(컬럼, 값1, 값2)

null을 평가해서 null이면 값2를 null이 아니면 값1을 리턴 한다.

```sql
SQL> select ename, sal, nvl(comm, 0)
  2  from emp;

ENAME                       SAL NVL(COMM,0)
-------------------- ---------- -----------
SMITH                       800           0
ALLEN                      1600         300
WARD                       1250         500
JONES                      2975           0
MARTIN                     1250        1400
BLAKE                      2850           0
CLARK                      2450           0
SCOTT                      3000           0
KING                       5000           0
TURNER                     1500           0
ADAMS                      1100           0

ENAME                       SAL NVL(COMM,0)
-------------------- ---------- -----------
JAMES                       950           0
FORD                       3000           0
MILLER                     1300           0
SQL> select ename, sal, comm, sal * 12  + nvl(comm, 0) "salary"
  2  from emp;

ENAME                       SAL       COMM     salary
-------------------- ---------- ---------- ----------
SMITH                       800                  9600
ALLEN                      1600        300      19500
WARD                       1250        500      15500
JONES                      2975                 35700
MARTIN                     1250       1400      16400
BLAKE                      2850                 34200
CLARK                      2450                 29400
SCOTT                      3000                 36000
KING                       5000                 60000
TURNER                     1500          0      18000
ADAMS                      1100                 13200

ENAME                       SAL       COMM     salary
-------------------- ---------- ---------- ----------
JAMES                       950                 11400
FORD                       3000                 36000
MILLER                     1300                 15600
```

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bc7ffa42-d98d-4413-b20a-eaa0ded36e07/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bc7ffa42-d98d-4413-b20a-eaa0ded36e07/Untitled.png)

→ 컬람의 데이터 타입을 신경써야된다.

→ 그래서 comm의 데이터 타입을 char으로 바꿔준다.

```sql
SQL> select ename, sal, nvl(to_char(comm), '신입사원')
  2  from emp;

ENAME                       SAL NVL(TO_CHAR(COMM),'????')
-------------------- ---------- --------------------------
SMITH                       800 ????
ALLEN                      1600 300
WARD                       1250 500
JONES                      2975 ????
MARTIN                     1250 1400
BLAKE                      2850 ????
CLARK                      2450 ????
SCOTT                      3000 ????
KING                       5000 ????
TURNER                     1500 0
ADAMS                      1100 ????

ENAME                       SAL NVL(TO_CHAR(COMM),'????')
-------------------- ---------- --------------------------
JAMES                       950 ????
FORD                       3000 ????
MILLER                     1300 ????
SQL> select ename, sal, nvl2(to_char(comm), 'older', 'newbie')
  2  from emp;

ENAME                       SAL NVL2(TO_CHAR
-------------------- ---------- ------------
SMITH                       800 newbie
ALLEN                      1600 older
WARD                       1250 older
JONES                      2975 newbie
MARTIN                     1250 older
BLAKE                      2850 newbie
CLARK                      2450 newbie
SCOTT                      3000 newbie
KING                       5000 newbie
TURNER                     1500 older
ADAMS                      1100 newbie

ENAME                       SAL NVL2(TO_CHAR
-------------------- ---------- ------------
JAMES                       950 newbie
FORD                       3000 newbie
MILLER                     1300 newbie
```

# 그룹함수 

- 여러 레코드의 데이터를 묶어서 처리하는 방식
- 통계작업을 위해 사용
- 그룹함수를 이용해서 처리

------

- 여러 레코드를 묶어서 처리 즉, 그룹당 하나의 결과를 리턴하는 함수

------

[구문]

select 컬럼(group by에 정의한 컬럼명만) , 그룹함수.....

from 테이블명1, 테이블2....

where 조건

group by 컬럼명(그룹화 하고 싶은 기준)

having 그룹화된 데이터에 명시할 조건

order by 컬럼

[주의 사항]

- select문에는 일반 데이터조회 처럼 아무 컬럼이나 명시할 수 없다.
- group by에 명시한 컬럼만 정의할 수 있다.
- where절을 group by보다 먼저 실행하여 레코드를 그룹으로 나누기 전에 제외한다.
- group by 전에 조건을 적용해야 한다면 where절에 명시
- group by한 후에 만들어지는 결과에 조건을 적용해야 하면 where절에 명시하지 않고 having절에 추가해야 한다.

![image-20210806221518052](C:\Users\홍영주\AppData\Roaming\Typora\typora-user-images\image-20210806221518052.png)

```sql
SQL> select count(empno)
  2  from emp
  3  group by deptno;

COUNT(EMPNO)
------------
           6
           3
           5
-> 문제점 어떤 그룹을 사용한지 잘 모름...
-> 그래서 그룹명을 명시해 준다면 어떤 그룹이 몇명인지 집계를 할 수 있게 만듬
SQL> select deptno, count(empno)
  2  from emp
  3  group by deptno;

    DEPTNO COUNT(EMPNO)
---------- ------------
        30            6
        10            3
        20            5
SQL> select job, count(empno)
  2  from emp
  3  group by deptno;
select job, count(empno)
       *
1행에 오류:
ORA-00979: GROUP BY ???? ????.
-> job 을 하면 안된다..
SQL> select deptno, count(empno)
  2  from emp
  3  group by deptno
  4  order by deptno;

    DEPTNO COUNT(EMPNO)
---------- ------------
        10            3
        20            5
        30            6
SQL> select deptno, count(empno), sum(sal), avg(sal), max(sal), min(sal)
  2  from emp
  3  group by deptno;

    DEPTNO COUNT(EMPNO)   SUM(SAL)   AVG(SAL)   MAX(SAL)   MIN(SAL)
---------- ------------ ---------- ---------- ---------- ----------
        30            6       9400 1566.66667       2850        950
        10            3       8750 2916.66667       5000       1300
        20            5      10875       2175       3000        800
```

[실습]

직업별 인원수와 평균sal를 출력하세요..

```sql
select job, count(empno), avg(sal)
from emp
group by job;
```

1. HR 계정을 만들고
2. 사용된 sql 을 적용한다..

```sql
계정
alter session set "_ORACLE_SCRIPT"=true;create user hr identified by hrgrant connect, resource to scott;
SQL> select job, count(empno), avg(sal)
  2  from emp
  3  where job <> 'PRESIDENT'
  4  group by job;

-> PRESIDENT를 포함시키지 않도록 만들기

JOB                COUNT(EMPNO)   AVG(SAL)
------------------ ------------ ----------
CLERK                         4     1037.5
SALESMAN                      4       1400
ANALYST                       2       3000
MANAGER                       3 2758.33333
```

[실습]

입사월별로 인원수를 출력하세요. 단, sal이 5000이상인 사원은 제외

입사자 수가 1명인 월은 출력 제외

hint) 그룹화 : 입사월 (to_char)

```sql

```

![image-20210806221458465](C:\Users\홍영주\AppData\Roaming\Typora\typora-user-images\image-20210806221458465.png)

→ 그룹 함수는 where절에 절대로 사용할 수가 없다.

```sql
SQL> select to_char(hiredate, 'MM'), count(empno)
  2  from emp
  3  where sal>=5000 and count(empno) <> 1
  4  group by to_char(hiredate, 'MM')
  5  order by to_char(hiredate, 'MM');
where sal>=5000 and count(empno) <> 1
                    *
3행에 오류:
ORA-00934: ?? ??? ???? ????
SQL> select to_char(hiredate, 'MM'), count(empno)
  2  from emp
  3  where sal <5000
  4  group by to_char(hiredate, 'MM')
  5  having count(empno) > 1
  6  order by to_char(hiredate, 'MM');
```

[실습]

부서별로 최대급여, 최소급여를 출력하세요.

job이 PRESIDENT인 데이터는 제외하고

최대급여가 3000이상인 부서만 출력하세요.

부서별로 오름차순 정렬하기

```sql
system계정으로 접속하시구요
create user scott identified by tiger;grant connect,resource to scott

oraexam.sql copy & paste 해야되고

commit한다

그리고 select * from tab 해서 테이블 목록과 데이터 나오면 되고

그리고 다시 접속해서 system 계정으로 들어가서

alter user hr account unlock;

alter user hr identified by hr;

이렇게 하셔서 hr계정 접속하시구 데이터와 테이블 목록 확인하시면 완료입니다.
SQL> select deptno 부서 , max(sal) 최대급여, min(sal) 최소급여
  2  from emp
  3  where job<> 'PRESIDENT'
  4  group by deptno
  5  having max(sal)>=3000
  6  order by 부서;

      부서   최대급여   최소급여
---------- ---------- ----------
        20       3000        800
```

[select 문의 정의]

select → from→ where → group by→ having → order by

[select 문의 실행 순서]

from → where- > group by→ having → select →order by

group by 문제

1. 

```sql
SQL> select to_char(hire_date, 'MM') 월 , count(employee_id) 입사자수
  2  from employees
  3  group by to_char(hire_date, 'MM')
  4  order by to_char(hire_date, 'MM');
```

숙제1.

0번

```sql
SQL> select ename 사원이름 , nvl2(mgr, '담당', '상위자') 매니저번호
  2  from emp;
```

1번

```sql
select nvl(to_char(department_id), 'No Department') 부서번호, round(avg(salary),0) 평균급여
from employees
group by department_id
having round(avg(salary),0) >= 6000;
```

2번

```sql
select DEPARTMENT_ID, AVG(SALARY)
from employees
group by DEPARTMENT_ID
having avg(salary) >= 10000;
```

3번

```sql
select DEPARTMENT_ID , AVG(Salary)
from employees
group by DEPARTMENT_ID
order by AVG(SALARY) desc;
```

4번

```sql
select FIRST_NAME, LAST_NAME, SALARY, COMMISSION_PCT, (SALARY + COMMISSION_PCT) TOTAL
from employees
where COMMISSION_PCT IS NOT NULL
order by TOTAL DESC;
```