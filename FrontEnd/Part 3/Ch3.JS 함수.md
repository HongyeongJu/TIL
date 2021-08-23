# 함수 복습

```jsx
// 함수 복습

function sum(x, y){
  console.log(x + y)
}

sum(1, 3)
sum(4, 12)
// 함수 복습

function sum(x, y){
  return x + y
}

const a = sum(1, 3)
const b = sum(4, 12)

console.log(a)
console.log(b)
console.log(a+b)
```

- 함수가 호출되는 횟수를 줄여주는 것이 중요하다.

```jsx
// 함수 복습

// 기명 함수!!
function sum1(x, y){
  return x + y
}

// 익명 함수를 만들어서 변수에 담아서 사용하는 함수 표현
const sum = function (x, y){
  console.log(x + y)
  return x + y
}
sum(1, 3)
```

- 기명 함수와 익명 함수는 작동 방법이 약간 다르다.

```jsx
// 함수 복습

function sum(x,y){
  if(x < 2){
    return    // undefined반환됨
  }
  return x + y
}

console.log(sum(1,3))
// 함수 복습

function sum(){
  console.log(arguments)
  // arguments라는 기호는 언제든지 함수안에서 사용할 수가 있다.
  return 
}

console.log(sum(1,3))
```

- arguments 라는 기호는 함수안에서 언제든지 사용이 가능하다. 때문에 매개변수로 입력을 받지 않아도 매개변수를 사용할 수가 있다.

```jsx
// 함수 복습

function sum(){
  console.log(arguments)
  // arguments라는 기호는 언제든지 함수안에서 사용할 수가 있다.
  return arguments[0] + arguments[1]
}

console.log(sum(7,3))
```

- 위 코드 처럼 매개변수의 종류가 많아서 어떤 매개변수를 넣어야할지 모르겠다 싶으면 argument를 사용해서 구현할 수가 있다.

## 화살표 함수

```jsx
// 화살표 함수

const double = function (x) {
  return x * 2
}

console.log('double: ', double(7))

const doubleArrow = (x) =>{
  return x * 2
}

console.log('doubleArrow', doubleArrow(7))
```

- 화살표 함수는 표현을 축약형으로 줄여나갈 수가 있다.

```jsx
const doubleArrow = (x) => x * 2
```

- 다음과 같이 화살표 함수를 축약형으로 표현이 가능하다.

```jsx
const doubleArrow = x => x * 2
```

- 만약에 매개변수 부분이 매개변수 1개만 있을 시에는 ()괄호를 생략 가능하다.

```jsx
const doubleArrow = x => { return x * 2}
```

- 만약 화살표 함수에서 중괄호를 씌운다면 return 이 없으면 반환이 안되기 때문에 return 을 무조건 사용해야된다.

```jsx
const doubleArrow = x => [1,2,3]
```

- 이런 식으로 데이터를 반환시킬 수가 있다.

```jsx
const doubleArrow = x => ({
  name : 'Heropy'
})
```

- 객체 데이터{} 를 반환하기 위해서는 소괄호로 한번 감싸줘야된다.

# 즉시 실행함수

- 즉시 실행할 수 있는 함수를 의미한다.

```jsx
// 즉시실행함수
// IIFE, Immediately-Invoked Function Expression

const a =7
function double(){
  console.log(a * 2)
}

double();

// 즉시 실행함수이다.
(function () {
  consoles.log(a * 2)
})()
```

- 즉시 실행함수를 만들기 위해서는 이름이 없는 함수 익명 함수를 만들고 그것을 소괄호로 묶는다. 그리고나서 뒤에 소괄호를 다시 묶으면 된다.
- 하지만 즉시 실행함수를 사용하면 브라우저에서 어디서부터 끝나는지 잘 모르기 때문에 `double` 처럼 ; 을 사용해야된다.

```jsx
// 즉시실행함수
// IIFE, Immediately-Invoked Function Expression

const a =7
function double(){
  console.log(a * 2)
}

double();

(function () {
  consoles.log(a * 2)
})();

(function () {
  consoles.log(a * 2)
}())
```

- 위와 같이 즉시실행 함수를 사용하면 된다.

# 호이스팅(Hoisting)

- 함수 선언부가 유효범위 최상단으로 끌어올려지는 현상

```jsx
// 호이스팅
// 함수 선언부가 유효범위 최상단으로 끌어올려지는 현상

const a = 7

double()

const double = function () {
  console.log(a * 2)
}
```

- 위와 같이 함수를 할당하기 전에 사용하면 오류가 발상한다.

```jsx
// 호이스팅
// 함수 선언부가 유효범위 최상단으로 끌어올려지는 현상

const a = 7

double()

function double() {
  console.log(a * 2)
}
```

- 하지만 함수 선언으로 만들게 된다면 함수 선언이 가장 최상단에 올라가서 만들어진다. 따라서 double이 사용이 되어진다.

# 타이머 함수

```jsx
// 타이머 함수
// setTimeout(함수, 시간): 일정 시간 후 함수 실행
// setinterval(함수, 시간): 시간 간격마다 함수 실행
// clearTimeout() :설정된 Timeout 함수를 종료
// clearInterval(): 설정된 Interval 함수를 종료

setTimeout(function() {
  console.log('Heropy!')
}, 3000)

setTimeout( () => {
  console.log('Heropy!')
}, 3000)
const timer = setTimeout( () => {
  console.log('Heropy!')
}, 3000)

const h1El = document.querySelector('h1')
h1El.addEventListener('click',()=> {
  clearTimeout(timer)
})
```

- 위 코드는 3초뒤에 콘솔이 출력이 되어지는데, h1 태그를 클릭하면 타이머함수를 종료 할 수 있도록 만든다.

```jsx
const timer = setInterval( () => {
  console.log('Heropy!')
}, 3000)

const h1El = document.querySelector('h1')
h1El.addEventListener('click',()=> {
  clearInterval(timer)
})
```

- setInterval함수는 각 시간이 지날때마다 함수를 출력해준다.

# 콜백(Callback)

- 함수의 인수로 사용되는 함수

```jsx
function timeout(callback){
  setTimeout(()=> {
    console.log('Heropy!')
    callback()
  }, 3000)
}
timeout(() => {
  console.log('Done!')
})
```

- callback 함수를 사용해서 timeout 함수 매개변수에 함수를 넣고 내부적으로 이 함수가 호출되기를 바라는 곳에서 실행시킬 수 있도록 만든다.
- 콜백은 실행 위치를 보장하는 것을 제공한다.