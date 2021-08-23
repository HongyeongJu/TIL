# 생성자 함수(prototype)

```jsx
const heropy = {
  // 속성
  firstName : 'Heropy',
  lastName : 'Park',
  // 메소드
  getFullName : function() {
    return `${this.firstName} ${this.lastName}`
  }
}
console.log(heropy);
```

- 위는 하나의 객체이다.
- firstName, lastName 은 속성이라고 부른다.
- getFullName은 메소드이다.

```jsx
const heropy = {
  // 속성
  firstName : 'Heropy',
  lastName : 'Park',
  // 메소드 
  getFullName : function() {
    return `${this.firstName} ${this.lastName}`
  }
}
console.log(heropy.getFullName());
// 다음과같이 메소드를 호출할 수가 있다.
```

- 변수를 선언하는 것과 다르게 : ← 를 사용한다.
- 하지만 이렇게 메소드를 선언하면 객체가 new로 생성될 때 메소드 중복 낭비가 될 수가 있다.

```jsx
const heropy = {
  // 속성
  firstName : 'Heropy',
  lastName : 'Park',
  // 메소드
  getFullName : function() {
    return `${this.firstName} ${this.lastName}`
  }
}
console.log(heropy.getFullName());

const amy = {
  firstName : 'Amy',
  lastName : 'Clarke',
  getFullName : function() {
    return `${this.firstName} ${this.lastName}`
  }
}
console.log(amy.getFullName())

const neo = {
  firstName: 'Neo',
  lastName : 'Smith',
  getFullName : function() {
    return `${this.firstName} ${this.lastName}`
  }
}
console.log(neo.getFullName())
```

- 다음과 같이 객체를 만들 때 같은 내용인데 반복된다. 이것들을 해결하기 위해서 클래스개념을 사용한다.

```jsx
function user(first, last) {
  this.firstName = first
  this.lastName = last

}

const heropy = new user('Heropy', 'Park')

console.log(heropy)
```

- 위 코드를 보면 function으로 클래스를 정의하고 new user()를 통해서 새로운 객체를 만드는 것을 알 수가 있다.

```jsx
const heropy = {} // 리터럴 방식
```

- 위와 같이 객체를 만드는 방식은 리터럴 방식이라고 한다.

```jsx
function user(first, last) {
  this.firstName = first
  this.lastName = last
  
}

// user : 생성자 함수
const heropy = new user('Heropy', 'Park')
const amy = new user('Amy', 'Clarke')
const neo = new user('Neo', 'Smith')

console.log(heropy)
console.log(amy)
console.log(neo)
```

- 위와 코드에서는 new로 생성된 heropy, amy, neo등을 인스턴스라고 부른다.

```jsx
function user(first, last) {
  this.firstName = first
  this.lastName = last
  
}
user.prototype.getFullName = function(){
  return `${this.firstName} ${this.lastName}`
}

// user : 생성자 함수
const heropy = new user('Heropy', 'Park')
const amy = new user('Amy', 'Clarke')
const neo = new user('Neo', 'Smith')

console.log(heropy.getFullName())
console.log(amy)
console.log(neo.getFullName())
```

- prototype이라는 키워드를 사용해서 메소드를 정의할 수가 있다.
- 왜 prototype을 사용하는가? function user() 함수에서 각각 new를 사용해서 객체를 만든다면, 따로 따로 메모리에 새로 생성해서 메모리를 사용하지만,  getFullName이라는 메소드는 작동하는 방식이 똑같기때문에 새롭게 메모리에 적재할 필요가 없다. 따라서 prototype을 사용해서 메소드를 구현한다.
- 자바스크립트는 prototype  기반의 언어이다..

```jsx
const a = [1,2,3]

a.includes(2) = > true
```

- 위와 같은 배열에도 prototype 객체가 숨어있다.

```jsx
// 생성자 함수의 이름을 파스칼 케이스로 적어둔다.
function User(first, last) {
  this.firstName = first
  this.lastName = last
  
}
User.prototype.getFullName = function(){
  return `${this.firstName} ${this.lastName}`
}

// user : 생성자 함수
const heropy = new User('Heropy', 'Park')
const amy = new User('Amy', 'Clarke')
const neo = new User('Neo', 'Smith')

console.log(heropy.getFullName())
console.log(amy)
console.log(neo.getFullName())
```

- 생성자 함수의 이름은 파스칼 케이스로 적어둔다 (카멜 케이스가 아니라)

# This

```jsx
// this
// 일반(Normal) 함수는 호출 위치에서 따라 this 정의!
// 화살표(Arrow) 함수는 자신이 선언된 함수 범위에서 this 정의!

const heropy = {
  name : 'Heropy',
  normal : function() {
    console.log(this.name)
  },
  arrow: () => {
    console.log(this.name)
  }
}

heropy.normal()
heropy.arrow()
```

- 일반(Normal) 함수는 호출 위치에 따라 this를 정의한다.
- 화살표(Arrow) 함수는 자신이 선언된 함수 범위에서 this를 정의한다.
- 위 코드의 결과는 normal() 함수는 Heropy가 잘 출력이되는데, arrow() 에서는 undefined 가 호출된다.  이유는 normal 같은 경우 this는 현재 heropy를 가리키지만, arrow의 경우는 this가 어느 것인지 모르기 때문이다.

```jsx
const amy = {
  name : 'Amy',
  // 함수를 할당한다.
  normal : heropy.normal,
  arrow : heropy.arrow
}

amy.normal()
amy.arrow()
```

- 의 출력 결과는 Amy, Undefined가 출력이된다.

```jsx
// this
// 일반(Normal) 함수는 호출 위치에 따라 this 정의
// 화살표(Arrow) 함수는 자신이 선언된 함수 범위에서 this 정의!

// 파스칼 케이스로 작성된건 생성자 함수이다.
function User(name){
  this.name = name
}

// normal이라는 메소드를 만든다.
User.prototype.normal = function() {
  console.log(this.name)
}

User.prototype.arrow = () => {
  console.log(this.name)
}

const heropy = new User('Heropy')

// this는 heropy를 의미
heropy.normal()
heropy.arrow()
```

- 여기서 결과같은 heropy, Undefined 이다.

```jsx
// this
// 일반(Normal) 함수는 호출 위치에 따라 this 정의
// 화살표(Arrow) 함수는 자신이 선언된 함수 범위에서 this 정의!

const timer ={
  name : 'Heropy!!',
  timeout: function() {
    // 타이머 함수를 실행하려고함.
    // 여기서의 this는 호출 위치가 function()으로써
    // 불리는 것이기 때문이 undefined가 출력이된다.
    setTimeout(function () {
      console.log(this.name)
    }, 2000)
  }
}

timer.timeout()
```

- 여기서 결과 값은 undefined이다. 왜냐하면 여기서의 this가 호출되는 곳은 setTimeout에서 호출되기 때문에 여기서 this가 정의가 되지 않는다..

```jsx
// this
// 일반(Normal) 함수는 호출 위치에 따라 this 정의
// 화살표(Arrow) 함수는 자신이 선언된 함수 범위에서 this 정의!

const timer ={
  name : 'Heropy!!',
  timeout: function() {
    // 타이머 함수를 실행하려고함.
    // 여기서의 this는 호출 위치가 function()으로써
    // 불리는 것이기 때문이 undefined가 출력이된다.
    setTimeout( ()=> {
      console.log(this.name)
    }, 2000)
  }
}

timer.timeout()
```

- 여기서 출력 결과는 Heropy로 잘 출력이 되어진다.
- 여기서 this는 자신이 선언된 함수 범위 즉 timeout을 가지는 timer 가 되고 timer.name으로 Heropy가 출력이 된다.

# ES6 Classes

```jsx
// ES6 Classes

const heropy = {
  name: 'Heropy',
  normal() {
    console.log(this.name)
  },
  arrow : () => {
    console.log(this.name)
  }
}

heropy.normal()
heropy.arrow()
```

- 위 코드에서 normal() 이렇게 메소드를 축약형으로 정의할 수가 있다.

```jsx
// 생성자 함수의 이름을 파스칼 케이스로 적어둔다.
function User(first, last) {
  this.firstName = first
  this.lastName = last
  
}
User.prototype.getFullName = function(){
  return `${this.firstName} ${this.lastName}`
}

// user : 생성자 함수
const heropy = new User('Heropy', 'Park')
const amy = new User('Amy', 'Clarke')
const neo = new User('Neo', 'Smith')

console.log(heropy.getFullName())
console.log(amy)
console.log(neo.getFullName())
```

- 위 코드와 같이 prototype을 사용해서 메소드를 정의할 수가 있다.

```jsx
// ES6 Classes

class User {
  constructor(first, last){
    this.firstName = first
    this.lastName = last
  }

  getFullName() {
    return `${this.firstName} ${this.lastName}`
  }
}

// user : 생성자 함수
const heropy = new User('Heropy', 'Park')
const amy = new User('Amy', 'Clarke')
const neo = new User('Neo', 'Smith')

console.log(heropy.getFullName())
console.log(amy)
console.log(neo.getFullName())
```

위 코드와 같이 여러 언어와 비슷하게 class를 선언할 수가 있다. (ES6에서 추가됨)

# 상속(확장)

```jsx
class Vehicle{
  constructor(name, wheel){
    this.name = name
    this.wheel = wheel
  }
}
const myVehicle = new Vehicle('운송수단', 2)
console.log(myVehicle)

// 확장 (상속) 
class Bicycle extends Vehicle{
  constructor(name, wheel){
    // super는 Vehicle 클래스를 의미함
    super(name, wheel)
  }
}

const myBicycle = new Bicycle('삼천리',2)
const daughterBicycle = new Bicycle('세발', 3)
console.log(myBicycle)
console.log(daughterBicycle)

class Car extends Vehicle{
  constructor(name, wheel, license){
    super(name, wheel)
    this.license = license
  }
}

const myCar = new Car('벤츠', 4, true)
const daughtersCar = new Car('포르쉐', 4, false)

console.log(myCar)
console.log(daughtersCar)
```

- 상속은 자바처럼 사용하면 된다.