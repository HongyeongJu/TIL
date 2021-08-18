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

## 조건문 If Else

```jsx
export default function random(){
  return Math.floor(Math.random() * 10)
}
```

- 이렇게 export default를 설정해서 다른 자바스크립트 파일에 이 함수를 사용할 수 있도록 만들 수가 있다.

```jsx
import random from './getRandom'

const a = random()

if( a=== 0){
  console.log('a is 0')
}else if(a  ===2){
  console.log('a is 2')
}else if(a === 4){
  console.log('a is 4')
}
else {
  console.log('rest....')
}
```

## 조건문 switch

```jsx
import random from './getRandom'

const a = random()

switch(a){
  case 0:
    console.log('a is 0')
    break
  case 2:
    console.log('a is 2')
    break
  case 4:
    console.log('a is 4')
    break
  default :
    console.log('rest...')
}
```

- if 문을 사용할 때 어떤 변수가 딱딱 정수로 떨어진다면 switch 문이 직관적으로 보일 수가 있다.

## 반복문

### index.html

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <script defer src="./main.js"></script>
</head>
<body>

  <h1>Hello world!</h1>
  <ul></ul>  
</body>
</html>
```

- script 태그가 html 전부 읽지 않고 실행하기 때문에 html 태그를 전부 읽고 실행하기 만들기 위해서 `defer` 속성을 사용하면 된다.

```jsx
// 바복문(For Statement)
// for

const ulEl = document.querySelector('ul')

for(let i = 0 ; i < 3; i+=1){
  const li =document.createElement('li')
  li.textContent = `list-${i + 1}`
  ulEl.appendChild(li)
}
```

- 위 코드는 ul 태그를 찾고  li 태그를 만들고 거기에 텍스트를 삽입한다음 ul의 자식으로 넣어주는 것을 보여주는 코드이다.

```jsx
// 바복문(For Statement)
// for

const ulEl = document.querySelector('ul')

for(let i = 0 ; i < 10; i+=1){
  const li =document.createElement('li')
  li.textContent = `list-${i + 1}`
  if((i + 1) % 2 === 0){
    li.addEventListener('click', function () {
      console.log(li.textContent)
    })
  }
  ulEl.appendChild(li)
}
```

## 변수 유효범위

- var, let, const 하지만 var라는 키워드는 최신 자바스크립트에서는 지양되는 요소이다.

```jsx
function scope(){
  if(true){
    const a = 123
    console.log(a)
  }
}

scope()
```

- 잘 작동됨.

```jsx
function scope(){
  if(true){
    const a = 123
  }
  console.log(a)
}

scope()
```

- a라는 변수가 선언이 안되었다는 문법오류 발생

```jsx
function scope(){
  // a라는 변수는 중괄호 안에서만 작동된다.
  if(true){
    console.log(a)
    const a = 123
  }
}

scope()
```

- 이럴 경우에는 a는 유효범위안에는 있지만, a를 초기화 하기전에 사용했으므로  undefined 가 출력이 된다.
- let과 const같은경우에는 블록 레벨의 유효범위를 가진다.
- var를 쓴다면 함수 레벨의 유효범위를 가지게 된다.

```jsx
function scope(){
  // a라는 변수는 중괄호 안에서만 작동된다.
  
  console.log(a)
  if(true){
    var a = 123
  }
}

scope()
```

- 따라서 위 코드에는 undefined 가 출력이 된다.

```jsx
function scope(){
  // a라는 변수는 중괄호 안에서만 작동된다.
  
  if(true){
    var a = 123
  }
  console.log(a)
}

scope()
```

- 이건 123을 출력한다.
- var는 함수 레벨 유효범위를 가지기 때문에 버그가 발생할 수가 있다. 따라서!! const,  let을 사용해서 구현하는것이 추천이 된다.

## 형변환 (Type conversion)

```jsx
// 형 변환

const a = 1
const b = '1'

// 동등 연산자 == 
// 동등 연산자 == 을 사용하면 형변환이 발생한다.
// 그래서 자바스크립트에서는 동등 연산자를 사용하면 안된다.
// 의도치 않은 버그가 발생할 수 있기 때문이다.
console.log(a == b)
```

→ 값은 true로 출력된다.

```jsx
// 형 변환

const a = 1
const b = '1'

// 동등 연산자 == 
// 동등 연산자 == 을 사용하면 형변환이 발생한다.
// 그래서 자바스크립트에서는 동등 연산자를 사용하면 안된다.
// 의도치 않은 버그가 발생할 수 있기 때문이다.
console.log(a === b)
```

→ 값은 false로 출력이 된다. === 일치연산자를 사용해야된다 js에선!!

```jsx
// Truthy(참 같은 값)
// true, {}, [], 1,2 , 'false', -12, '3.14' ...

// Falsy(거짓 같은 값)
// false, '', null, undefiened, 0, -0, NaN

if('false'){
  console.log(123)
}
```

: NaN ?? → 1 + undefined 일 때 출력이 된다.

숫자 데이터긴 한데 숫자가 아니다라는 뜻임.