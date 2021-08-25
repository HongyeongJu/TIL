# React 개요

- react는 컴포넌트 기반 라이브러리이다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b0ef2f36-9a65-46b6-8154-db9e75a9117a/Untitled.png)

- html에서는 attribute라는 속성이라고 부르지만, component에서는 property라고 부른다.
- 즉 React는 일종의 태그를 만드는 것이라고 할 수가 있다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bf294623-de32-48a9-aa3b-e010df4eba0a/Untitled.png)

- 컴포넌트 트리는 돔트리랑 비슷한 형태로 되어있다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e117a124-6de9-45d1-8589-21cc52c592d8/Untitled.png)

- jquery를 사용하면 실제 DOM을 사용해서 프론트엔드 개발을 했었다.
- 하지만 리엑트를 사용하면 Virtual DOM을 만들어서 가상의 돔을 만들 수가 있다.
- 리엑트에서 돔의 이전 상태와 이후 상태를 비교해서 바뀐 부분을 찾아서 자동으로 바꿔낸다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4e7a272b-4282-442d-81dc-6998152884aa/Untitled.png)

## 클라이언트 사이드 렌더링

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/19a1020d-6f00-4e45-899a-19c98387ccfa/Untitled.png)

- 처음에 HTML 다운 받고
- 그다음에 HTML 안에 있는 JS 를 다운받고
- 그 다음 JS안에 있는 React 웹앱의 소스코드를 다운받고 실행하면 그 리액트가 실행되고 특정 컴포넌트가 실행되면 유저는 그때서야 웹 홈페이지 실행되는것을 알 수가 있을 것이다.

## 서버 사이드 렌더링

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5724938f-6dc9-43e2-bf34-4fb7e3e37cc6/Untitled.png)

- 서버사이드 랜더링은 서버에서 먼저 HTML을 다운 받고 이미 렌더가 되어있는 상태이기 때문에 유저는 HTML을 보면 바로 볼 수가 있을 것이다.
- 하지만 보이기만 하지 어떤것을 눌러도 반응이 없을 것이고 이때 JS가 다운 받고 JS안에 들어있는 React앱이 실행될 것이다. 이 때 React앱이 다 실행이 될 때 사용자는 실제적인 웹 어플리케이션을 이용할 수가 있다.

### 서버사이드 렌더링 vs 클라이언트 사이드 렌더링

- 사용자가 리엑트가 실행되기전 먼저 화면을 보게끔 만들고 싶다면 서버사이드 렌더링을
- 아니라면 클라이언트 사이드 렌더링을 사용하면 되는데, 일반적으로 설정을 해놓지 않는다면. 클라이언트 사이드 렌더링으로 default로 실행이 되어진다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b9ccef4d-250a-49fd-a0e2-a0a439f2061e/Untitled.png)

# 리액트 라이브러리

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/54561777-b1f5-487a-a519-bbd122210b0b/Untitled.png)

- 리액트의 핵심 모듈은 2개가 있다.
- ReactDOM : 리액트 컴포넌트를 HTMLElement를 연결하는 것이고
- React : 리액트 컴포넌트를 만드는 라이브러리이다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c23f1f1c-3fa8-4b26-8fcd-13a694e0807f/Untitled.png)

- ReactDOM.render()를 일종의 main함수라고 생각하면 된다.
- <HelloMessage name="Taylor"> 태그는 리액트 컴포넌트인데, 리액트 컴포넌트를 일종의 HTML 태그처럼 사용한다.
- 주황색 박스 쳐져있는 곳을 살펴보면 HelloMessage를 'hello-example'의 아이디를 가지는 DOM에 그려라 라고 명령하는 것을 의미한다.
- 그리고 아래  `class HelloMessage` 이것은 컴포넌트를 정의하는 javascript 이다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bd18453f-c6fc-4a4d-bfe4-b0e1d5b1822d/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9fca8a12-4b66-4b3f-9f93-67d779b0422b/Untitled.png)

- CDN : html 에서 직접 script 태그를 통해 React라이브러리를 받는 것을 의미함.

## 고전 프론트엔드 개발방법

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1cd7d202-c181-4345-ab42-8ea7a2223d16/Untitled.png)

- HTML 로 문서 구조를 잡고
- CSS로 스타일을 입히고
- JavaScript로 DOM을 조작한다.

```jsx
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Example</title>
  <style>
    * {
      margin: 0;
      padding: 0;
      border: 0;
    }

    #root p {
      color: white;
      font-size: 20px;
      background-color: green;
      text-align: center;
      width: 200px;
    }

    #btn_plus {
      background-color: red;
      border: 2px solid #000000;
      font-size: 15px;
      width: 200px;
    }
  </style>
</head>
<body>
  <div id="root"></div>
  <button id="btn_plus">+</button>

  <script crossorigin src="<https://unpkg.com/react@17/umd/react.development.js>"></script>
  <script crossorigin src="<https://unpkg.com/react-dom@17/umd/react-dom.development.js>"></script>
  <script type="text/javascript">
    // console.log(React);
    // console.log(ReactDOM);
    
    const root = document.querySelector('#root');
    const btn_plus = document.querySelector('#btn_plus');

    let i = 0;
    root.innerHTML = '<p>init : 0 </p>';

    btn_plus.addEventListener('click', () =>{
      root.innerHTML = `<p>init : ${++i}</p>`;
    })
  </script>
</body>
</html>
```

- 위 코드는 고전 프론트엔드 개발 방법을 사용한 개발 방법이다.

## 컴포넌트를 활용한 프론트엔드

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0ab7fac8-df9c-4b4d-926c-85b9af7e5553/Untitled.png)

```jsx
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Example</title>
  <style>
    * {
      margin: 0;
      padding: 0;
      border: 0;
    }

    #root p {
      color: white;
      font-size: 20px;
      background-color: green;
      text-align: center;
      width: 200px;
    }

    #btn_plus {
      background-color: red;
      border: 2px solid #000000;
      font-size: 15px;
      width: 200px;
    }
  </style>
</head>
<body>
  <div id="root"></div>
  <button id="btn_plus">+</button>

  <script crossorigin src="<https://unpkg.com/react@17/umd/react.development.js>"></script>
  <script crossorigin src="<https://unpkg.com/react-dom@17/umd/react-dom.development.js>"></script>
  <script type="text/javascript">
    const component = {
      message: 'init',
      count: 0,
      render() {
        return `<p>${this.message} : ${this.count}</p>`;
      },
    };

    function render(rootElement, component) {
      rootElement.innerHTML = component.render();
    }

    // 초기화 
    render(document.querySelector('#root'), component);

    document.querySelector('#btn_plus').addEventListener('click' , () =>{
      component.message = 'update';
      component.count = component.count+ 1;

      render(document.querySelector('#root'), component);
    });

  </script>
</body>
</html>
```

- 위 코드는 컴포넌트로 프론트엔드를 구현하는 코드이다.
- 먼저 component라는 객체를 만들고 거기에 속성들 message , count을 넣고 render()라는 함수를 정의한다.
- function render에서는 선택된 element에 component.render() 반환값을 넣어서 화면 표시를 갱신하는 것을 알 수가 있다.
- React에서는 위와 같은 컴포넌트 프론트엔드 개발을 편리하게 만들어주는 라이브러리이다.

```jsx
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Example</title>
  <style>
    * {
      margin: 0;
      padding: 0;
      border: 0;
    }

    #root p {
      color: white;
      font-size: 20px;
      background-color: green;
      text-align: center;
      width: 200px;
    }

    #btn_plus {
      background-color: red;
      border: 2px solid #000000;
      font-size: 15px;
      width: 200px;
    }
  </style>
</head>
<body>
  <div id="root"></div>
  <button id="btn_plus">+</button>

  <script crossorigin src="<https://unpkg.com/react@17/umd/react.development.js>"></script>
  <script crossorigin src="<https://unpkg.com/react-dom@17/umd/react-dom.development.js>"></script>
  <script type="text/javascript">
    console.log(React);
    console.log(ReactDOM);
    
    // <p hello="world">
    // 컴포넌트를 어떠한 모습을 정의한것임
    const Component = props => {     
      // 리턴할 때는 꼭 리액트 엘리먼트로 리턴을 해줘야됨
      // 요건 가상의 DOM이다. 
      return React.createElement('p', null , `${props.message} : ${props.count}`);
    }

    ReactDOM.render(React.createElement(Component, {message : 'init', count : 0}, null),
     document.querySelector('#root'));

    document.querySelector('#btn_plus').addEventListener('click', ()=>{
      ReactDOM.render(React.createElement(Component, {message : 'update', count : 10}
      , null),
     document.querySelector('#root'));
    })
  </script>
</body>
</html>
```

- 위 코드는 React.js 라이브러리를 사용해서 컴포넌트 구현을 한 것이다.

```jsx
React.createElement('p', null , `${props.message} : ${props.count}`);

React.createElement( 태그 이름, 태그 안에 들어갈 속성 , 태그 안에 있는 요소값);
```

- 위 코드를 생각해보면 p 태그를 만드는데, 속성은 없게 만들고 `${props.message} : ${props.count}` 형식으로 표현되는 요소를 넣겠다 라는 뜻이다.

```jsx
 ReactDOM.render(React.createElement(Component, {message : 'init', count : 0}, null),
     document.querySelector('#root'));

ReactDOM.render(렌더링할 컴포넌트 , 렌더링할 html 위치 실제 DOM )
```

- ReactDOM.render() 를 사용해서 실제 DOM 위치에 가상의 컴포넌트를 렌더링하는 함수이다.

```jsx
React.createElement(Component, {message : 'init', count : 0}
```

- 위 코드는 이전에 만들었던 Component 태그로 만들고 속성 props에 객체를 넣는다는 뜻이다.