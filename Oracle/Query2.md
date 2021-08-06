# 목차

1. [관계형 데이터베이스](#관계형-데이터베이스)
2. [조인](#조인)





```sql
select department_id, avg(salary)
from employees
where department_id not in (40,50)
group by department_id
order by avg(salary) desc;
```

# 관계형 데이터베이스

오라클은 관계형 데이터베이스이다.

- 2차원 테이블로 데이터를 저장

- 관계형데이터베이스에서 테이블은 성격별로 각각 정의해서 관리

- 데이터의 무결성을 보장

- 데이터 처리를 위해서 SQL 문을 사용

- 테이블 설계시 정의할 수 있는 컬럼

  - 기본키(primary key) : 테이블에서 레코드를 구분하기 위해서 사용하는 키, 중복과 공백을                               허용하지 않는다.

  - 외래키(foreign key) : 기본키를 참조하는 키 ..

    ```
                                       테이블과 테이블의 관계를 나타내기 위해서 사용
    
                                  기본키에 정의되지 않은 값을 사용할 수 없다.
    ```

- 참조 무결성이 강화

- 테이블을 분리해서 설계 (테이블 정규화):

  ```
   하나의 테이블로 표현하기에 중복이 많이 발생하는 경우 두 개 이상의 테이블로 정의하여 관리한다.
  ```

- 

관계형 데이터베이스는 2차원 표(테이블)에 데이터를 표현한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3e4edbe6-dab7-4566-8b66-ee39d2741304/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3e4edbe6-dab7-4566-8b66-ee39d2741304/Untitled.png)

→ 이렇게 하니까 중복되는게 많아지고 공간의 낭비가 심해진다.

→ 이를 해결하기 위해서 데이터 베이스 정규화를 해야하는 필요성이 발생한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2764287f-d387-4c33-822c-77d424f1369c/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2764287f-d387-4c33-822c-77d424f1369c/Untitled.png)

주문테이블에 다 집어넣고 작업하던걸 , 주문에 관해 관리하는 테이블과 하나의 주문번호에 대해서 상세 내용을 정의하는 테이블을 나눠서 데이터를 저장한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4925b27f-0f76-48bd-b8cd-6395142ff13c/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4925b27f-0f76-48bd-b8cd-6395142ff13c/Untitled.png)

→ 부모테이블  : 기본키를 정의하고 있는 테이블

→ 자식테이블 : 부모의 기본키를 사용하고 있는 테이블

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/860e3489-853c-47b0-988d-dc9949b5042a/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/860e3489-853c-47b0-988d-dc9949b5042a/Untitled.png)

인사는 인사대로, 부서는 부서대로 정리했는데,

2개를 합쳐야되는 상황이다.

→ 부서에서 부서코드는 기본키이고 그 부서코드를 가져다 쓰는 인사 테이블에서는 외래키이다.

기본키 : 테이블을 만들 때 중복되지 않는 키가 기본키로 설정해야된다.

# 조인

[구문]

select 테이블명.컬럼명1, 테이블명.컬럼명2 ...

from 테이블명 1, 테이블명2.....

- 여러 테이블의 데이터를 조회하는 것을 조인이라고 부른다.
- 일반적인 경우 PK나 FK를 이용해서 조인한다.
- 관계형 데이터베이스에서 가장 기본적이고 중요하다.

1. 조인방법

- from 절에 조회하고 싶은 테이블을 모두 정의
- 컬럼명을 정의할 때 컬럼명의 모호성을 피하기 위해서 테이블 명을 표시한다.
- 보통은 테이블명은 alias로 정의한 후 사용
- 조인을 하는 경우 반드시 어떤 컬럼끼리 관계가 있는지 명시해야 한다. 즉 어떤 컬럼의 값을 기준으로 원하는 값을 찾아와야 하는지 알아야 적절한 데이터를 가져올 수 있다.
- 비교해야 하는 컬럼을 명사하는 것을 조인조건이라 한다.
- 조인조건은 where절에 정의한다.
- 일반적으로 조인조건은 pk테이블의 pk와 fk테이블의 fk키가 = 연산자로 처리
- 조인조건은 테이블이 N개이면 N-1개의 조건이 필요하다.
- 조언조건은 정의하지 않거나 잘못 정의하는 경우 어떻게 비교해야 할지 애매하므로 from절에 명시된 모든 테이블의 레코드를 조회해서 출력한다. 이름 카티션프로덕트(CARTESIAN PRODUCT)라한다.
- 조건이 1개 있다면 조인조건과 무조건 and조건으로 연결
- select절에 두 개 이상의 테이블의 칼럼을 표시하지 않는다고 하더라도 조건에 사용되면 조인조건을 명시해야 한다.  이때, 직접적으로 사용되지 않는 테이블도 조건을 위해 필요하다면 명시

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f17c080e-dab3-4180-9129-1236cf325e52/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f17c080e-dab3-4180-9129-1236cf325e52/Untitled.png)

→ 어떤 것을 비교해서 참조해서 가져와야 되는지 명시를 해놓지 않기 때문에 , 카티션 프로덕트가 실행됨

```cpp
SQL> select emp.empno, emp.ename, emp.deptno, dept.dname
  2  from emp, dept
  3  where emp.deptno = dept.deptno;

     EMPNO ENAME                    DEPTNO DNAME
---------- -------------------- ---------- ----------------------------
      7369 SMITH                        20 RESEARCH
      7499 ALLEN                        30 SALES
      7521 WARD                         30 SALES
      7566 JONES                        20 RESEARCH
      7654 MARTIN                       30 SALES
      7698 BLAKE                        30 SALES
      7782 CLARK                        10 ACCOUNTING
      7788 SCOTT                        20 RESEARCH
      7839 KING                         10 ACCOUNTING
      7844 TURNER                       30 SALES
      7876 ADAMS                        20 RESEARCH

     EMPNO ENAME                    DEPTNO DNAME
---------- -------------------- ---------- ----------------------------
      7900 JAMES                        30 SALES
      7902 FORD                         20 RESEARCH
      7934 MILLER                       10 ACCOUNTING
SQL> select e.empno, e.ename, e.deptno, d.dname
  2  from emp e, dept d
  3  where e.deptno = d.deptno;

     EMPNO ENAME                    DEPTNO DNAME
---------- -------------------- ---------- ----------------------------
      7369 SMITH                        20 RESEARCH
      7499 ALLEN                        30 SALES
      7521 WARD                         30 SALES
      7566 JONES                        20 RESEARCH
      7654 MARTIN                       30 SALES
      7698 BLAKE                        30 SALES
      7782 CLARK                        10 ACCOUNTING
      7788 SCOTT                        20 RESEARCH
      7839 KING                         10 ACCOUNTING
      7844 TURNER                       30 SALES
      7876 ADAMS                        20 RESEARCH

     EMPNO ENAME                    DEPTNO DNAME
---------- -------------------- ---------- ----------------------------
      7900 JAMES                        30 SALES
      7902 FORD                         20 RESEARCH
      7934 MILLER                       10 ACCOUNTING
```

[실습] sal가 2000이상인 사원의 사원번호와 부서명을 출력

```cpp
SQL> select e.empno, d.dname, e.sal
  2  from emp e, dept d
  3  where e.sal>= 2000 and
  4   e.deptno = d.deptno;

     EMPNO DNAME                               SAL
---------- ---------------------------- ----------
      7566 RESEARCH                           2975
      7698 SALES                              2850
      7782 ACCOUNTING                         2450
      7788 RESEARCH                           3000
      7839 ACCOUNTING                         5000
      7902 RESEARCH                           3000
```

[실습]

DALLAS에 근무하는 사원의 사원번호, 사원명, sal를 출력하세요.

```cpp
SQL> select e.empno, e.ename, e.sal
  2  from emp e, locations l
  3  where l.city = 'DALLAS'
  4  ;

     EMPNO ENAME                       SAL
---------- -------------------- ----------
      7369 SMITH                       800
      7499 ALLEN                      1600
      7521 WARD                       1250
      7566 JONES                      2975
      7654 MARTIN                     1250
      7698 BLAKE                      2850
      7782 CLARK                      2450
      7788 SCOTT                      3000
      7839 KING                       5000
      7844 TURNER                     1500
      7876 ADAMS                      1100

     EMPNO ENAME                       SAL
---------- -------------------- ----------
      7900 JAMES                       950
      7902 FORD                       3000
      7934 MILLER                     1300
```

→ loc비교할 것이 없기때문에 그냥 그대로출력이됨..

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/adacaae1-d34f-4b66-9302-4744db61bb64/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/adacaae1-d34f-4b66-9302-4744db61bb64/Untitled.png)

→deptno을 가지고 deptno을 찾고 그리고 loc_code를 찾아서 location의 loc_code에서 찾고 거기서 일치하는 city 정보를 가지고 작업을 해야된다.

```cpp
SQL> select e.empno, e.ename, e.sal
  2  from emp e, dept d, locations l
  3  where l.city = 'DALLAS'
  4        and e.deptno = d.deptno
  5        and d.loc_code = l.loc_code;

     EMPNO ENAME                       SAL
---------- -------------------- ----------
      7902 FORD                       3000
      7876 ADAMS                      1100
      7788 SCOTT                      3000
      7566 JONES                      2975
      7369 SMITH                       800
```

1. SALESMAN의 사원번호, 이름 , 급여, 부서명, 근무지코드를 조회

```cpp
select e.empno 사원번호, e.ename 이름, e.sal 급여, d.dname 부서명, d.loc_code 근무지코드
from emp e, dept d
where e.job = 'SALESMAN' and
         e.deptno = d.deptno;

사원번호 이름                       급여 부서명                       근무
---------- -------------------- ---------- ---------------------------- ----
      7844 TURNER                     1500 SALES                        C1
      7654 MARTIN                     1250 SALES                        C1
      7521 WARD                       1250 SALES                        C1
      7499 ALLEN                      1600 SALES                        C1
```

1. 사원이름,부서명, 급여, 근무도시명을 조회

```cpp
SQL> select e.ename 사원이름, d.dname 부서명, e.sal 급여 , l.city 근무도시명
  2  from emp e, dept d, locations l
  3  where e.deptno = d.deptno and
  4           d.loc_code = l.loc_code;

사원이름             부서명                             급여 근무도시명
-------------------- ---------------------------- ---------- ------------------------
SMITH                RESEARCH                            800 DALLAS
ALLEN                SALES                              1600 CHICAGO
WARD                 SALES                              1250 CHICAGO
JONES                RESEARCH                           2975 DALLAS
MARTIN               SALES                              1250 CHICAGO
BLAKE                SALES                              2850 CHICAGO
CLARK                ACCOUNTING                         2450 SEOUL
SCOTT                RESEARCH                           3000 DALLAS
KING                 ACCOUNTING                         5000 SEOUL
TURNER               SALES                              1500 CHICAGO
ADAMS                RESEARCH                           1100 DALLAS

사원이름             부서명                             급여 근무도시명
-------------------- ---------------------------- ---------- ------------------------
JAMES                SALES                               950 CHICAGO
FORD                 RESEARCH                           3000 DALLAS
MILLER               ACCOUNTING                         1300 SEOUL
```

1. DALLAS에 근무하는 사원중 급여 1500이상인 사원의 이름, 급여, 업무 , 입사일 , 보너스를 조회

```cpp
SQL> select e.ename 이름, e.sal 급여, e.job 업무, e.hiredate 입사일, e.comm 보너스
  2  from emp e, dept d, locations l
  3  where e.sal >= 1500 and
  4           e.deptno = d.deptno and
  5           d.loc_code = l.loc_code;

이름                       급여 업무               입사일       보너스
-------------------- ---------- ------------------ -------- ----------
ALLEN                      1600 SALESMAN           81/02/20        300
JONES                      2975 MANAGER            81/04/02
BLAKE                      2850 MANAGER            81/05/01
CLARK                      2450 MANAGER            81/06/09
SCOTT                      3000 ANALYST            82/12/09
KING                       5000 PRESIDENT          81/11/17
TURNER                     1500 SALESMAN           81/09/08          0
FORD                       3000 ANALYST            81/12/03
```

1. EMP 테이블과 DEPT 테이블에 있는 모든자료를 다음과 같이 조회합니다. 사원번호, 이름, 업무, emp 테이블의 부서번호, dept 테이블의 부서번호, 부서명을 조회

```sql
select e.empno 사원번호, e.ename 이름, e.job 업무, e.deptno emp부서번호, d.deptno dept부서번호, d.dname 부서명
from emp e, dept d
where e.deptno = d.deptno;

사원번호 이름                 업무               EMP부서번호 DEPT부서번호 부서명
---------- -------------------- ------------------ ----------- ------------ ----------------------------
      7369 SMITH                CLERK                       20           20 RESEARCH
      7499 ALLEN                SALESMAN                    30           30 SALES
      7521 WARD                 SALESMAN                    30           30 SALES
      7566 JONES                MANAGER                     20           20 RESEARCH
      7654 MARTIN               SALESMAN                    30           30 SALES
      7698 BLAKE                MANAGER                     30           30 SALES
      7782 CLARK                MANAGER                     10           10 ACCOUNTING
      7788 SCOTT                ANALYST                     20           20 RESEARCH
      7839 KING                 PRESIDENT                   10           10 ACCOUNTING
      7844 TURNER               SALESMAN                    30           30 SALES
      7876 ADAMS                CLERK                       20           20 RESEARCH

  사원번호 이름                 업무               EMP부서번호 DEPT부서번호 부서명
---------- -------------------- ------------------ ----------- ------------ ----------------------------
      7900 JAMES                CLERK                       30           30 SALES
      7902 FORD                 ANALYST                     20           20 RESEARCH
      7934 MILLER               CLERK                       10           10 ACCOUNTING

14 rows selected.
```

1. dept 테이블, locations 테이블을 이용하여 부서번호, 부서명, 해당부서의 city 정보를 조회

```sql
SQL> select d.deptno 부서번호, d.dname 부서명, l.city 도시정보
  2  from dept d, locations l
  3  where d.loc_code = l.loc_code;

  부서번호 부서명                       도시정보
---------- ---------------------------- ------------------------
        10 ACCOUNTING                   SEOUL
        20 RESEARCH                     DALLAS
        30 SALES                        CHICAGO
        40 OPERATIONS                   SEOUL
```

[실습]

부서별 인원수를 출력하세요. 단, 부서명과 인원수를 출력합니다.

```sql
SQL> select deptno, count(empno)
  2  from emp
  3  group by deptno;

    DEPTNO COUNT(EMPNO)
---------- ------------
        30            6
        20            5
        10            3
SQL> select d.dname, count(e.empno)
  2  from emp e, dept d
  3  where e.deptno = d.deptno
  4  group by d.dname;

DNAME                        COUNT(E.EMPNO)
---------------------------- --------------
ACCOUNTING                                3
RESEARCH                                  5
SALES                                     6
```

[실습] 도시별로 근무하는 직원의 인원수를 출력하세요.

city 인원수

```sql
select l.city 도시, count(e.empno)
from emp e, dept d, locations l
where e.deptno = d.deptno and
	d.loc_code = l.loc_code
group by l.city;

도시                     COUNT(E.EMPNO)
------------------------ --------------
CHICAGO                               6
SEOUL                                 3
DALLAS                                5
```

hr/hr

[실습] IT부서에서 일하는 직원의 first_name, last_name, salary를 출력하시오, 출력결과는 salary 가 낮은 사람부터 출력하세요. 전체 결과는 아래 수행결과처럼 하나의 문자열로 결합되어서 나와야 하며 전체 결과 하나의 컬럼으로 출력되도록 작성하세요.

```sql
select e.first_name || ' ' || e.last_name || '의 연봉은 ' || e.salary ||  ' 입니다.' 결과
from employees e, departments d
where e.department_id = d.department_id and
         d.department_name ='IT'
order by salary asc;

결과
------------------------------------------------
Diana Lorentz의 연봉은 4200 입니다.
David Austin의 연봉은 4800 입니다.
Valli Pataballa의 연봉은 4800 입니다.
Bruce Ernst의 연봉은 6000 입니다.
Alexander Hunold의 연봉은 9000 입니다.
```

각 사원(employee)에 대해서 사번(employee_id), 이름(first_name), 업무명(job_title), 부서명(department_name)를 조회하세요. 단 도시명(city)이 'Seattle'인 지역(location)의 부서(department)에 근무하는 직원만 출력하세요

```sql
select e.employee_id 사번, e.first_name 이름, j.job_title 업무명, d.department_name 부서명
from employees e, jobs j, departments d, locations l
where e.job_id = j.job_id and
	e.department_id = d.department_id and
	 d.location_id = l.location_id and
	l.city = 'Seattle';

사번 이름                                     업무명                                                                 부서명
----- ---------------------------------------- ---------------------------------------------------------------------- ------------------------------------------------------------
  100 Steven                                   President                                                              Executive
  102 Lex                                      Administration Vice President                                          Executive
  101 Neena                                    Administration Vice President                                          Executive
  200 Jennifer                                 Administration Assistant                                               Administration
  108 Nancy                                    Finance Manager                                                        Finance
  113 Luis                                     Accountant                                                             Finance
  112 Jose Manuel                              Accountant                                                             Finance
  111 Ismael                                   Accountant                                                             Finance
  110 John                                     Accountant                                                             Finance
  109 Daniel                                   Accountant                                                             Finance
  205 Shelley                                  Accounting Manager                                                     Accounting

 사번 이름                                     업무명                                                                 부서명
----- ---------------------------------------- ---------------------------------------------------------------------- ------------------------------------------------------------
  206 William                                  Public Accountant                                                      Accounting
  114 Den                                      Purchasing Manager                                                     Purchasing
  119 Karen                                    Purchasing Clerk                                                       Purchasing
  118 Guy                                      Purchasing Clerk                                                       Purchasing
  117 Sigal                                    Purchasing Clerk                                                       Purchasing
  116 Shelli                                   Purchasing Clerk                                                       Purchasing
  115 Alexander                                Purchasing Clerk                                                       Purchasing

ws selected.
```

[실습 ]

1. 각 직책 별(job_title)로 급여의 총합을 구하되 직책이 Representative 인 사람은 제외하십시오. 단, 급여 총합이 30000 초과인 직책만 나타내며, 급여 총합에 대한 오름차순으로 정렬하십시오. 출력 결과의 컬럼명은 아래 결과와 동일하게 주십시오.

로 정렬하십시오. 출력 결과의 컬럼명은 아래 결과와 동일하게 주십시오.

```sql
select j.job_title JOB, sum(e.salary) 급여
from employees e, jobs j
where e.job_id = j.job_id and
	j.job_title not like '%Representative'
group by j.job_title
having sum(e.salary) > 30000
order by sum(e.salary) asc;

JOB                                                                          급여
---------------------------------------------------------------------- ----------
Administration Vice President                                               34000
Stock Manager                                                               36400
Accountant                                                                  39600
Stock Clerk                                                                 55700
Sales Manager                                                               61000
Shipping Clerk                                                              64300
```

1. 각 부서 이름 별로 2005년 이전에 입사한 직원들의 인원수를 조회하시오.

**[출처]** [조인연습(hr계정)](https://blog.naver.com/heaves1/222455671085)|**작성자** [heaves1](https://blog.naver.com/heaves1)

```sql
SQL> select d.department_name, count(e.employee_id)
  2  from departments d, employees e
  3  where e.department_id = d.department_id and
  4  to_char(hire_date, 'YYYY') <= 2005
  5  group by d.department_name;

DEPARTMENT_NAME                                              COUNT(E.EMPLOYEE_ID)
------------------------------------------------------------ --------------------
Administration                                                                  1
Accounting                                                                      2
Purchasing                                                                      4
Human Resources                                                                 1
IT                                                                              1
Public Relations                                                                1
Executive                                                                       3
Shipping                                                                       19
Sales                                                                          15
Finance                                                                         4
Marketing                                                                       2
```

1. 사원수가 3명 이상의 사원을 포함하고 있는 부서의 부서번호(department_id), 부서이름(department_name), 사원 수, 최고급여, 최저급여, 평균급여, 급여총액을 조회하여 출력하십시오. 출력 결과는 부서에 속한 사원의 수가 많은 순서로 출력하고, 컬럼명은 아래 결과와 동일하게 출력하십시오. (평균급여 계산시 소수점 이하는 버리시오)

**[출처]** [조인연습(hr계정)](https://blog.naver.com/heaves1/222455671085)|**작성자** [heaves1](https://blog.naver.com/heaves1)

```sql
select d.department_id 부서번호,d.department_name 부서명,count(e.employee_id) 인원수, max(e.salary) 최고급여, min(e.salary) 최저급여, round(avg(e.salary),0) 평균급여, sum(e.salary) 급여총액
from employees e, departments d
where d.department_id = e.department_id
group by d.department_id, d.department_name
having count(e.employee_id) >=3
order by count(e.employee_id) desc;

부서번호 부서명                                                           인원수   최고급여   최저급여   평균급여   급여총액
---------- ------------------------------------------------------------ ---------- ---------- ---------- ---------- ----------
        50 Shipping                                                             45       8200       2100       3476     156400
        80 Sales                                                                34      14000       6100       8956     304500
       100 Finance                                                               6      12008       6900       8601      51608
        30 Purchasing                                                            6      11000       2500       4150      24900
        60 IT                                                                    5       9000       4200       5760      28800
        90 Executive                                                             3      24000      17000      19333      58000
```

→ group by 에 2개가 들어간다면, 대분류로 그룹화시키고 중분류로 또 그룹화 시키는 것을 의미한다.

```sql
SQL> select deptno, job, count(empno)
  2  from emp
  3  group by deptno, job
  4  order by deptno;

    DEPTNO JOB                COUNT(EMPNO)
---------- ------------------ ------------
        10 CLERK                         1
        10 MANAGER                       1
        10 PRESIDENT                     1
        20 ANALYST                       2
        20 CLERK                         2
        20 MANAGER                       1
        30 CLERK                         1
        30 MANAGER                       1
        30 SALESMAN                      4
```

→ 하지만 group by 에 들어가는 순서에 따라서 의미가 달라진다.

```sql
SQL> select job, deptno, count(empno)
  2  from emp
  3  group by job, deptno
  4  order by job;

JOB                    DEPTNO COUNT(EMPNO)
------------------ ---------- ------------
ANALYST                    20            2
CLERK                      10            1
CLERK                      20            2
CLERK                      30            1
MANAGER                    10            1
MANAGER                    20            1
MANAGER                    30            1
PRESIDENT                  10            1
SALESMAN                   30            4
```

→ Job으로 분류했다가, 나중에 deptno로 분류한다는 의미