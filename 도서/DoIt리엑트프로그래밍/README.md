![](http://image.yes24.com/goods/87631428/XL)



# Do It 리액트 프로그래밍 정석



## 목차

- 목차
- [리액트 기본 익히기](#리액트-기본-익히기)
  1. [리액트 시작하기](#리액트-시작하기)
  2. [리액트 ES6 문법 액기스](#리액트-ES6-문법-액기스)





# 리액트 기본 익히기



## 리액트 시작하기

### 01-1. 리액트 시작하기

- 리액트는  **화면 출력에 특화된 프레임워크** 이다.

#### 리액트의 장점

- 컴포넌트로 화면 구성을 효율적으로 할 수가 있다.
  - 컴포넌트는 '레고블록'으로 생각하면됨.
  - 컴포넌트를 조립해서 화면을 만드는 기술이 **리액트**이다.

- 게임 엔진 원리를 도입하여 화면 출력 속도가 빠르다.
  - jquery와 핸들바라는 라이브러리는 **화면이 커질수록 화면을 그리는 시간도 길어진다**는 단점이 있다.
  - 진짜 문제는 **화면의 일부분만 수정되어도 화면 전체를 다시 그린다는 것**이라는 것
  - 리엑트는 게임 엔진 원리를 도입하였다. 게임 엔진 원리란 **다음장면에 필요한 화면을 미리 그려 두는 방법** 이다.

#### 노드 패키지 매니저란?

- 노드 패키지 매니저란 여러 **자바스크립트 라이브러리**를 관리하는 매니저라고 생각하면된다.

#### 웹팩이란 무엇인가?

- **웹팩**은 프로젝트에 사용된 파일을 분석하여 **기존 웹 문서 파일로 변환**하는 도구
- 웹팩이 필요한 이유는 프레임워크가 .js, .css .jpg 와 같은 기존 웹 문서 파일을 사용하기 않기 때문에 프로젝트에 사용된 확장자를 기존에 사용하는 확장자로 변환해주는 역할을 한다.



### 01-2. 리액트 개발 환경 설치하기

#### 노드 버전 매니저로 노드제이에스 설치하기

#### yarn과 create-reat-app 설치하기

- create-react-app은 리액트 프로젝트에 필요한 패키지들을 묶어 리액트 앱을 생성해주는 도구이다.
- 이것이 없다면 일일이 패키지를 찾아 package.json에 추가해야됨.

#### 예제에 필요한 라이브러리 미리 설치하기

#### 비주얼 스튜디오 코드와 플러그인 설치하기

| 키워드 | 설명                                               |
| ------ | -------------------------------------------------- |
| RCC    | 기본 리액트 컴포넌트 코드를 생성합니다             |
| RCCP   | 리액트 컴포넌트를 프로퍼티 타입과 함께 생성합니다  |
| RCFC   | 리액트 컴포넌트를 생명주기 함수와 함께 생성합니다. |
| RPC    | 리액트 퓨어 컴포넌트를 생성합니다.                 |
| RSC    | 함수형 컴포넌트를 생성합니다.                      |
| RSCP   | 함수형 컴포넌트를 프로퍼티 타입과 함께 생성합니다. |



` render()`:  HTML을 반환하는 함수이다. 이것이 웹브라우저에 출력이 된다.

- 리액트에서는 class이름을 className으로 정의하여 사용한다. (왜냐하면 html class랑 겹치기 때문이다.)

#### 참고 : 리엑트는 핫 리로딩 기능이 있어서 비주얼 스튜디오 코드에서 저장을 하면 바로 바로 업데이트가 된다.



## 리액트 ES6 문법 액기스



### 02-1 템플릿 문자열

#### 기존 자바스크립트의 문자열 사용방법

```javascript
var string1 = '안녕하세요';
var string2 = '반갑습니다.';
var greeting = string1 + ' ' + string2;
var product = { name: '도서', price: '4200원' };
var message = '제품' + product.name + '의 가격은' + product.price + '입니다.';
var multiLine = '문자열1\n문자열2';
var value1 = 1;
var value2 = 2;
var boolValue = false;
var operator1 = '곱셈값은 ' + (value1 * value2) + '입니다.';
var operator2 = '불리언 값은' + (boolValue ? '참' : '거짓') + '입니다.';
```

- product는 dictionary이다.  javascript에서도 3항연산자를 사용할 수 있나보다.



#### ES6의 문자열 사용 방법

```javascript
var string1 = '안녕하세요';
var string2 = '반갑습니다.';
var greeting = `${string1} ${string2}`;
var product = { name: '도서', price: '4200원' };
var message = `제품 ${product.name}의 가격은 ${product.price}입니다.`;
var multiLine = '문자열1\n문자열2';
var value1 = 1;
var value2 = 2;
var boolValue = false;
var operator1 = `곱셈값은 ${value1 * value2}입니다.`;
var operator2 = `${boolValue ? '참' : '거짓'} 입니다.`;
```

- $ 기호를 사용해서 연산과 자바스크립트의 변수에 접근할 수가 있다.



#### 3분 코딩

```javascript
var cart = { name: '도서', price: 1500 };
var getTotal = function (cart) {
    return cart.price + '원';
};
var myCart = `장바구니에 ${cart.name} 가 있습니다. 총 금액은 ${getTotal(cart)} 입니다.`;
```



### 02-2 전개 연산자

#### 기존 ES6의 배열의 일부 요소를 잘라내거나 연결하는 방법

```javascript
var array1 = ['one', 'two'];
var array2 = ['three', 'four'];
var combined = [array1[0], array1[1], array2[0], array2[1]];
var combined = array1.concat(array2);
var combine = [].concat(array1, array2);
var first = array1[0];
var second = array1[1];
var three = array1[2] || 'empty';
function func(){
    var args = Array.prototype.slice.call(arguments);
    var first = args[0];
    var others = args.slice(1, args.length);
}
```



#### 전개연산자를 도입

```javascript
var array1 = ['one', 'two'];
var array2 = ['three', 'four'];
const combined = [...array1, ...array2];
// 결과: combined = ['one', 'two', 'three', 'four']
const [first, second, three ='empty', ...others] = array1;
// 결과 : first = 'one', second = 'two', three ='empty', others= []

function fun(...args) {var [first, ...others] = args;}
```



#### ES6의 객체 전개 연산자 사용방법 알아보기

##### 예전의 방법

```javascript
var objectOne = {one: 1, two: 2, other : 0};
var objectTwo = {three : 3, four :4, other : -1};
var combined = {
    one: ObjectOne.one,
    two: objectOne.two,
    three : objectTwo.three,
    four : objectTwo.four,
};

var combined = Object.assign({}, objectOne, objectTwo);
// combined = {one : 1, two: 2, three : 3, four :4, other : -1}
var combined = Object.assign({}, objectTwo, objectOne);
// combined = {one : 1, two : 2, three : 3, four :4, other : 0}
var others = Object.assign({}, combined);
delete others.other;
// others = {one : 1, two : 2, three :3 , four :4}
```



##### ES6의 방법

```javascript
var objectOne = {one: 1, two: 2, other :0};
var objectTwo = {three : 3, four :4, other : -1};
var combined = {
    ...objectOne,
    ...objectTwo,
};
// combined = {one :1, two : 2, three : 3, four :4, other : -1}
var combined = {
    ...objectTwo,
    ...objectOne,
};
// combined = {one : 1, two :2 , three :3, four :4 , other : 0}
var {other, ...others} = combined;
//other = {one : 1, two :2, three : 3, four :4}
```



### 02-3 가변 변수와 불변 변수



#### ES6의 가변 변수 사용 방법

```javascript
let num = 1;
num = num * 3;
let str = '문자';
str = '다른 문자';
let arr= [];
arr = [1,2,3];
let obj = {};
obj = {name : '새 객체'};
```

- let 키워드는 변수를 어떤것이든 수정이 가능하다.



#### ES6의 불변 변수 사용 방법 알아보기

- 불변 변수는 읽기만 가능하다. 하지만 **불변 변수는 값을 다시 할당할 수 없는 것이지 값을 변경할 수는 있다.**



```
const num = 1;
num = 3;	// 자료형 오류가 발생
const str = '문자';
str = '새 문자';		// 자료형 오류가 발생
const arr = [];
arr = [1,2,3]; 		// 자료형 오류가 발생
const obj = {};
obj = {name : '내 이름'}; // 자료형 오류가 발생
```



- 위의 코드는 오류가 발생하지만, 자바스크립트 내장 함수를 사용해서 값을 변경 할 수가 있다.

```javascript
const arr2 = [];
arr2.push(1);		//arr2 =[1]
arr2.splice(0,0,0);		// arr2 = [0,1]
arr2.pop();		// arr2 = [1]
const obj2 = {};
obj2['name'] = '내이름';		// obj2 = {name : '내이름'}
Object.assign(obj2, {name : '새이름'});		// obj2 ={name :'새이름'}
delete obj2.name;	// obj2 = {}
```

- 하지만 이 책에서는 **불변 변수로 정의된 배열이나 객체를 내장 함수로 수정하는 것을 암묵적으로 금지하여 무결성을 유지**한다.



```javascript
const num1 = 1;
const num2 = num1 *3;		//num2 = 3
const str1 = '문자';
const str2 = str1 +'추가';		// str2 = '문자추가'
const arr3= [];
const arr4 = arr3.concat(1);		// arr4 =[1]
const arr5 = [...arr4, 2, 3]  // arr5= [1,2,3]
const arr6 = arr5.slice(0,1);		//arr6 =[1], arr5= [1,2,3]
const [first, ...arr7] = arr5;		// arr7 = [2,3] , first =1
const obj3 = {name : '내이름', age :20};
const objValue = {name :'새이름', age :obj3.age};
const obj4 = {...obj3, name :'새이름'};		// obj4 = {name: '새이름' ,age : 20}
const {name, ...obj5} = obj4;		// obj5 = age :20
```



| 가변 내장함수          | 무결성 내장 함수                              |
| ---------------------- | --------------------------------------------- |
| push(...items)         | concat(...items)                              |
| splice(s, c, ...items) | slice(0,s)<br />.concat(...items, slice(s+c)) |
| pop()                  | slice(0, len-1)                               |
| shift()                | slice(1)                                      |

- 가변 내장함수를 사용하는 것이아니라 무결정 내장 함수를 사용하자!
- 실무에서도 가변 변수보다 불변 변수를 더 많이 사용한다.



### 02-4 클래스

#### 기존 자바스크립트의 클래스 표현 방법 알아보기

- 기존 자바스크립트에서는 함수를 생성자 형태로 선언한 다음 상속이 필요한 변수나 함수를 prototype 객체에 할당하는 방법을 사용했다.

```javascript
function Shape (x,y){
    this.name = 'Shape';
    this.move(x,y);
}
// static 함수를 선언하는 예제
Shape.create= function(x, y) {return new Shape(x,y);};
// 인스턴스 함수를 선언하는 예제
Shape.prototype.move = function(x,y) {
    this.x = x;
    this.y= y;
}
Shape.prototype.are = function(){
    return 0;
};
// 혹은
Shape.prototype = {
    move : function(x, y){
        this.x = x;
        this.y = y;
    },
    area : function(){
        return 0;
    }
};
var s = new Shape(0,0);
s.area();		// 0
```

- 상속

```javascript
function Circle(x, y, radius){
    Shape.call(this, x, y);
    this.name = 'Circle';
    this.radius = radius;
}
Object.assign(Circle.prototype, Shape.prototype, {
    area : function(){
        return this.radius * this.radius;
    }
});
var c = new Circle(0, 0, 10);
c.area();		// 100
```

- 상속하기 위해서 Object에 내장된 assign() 함수를 이용했다. Shape.prototype에 정의된 area()를 새로운 area() 함수를 덮어씌웠다.



#### ES6 클래스 사용 방법 알아보기

- 기존의 Java 언어와 같은 class 정의 방법을 사용한다.

```javascript
class Shape{
    static create(x,y) {return new Shape(x,y);}
    name = 'Shape';
	constructor(x,y) {
        this.move(x,y);
    }
	move(x,y) {
        this.x = x;
        this.y = y;
    }
	area(){
        return 0;
    }
}

var s = new Shape(0,0);
s.area();		// 0
```

- 생성자, 클래스 변수, 클래스 함수 정의에는 변수 선언을 위한 키워드(var, let, const...)를 사용하지 않는다는 점을 유의하자.



-> 상속 기능

```javascript
class Circle extends Shape {
    constructor(x,y,radius){
        super(x,y);
        this.radius = radius;
    }
    area() {
        if(this.radius ===0 ) return super.area();
        return this.radius * this.radius;
    }
}

var c = new Circle(0, 0, 10);
c.area();	//100
```

- ES6는 다중 상속이나 인터페이스는 지원하지 않는다.





### 02-5 화살표 함수

- 화살표 함수는 ES6에 추가된 표현식을 사용하는 함수 : => 기호로 함수를 선언함.



#### 기존의 자바스크립트의 함수 사용 방법

```javascript
function add(first, second){
	return first + second;
}
// typeof add === 'function'

var add = function(first, second){
	// 이 함수 선언 방식은 함수에 이름이 없으므로 '익명 함수'라고 부른다.
    return first + second;
}
// typeof add ==='function'
```



#### ES6의 화살표 함수 사용 방법 알아보기

- 화살표 함수는 익명 함수를 선언하여 변수에 대입하는 방법과 유사하다.
- 하지만 다른 점은 **function 키워드를 생략**하고 ()와 {} 사이에 =>를 표기하는 점이다.

```javascript
var add = (first, second) =>{
    return first + second;
};

var add = (first, second) => first + second;

var addAndMultiple = (first, second) => ({add :first + second, multiply :first * second});
```

- 화살표 함수는 함수 표현식을 간결하게 만들 수가 있고
- 이후에 커링과 같은 디자인 패턴에서 사용되는 함수를 반환할 때 **'계단형 함수 선언'**과 같은 구조가 만들어지지 않게 해준다는 장점이 있음.



```javascript
function addNumber(num){
    return function(value){
        return num + value;
    };
}
var addNumber  = num => value => num + value;
```

- 또한 화살표 함수는 콜백 함수의 this 범위로 생기는 오류를 피하기 위해 **bind() 함수를 사용하여 this 객체를 전달**한다.

```javascript
class MyClass{
	value = 10;
	constructor(){
        var addThis2= function(first, second) {
            return this.value + first + second;
        }.bind(this);
        
		var addThis3 = (first , second) => this.value + first + second;
    }
}
```

