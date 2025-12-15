SELECT * FROM emp;

SELECT empno, ename, deptno FROM emp;

SELECT 
 sal,
 ename,
123,
'김소유'
FROM emp;

SELECT empno, deptno FROM EMP;

SELECT deptno FROM EMP;

SELECT DISTINCT deptno FROM EMP;
SELECT DISTINCT job FROM EMP;

SELECT ename, sal, sal*12+comm, comm FROM emp;

SELECT ename, sal, sal*12+comm AS annsal, comm FROM emp;
SELECT ename, sal, sal*12+comm "ann sal", comm FROM emp;
SELECT ename, sal, sal*12+comm annsal, comm FROM emp;

SELECT ename name FROM emp;
SELECT ename AS name FROM emp;

SELECT * FROM emp 
ORDER BY sal;

SELECT * FROM emp 
ORDER BY sal desc;

SELECT * FROM emp 
ORDER BY empno desc;

SELECT * FROM emp 
ORDER BY deptno,SAL,empno;

SELECT * FROM emp 
ORDER BY deptno asc,SAL desc,empno;

SELECT DISTINCT job FROM EMP;
order BY sal;

SELECT empno employee_no, ename employee_name FROM EMP
ORDER BY deptno desc,ename asc;

SELECT * FROM emp
WHERE deptno = 30;

SELECT * FROM emp
WHERE deptno = 30
AND job = 'SALESMAN';

SELECT * FROM emp
WHERE empno = 7499
AND deptno = '30';

SELECT * FROM emp
WHERE MGR = 7839
AND deptno = '20';


SELECT * FROM emp 
WHERE deptno = 30
OR job = 'CLERK';

--한줄 주석
 
/* 범위주석 
 바보는 내가 아니다
 *나는 천재다
 *나는 할수 있다 
 *나는 천재다
 *나는 컴터 천재다
 *난 개발자가 될꺼다 
 *해보자*/*/
 
SELECT * FROM EMP
WHERE sal >= 3000;

SELECT * FROM EMP
WHERE sal >= 2500
AND job = 'ANALYST';
 
select * FROM emp 
WHERE sal != 3000;

select * FROM emp 
WHERE sal <> 3000;

SELECT * FROM EMP 
WHERE NOT sal <= 3000;

--문제--
--1번문제 / 급여가 1500이상이고 3000미만인 사원을 출력
SELECT *FROM EMP
WHERE sal < 3000
and sal >= 1500;

--2번 문제 잡이 클럭이거나 급여가 2000초과 이면서 부서번호 10번인 사원 
SELECT * FROM emp 
WHERE job = 'CLERK'
or (sal > 2000
AND deptno= 10);

--3번 문제 
SELECT * FROM EMP
WHERE deptno IN(20,10);

--4번 문제 
SELECT * FROM emp
WHERE (deptno = 20 OR deptno = 30)
AND (sal >=2000 AND sal <= 3000)
ORDER BY sal ASC, ename;

--10.20번 부서가 아닌 부서를 보고 싶을떄 
SELECT * FROM EMP
WHERE deptno NOT IN(20,10);

--2000이상. 3000이하 비트윈앤드는 미만, 초과은 표현할수 없다.
SELECT * FROM emp
WHERE sal BETWEEN 2000 AND 3000;

SELECT * FROM emp
WHERE sal NOT BETWEEN 2000 AND 3000;

SELECT * FROM emp
WHERE sal NOT BETWEEN 2000 AND 3000
AND deptno =30;

SELECT * FROM EMP
WHERE ename like'S%';

SELECT * from EMP
WHERE ename LIKE '%N';

SELECT * FROM EMP
WHERE ename LIKE '_L%';

SELECT * FROM emp
WHERE ename LIKE '______';

SELECT * FROM emp
WHERE ename LIKE '%AM%';

SELECT * FROM emp
WHERE ename NOT LIKE '%AM%';

SELECT * FROM emp
WHERE ename LIKE '%A%S%';

SELECT comm FROM emp;

SELECT *FROM emp
WHERE comm = NULL;

SELECT *FROM emp
WHERE comm = NULL;

SELECT *FROM emp
WHERE comm Is not NULL;

SELECT *FROM emp
WHERE mgr Is not NULL;

SELECT mgr FROM emp; 

SELECT * FROM emp
WHERE (sal BETWEEN 100 AND 2000);

SELECT sal FROM emp ;

SELECT * FROM emp;

SELECT job FROM emp;

SELECT job FROM emp

SELECT * FROM emp;

SELECT * FROM emp WHERE deptno = 10;--3명
SELECT * FROM emp WHERE deptno = 20;--5명

UNION
SELECT * FROM EMP WHERE deptno = 20;

SELECT empno, ename, sal, deptno
FROM EMP
WHERE deptno = 10
UNION 
SELECT sal, job, deptno, sal
FROM EMP
WHERE deptno = 20;

SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno = 10
UNION 
SELECT empno, ename, sal, deptno
FROM EMP
WHERE deptno = 10;

SELECT empno, ename, sal, deptno
FROM emp
WHERE deptno = 10
UNION ALL 
SELECT empno, ename, sal, deptno
FROM EMP
WHERE deptno = 10;

SELECT * --q1
FROM EMP
WHERE ename LIKE '%S' ;

SELECT empno, ename, job, sal, deptno --Q2
FROM emp
WHERE job LIKE 'SALESMAN' ;

SELECT empno, ename, job, sal, deptno --Q3-1
FROM EMP
WHERE DEPTNO = 20 AND SAL > 2000
UNION 
SELECT empno, ename, job, sal, deptno
FROM EMP
WHERE DEPTNO = 30 AND SAL > 2000 ;

SELECT empno, ename, job, sal, deptno --Q3-1
FROM EMP
WHERE DEPTNO = 20 AND SAL > 2000
UNION ALL
SELECT empno, ename, job, sal, deptno
FROM EMP
WHERE DEPTNO = 30 AND SAL > 2000 ;

SELECT * --Q4
FROM EMP
WHERE SAL < 2000 OR SAL > 3000 ;

SELECT ENAME, EMPNO, SAL, DEPTNO --Q5
FROM EMP
WHERE ENAME LIKE '%E%' AND DEPTNO = 30 AND SAL NOT BETWEEN 1000 AND 2000 ;

SELECT * --Q6
FROM EMP
WHERE COMM IS NULL AND MGR IS NOT NULL
AND (JOB = 'MANAGER' OR JOB = 'CLERK')
AND ENAME NOT LIKE '_L%' ;

