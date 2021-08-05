![](http://image.yes24.com/goods/87631428/XL)



# Do It 리액트 프로그래밍 정석



## 목차

- 목차
- 리액트 기본 익히기
  1. 리액트 시작하기
  2. 





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

