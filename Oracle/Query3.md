# 목차

1. [서브쿼리](#서브쿼리)
   1. [개요](#개요)
   2. [서브쿼리의 종류](#서브쿼리의-종류)
   3. [다중 컬럼 서브쿼리](#다중-컬럼-서브쿼리)
   4. [상호 연관 서브쿼리](#상호-연관-서브쿼리)



# 서브쿼리

10번 부서의 평균 급여보다 급여가 많은 사원의 목록을 조회

```sql
SQL> select *
  2  from emp
  3  where sal > (select avg(sal)
  4  from emp
  5  where deptno = 10 );

     EMPNO ENAME                JOB                       MGR HIREDATE
---------- -------------------- ------------------ ---------- --------
       SAL       COMM     DEPTNO
---------- ---------- ----------
      7566 JONES                MANAGER                  7839 81/04/02
      2975                    20

      7788 SCOTT                ANALYST                  7566 82/12/09
      3000                    20

      7839 KING                 PRESIDENT                     81/11/17
      5000                    10

     EMPNO ENAME                JOB                       MGR HIREDATE
---------- -------------------- ------------------ ---------- --------
       SAL       COMM     DEPTNO
---------- ---------- ----------
      7902 FORD                 ANALYST                  7566 81/12/03
      3000                    20
```

SMITH와 같은 부서에 근무하는 사원의 목록을 조회

```sql
QL> select *
 2  from emp
 3  where deptno = (select deptno
 4  from emp
 5  where ename ='SMITH');

    EMPNO ENAME                JOB                       MGR HIREDATE
--------- -------------------- ------------------ ---------- --------
      SAL       COMM     DEPTNO
--------- ---------- ----------
     7369 SMITH                CLERK                    7902 80/12/17
      800                    20

     7566 JONES                MANAGER                  7839 81/04/02
     2975                    20

     7788 SCOTT                ANALYST                  7566 82/12/09
     3000                    20

    EMPNO ENAME                JOB                       MGR HIREDATE
--------- -------------------- ------------------ ---------- --------
      SAL       COMM     DEPTNO
--------- ---------- ----------
     7876 ADAMS                CLERK                    7788 83/01/12
     1100                    20

     7902 FORD                 ANALYST                  7566 81/12/03
     3000                    20
```

## 개요

- 쿼리 안에 포함된 쿼리를 의미
- select 문에 삽입된 select문을 의미
- 구문

select 컬럼명

from 테이블

where 컬럼명 연산자 ( select 컬럼명

from 테이블

where XXX)

- 서브쿼리는 ()를 삽입하여 작업하기
- 서브쿼리도 일반 쿼리 처럼 group by, join 모두 사용이 가능
- 서브쿼리는 메인쿼리(기본쿼리) 실행 전에 한번만 실행된다.
- where에 서브쿼리를 삽입하는 경우 비교조건의 오른쪽에 쿼리를 삽입
- 보통 서브쿼리의 결과가 행 하나 컬럼 하나인 경우가 대부분
- select from, where, having , group by절에 서브쿼리를 사용할 수 있다.
- insert 문, delete문, update문, select문 모두 서브쿼리를 사용할 수 있다.

[실습]

1. 7566번 사원보다 급여를 많이 받는 사원의 이름과 급여를 조회

```sql
SQL> select ename, sal
  2  from emp
  3  where sal > (select sal
  4  from emp
  5  where empno = 7566);

ENAME                       SAL
-------------------- ----------
SCOTT                      3000
KING                       5000
FORD                       3000
```

[문제]

1. 이름에 'T'를 포함하고 있는 사원과 같은 부서에서 근무하는 사원의 이름과 사원번호 출력

```sql
select ename, empno
from emp
where deptno in (select deptno
		from emp
		where ename like '%T%');

->
select ename, empno
from emp
where deptno in (20, 30);
```

1. 20번 부서의 최고 급여보다 급여가 많은 사원들의 사원명, 부서코드, 급여 목록 출력하기

```sql
SQL> select ename, deptno, sal
  2  from emp
  3  where sal > (select max(sal)
  4  from emp
  5  where deptno = 20);

ENAME                    DEPTNO        SAL
-------------------- ---------- ----------
KING                         10       5000
```

1. 1982년에 입사한 직원의 평균 급여보다 급여가 높은 사원들의 사원명, 입사일, 급여의 목록을  출력하기

```sql
SQL> select ename, hiredate, sal
  2  from emp
  3  where sal > (select avg(sal)
  4      from emp
  5      where to_char(hiredate, 'YYYY')= 1982);

ENAME                HIREDATE        SAL
-------------------- -------- ----------
JONES                81/04/02       2975
BLAKE                81/05/01       2850
CLARK                81/06/09       2450
SCOTT                82/12/09       3000
KING                 81/11/17       5000
FORD                 81/12/03       3000
```

### 서브쿼리의 종류

1. 단일행서브쿼리

- 서브쿼리의 결과가 1행 1열인 쿼리

1. 다중행 서브쿼리

- 서브쿼리의 결과가 다중 행인 경우

- 비교연산자를 사용할 수 없다. (비교연산자도 any나 all과 함께 사용)

- in, any, all

  ```
  ① in
  ```

  괄호안의 값과 일치하는 결과가 반영

```sql
select ename, empno
from emp
where deptno in (select deptno
		from emp
		where ename like '%T%');
```

② any (비교연산자랑 같이 사용해야됨) (or)의 개념

< any  : 최대값보다 작은 값을 조회

```sql
SQL> select ename, sal
  2  from emp
  3  where sal < any(800, 1250, 1600);

ENAME                       SAL
-------------------- ----------
SMITH                       800
WARD                       1250
MARTIN                     1250
TURNER                     1500
ADAMS                      1100
JAMES                       950
MILLER                     1300
```

> any  : 최소값보다 큰 값을 조회

```sql
SQL>  select ename, sal
  2   from emp
  3   where sal > any(800, 1250, 1600);

ENAME                       SAL
-------------------- ----------
ALLEN                      1600
WARD                       1250
JONES                      2975
MARTIN                     1250
BLAKE                      2850
CLARK                      2450
SCOTT                      3000
KING                       5000
TURNER                     1500
ADAMS                      1100
JAMES                       950

ENAME                       SAL
-------------------- ----------
FORD                       3000
MILLER                     1300
```

③ all  (비교연산자랑 같이 사용해야됨)  (and)의 개념

< all - 최소값보다 작은 것을 조회

```sql
SQL> select ename, sal
  2  from emp
  3  where sal < all(800, 1250, 1600);

no rows selected
```

> all - 최대값보다 큰 값을 조회

```sql
select ename, sal
 from emp
 where sal > all(800, 1250, 1600);

ENAME                       SAL
-------------------- ----------
JONES                      2975
BLAKE                      2850
CLARK                      2450
SCOTT                      3000
KING                       5000
FORD                       3000
```

[실습]

각 부서에서 최소 급여를 받는 사용자의 사원번호, 부서번호, 급여를 출력

```sql
select empno, deptno, sal
from emp
where sal in (select min(sal)
	    from emp
	    group by deptno);
- > 오류발생  (1300이 2개가 있을 경우 1300을 2개나 반환하게됨)
XXX -> 3번의 다중 컬럼 서브쿼리로 해야됨
EMPNO     DEPTNO        SAL
---------- ---------- ----------
      7369         20        800
      7900         30        950
      7934         10       1300
```

→ 해결방법 다중 컬럼 서브쿼리

### 다중 컬럼 서브쿼리

두 개 이상의 컬럼을 리턴하는 서브쿼리를 의미

where (컬럼1, 컬럼2 ....) in (비교할 값1, 비교할 값2....)

```sql
select deptno, ename, sal
from emp
where (deptno, sal) in (select deptno, min(sal)
			from emp
			group by deptno);
```

### 상호 연관 서브쿼리

- 서브쿼리를 실행할 때 메인쿼리 테이블의 컬럼을 참조해서 작업해야하는 서브쿼리
- 서브쿼리의 비교 값이 계속 바뀌는 경우 메인의 값을 참조해서 사용

------

```
      각각의 행에 입력된 값에 따라 결과가 달라지는경우
```

- 메인쿼리의 테이블에 alias를 추가하고 참조해서 사용한다.
- 메인쿼리의 한row에 대해서 서브쿼리가 한번씩 실행된다.
- 서브쿼리에서는 메인쿼리의 컬럼을 사용할 수 있으나 메인쿼리에서는 서브쿼리의 컬럼을 사용할 수 없다.

[실행흐름]

1. 메인쿼리에서 참조할 값을 가져온다.
2. 메인쿼리에서 참조할 값을 이용해서 서브쿼리 실행한다.
3. 서브쿼리의 결과를 이용해서 메인쿼리를 실행
4. 1번부터 3번까지를 전체 레코드에 반복해서 실행한다.

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/de90176a-e910-4c22-a93b-f59bc30fbf8f/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/de90176a-e910-4c22-a93b-f59bc30fbf8f/Untitled.png)

[실습]

sal가 본인 부서의 평균 급여보다 많이 사원의 사원번호, 사원명, 부서번호 ,sal

```sql
select empno, ename, deptno, sal
from emp outer
where sal > (select avg(sal)
 	    from emp
	    where deptno =outer.deptno);
```

[문제]

**1. Employees 테이블에서 입사일자(hire_date)에 따라 2005년 입사한 직원들 가운데 first_name이 'Lisa'인 직원보다 빨리 입사한 직원의 사번(employee_id), 이름(first_name), 성(last_name), 입사일자(hire_date)를 조회하는 SQL 문장을 작성하시오.**

**단, <실행 결과>처럼 first_name과 하나의 공백(space bar), last_name 은 name 이라는 컬럼명으로 출력되도록 합니다.**

```sql
select employee_id 사번, first_name 이름, last_name 성, hire_date 입사일자
from employees
where to_char(hire_date, 'YYYY') = '2005' and
     hire_date < (select hire_date 
	from employees
	where first_name = 'Lisa');
```

------

**2.Sales’부서에 속한 직원의 이름(first_name), 급여(salary), 부서이름(department_name)을 조회하시오. 단, 급여는 100번 부서의 평균보다 적게 받는 직원 정보만 출력되어야 합니다.**

```sql
select e.first_name 이름, e.salary 급여, d.department_name 부서이름
from employees e, departments d
where e.department_id = d.department_id and
	d.department_name like '%Sales%' and
	e.salary <= (select avg(salary) 
		from employees
		where department_id ='100');
```

------

**3. De Haan 사원의 관리자 사원번호, 이름(last_name), 입사일 및 급여를 표시하는 SQL문을 작성하십시오.alias를 포함하여 실행결과와 동일하게 출력되어야 합니다.**

```sql
select employee_id 사원번호 , last_name 이름, hire_date 입사일, salary 급여
from employees e
where employee_id= (select manager_id
		from employees
		where last_name = 'De Haan');
```

[문제]

1. 부서 이름(department_name) 별 직원들의 평균연봉(salary) 을 조회하시오.단,'30번’ 부서의 직원 평균 연봉보다 평균 연봉이 이하인 부서 정보만 출력되어야 합니다.

![https://blogfiles.pstatic.net/20150713_95/heaves1_1436763908715hLnhF_PNG/test.png](https://blogfiles.pstatic.net/20150713_95/heaves1_1436763908715hLnhF_PNG/test.png)

------

```sql
select d.department_name , avg(e.salary)
from employees e, departments d
where e.department_id = d.department_id 
group by d.department_name
having avg(e.salary) <= (select avg(salary)
			from employees
			where department_id = 30
			);
DEPARTMENT_NAME                                              AVG(E.SALARY)
------------------------------------------------------------ -------------
Purchasing                                                            4150
Shipping                                                        3475.55556
```

2.각 부서(department_id)별로 최고 연봉(salary)를 받는 사원의 사번(employee_id), 성(last_name)과 연봉(salary)을 조회하시오. 단 조회결과는 연봉의 내림차순으로 정렬되어 나타나야 합니다.

![https://blogfiles.pstatic.net/20150713_72/heaves1_1436764155096xzIOr_PNG/test.png](https://blogfiles.pstatic.net/20150713_72/heaves1_1436764155096xzIOr_PNG/test.png)

------

```sql
select employee_id, last_name, salary , department_id
from employees
where (department_id , salary) in (select department_id, max(salary)
		from employees
		group by department_id)
order by salary desc;
```

------

1. 업무명(job_title)이 ‘Sales Representative’인 직원 중에서 연봉(salary)이 9,000 이상, 10,000 이하인 직원들의 이름(first_name), 성(last_name)과 연봉(salary)을 출력하시오

![https://blogfiles.pstatic.net/20150713_18/heaves1_1436764015849iywpU_PNG/test.png](https://blogfiles.pstatic.net/20150713_18/heaves1_1436764015849iywpU_PNG/test.png)

```sql
select e.first_name, e.last_name, e.salary
from employees e, jobs j
where e.job_id = j.job_id and
	j.job_title ='Sales Representative' and
	e.salary between 9000 and 10000;
```