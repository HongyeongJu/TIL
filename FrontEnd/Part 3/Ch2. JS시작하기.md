# ECMA스크립트

- javascript의 표준적인 이름, ES6, ES 2015

# 데이터 타입 확인

## console.log()

```jsx
console.log('Hello world');
```

- 콘솔창에 인수 내용을 출력한다.

## typeof ~~~

```jsx
console.log(typeof 'Hello world!');
console.log(typeof 123);
console.log(typeof true)
console.log(typeof undefined)   // 의도하지 않은 비어진 값
console.log(typeof null)    // 의도한 비어진 값
console.log(typeof {})
console.log(typeof [])
```

- ```의
  
  ```

## export default ~  (getType.js)

```jsx
// typeof 대신에 쓸 수 있는 함수 (왜냐하면 typeof가 뭉뜽그려서 object라고 표현했기 때문)
export default function getType(data){
  return Object.prototype.toString.call(data).slice(8, -1)
}
```

- export default function getType()은 함수를 밖으로 내보낸다는 뜻이고
- 내보낼때 getType.js에서 getType이라는 함수를 내보낼 수가 있다는 것이고  기본적으로 getType이라는 함수를 내보낸다는 뜻

```jsx
import getType from './getType'
```

- 이렇게 내보낸 함수를 위와 같이 import를 해서 사용할 수가 있다.
- import 함수명 from '자바스크립트 파일'
- 만약에 from 뒤에 경로를 적을 때 ./ 을 적지 않는다면, 컴퓨터는 node_modules 폴더에서 getType을 찾게된다.

# 산술,할당 연산자

## 산술연산자

```jsx
// 산술 연산자
console.log(1 + 2)
console.log(5 - 7)
console.log(3 * 4)
console.log(10 / 2)
console.log(7 % 5)
```

## 할당연산자

```jsx
// 할당 연산자

let a = 2
//a = a + 1
a -= 1

console.log(a)
```

## 비교, 논리 연산자

```jsx
// 비교 연산자

const a = 1
const b = 3

// 일치 연산자 (값이 일치하는 지 확인함)
// false
console.log(a === b)

function isEqual(x, y) {
  return x === y
}

// true
console.log(isEqual(1, 1))
// false
console.log(isEqual(2, '2'))
// 비교 연산자

const a = 1
const b = 1

// 불일치 연산자
// false
console.log(a !== b)
// 비교 연산자

const a = 1
const b = 7

// 불일치 연산자
// true
console.log(a < b)
// 비교 연산자

const a = 13
const b = 13

// 불일치 연산자
// true
console.log(a >= b)
```

## 논리연산자

```jsx
// 논리 연산자

const a =  1 === 1
const b = 'AB' === 'AB'
const c = true

// 3개 모두다 true
console.log(a)
console.log(b)
console.log(c)
// 논리 연산자

const a =  1 === 123
const b = 'AB' === 'ABC'
const c = false

// 3개 모두다 true
console.log(a)
console.log(b)
console.log(c)

// && 그리고 , And 연산자
console.log('&&: ', a && b && c)
console.log('&&: ' , a && c)

// 또는 연산자, Or 연산자
console.log('||: ' , a || b || c)

// 부정 연산자 , not 연산자
console.log('!: ' , !a)
```

## 삼항 연산자

```jsx
// 삼항 연산자

const a = 1 < 2

if (a) {
  console.log('참')
}else {
  console.log('거짓')
}

console.log(a ? '참' : '거짓')
```