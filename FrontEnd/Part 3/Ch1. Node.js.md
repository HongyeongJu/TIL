# node.js 는 chrome V8 javascript 엔진.!

- JavaScript 런타임이다.
- 런타임이란 ?? 프로그래밍 언어가 동작하는 환경이다.

## javascript가 동작 하는 2가지.

- 컴퓨터
- 브라우저

- 프론트엔드 개발을 할 때 직접 html css, js를 사용해서 만드는 건 비효율적이다. 하지만 여러 모듈들의 도움을 받아서 개발하면 많이 효율적으로 변한다.

## node.js의 버전을 바꾸기 위해서는 NVM을 사용한다.

- NVM을 사용하면 node.js의 버전을 바꿀 수가 있다.!

# NVM 사용법

## node 버전 설치

```java
nvm install 버전
```

## node 버전 사용

```java
nvm use 버전
```

## node 버전 삭제

```java
nvm uninstall 버전
```

## node 버전 리스트

```java
nvm ls
```

# NPM 개요

- NPM은 전세계의 개발자들이 만든 다양한(패키지, 모듈)을 관리

- 패키지 : 모듈이나 기능으로 이해할 수가 있다.



→ 누군가 만들어 놓은 모듈들을 패키지라고 부른다.

이걸 사용을 하게되면, 학습의 난도도 증가되고 구성이 복잡하다.

하지만 관리 효율 증가하고 손쉬운 기능을 고도화가 된다.

→ parcel-bundler의 버전을 명시된다.

## 패키지 설치하기

```java
npm install 패키지이름
```

→ npm을 사용해서 패키지를 손쉽게 설치를 할 수가 있다.



## dependencies에 기록이 남은 패키지를 재설치하기

```java
npm install 이나 npm i를 입력하면 된다.
```

# package-lock.json

- 우리가 npm install을 사용해서 설치한 패키지들이 사용하는 또 다른 패키지들이 있는데 그러한 패키지들을 따로 관리해주는 json 파일이다.

# package.json

- 우리가 직접적으로 관리하는 json 파일이라고 생각하면 좋다.

# npm install -d VS np install 의 차이



- 개발용 의존성 패키지 설치 : npm install -D

  - 개발에서만 사용되는 패키지이고 나중에 브라우저에 동작을 하지 않는 패키지를 설치하는 것 (개발할 떄만)

- 일반 의존성 패키지  : npm install

  - 나중에 개발이 끝나고 브라우저에서 진짜로 패키지를 사용하는 것을 의미 (브라우저에도 동작되나?)

  ```java
  npm install -D parcel-bundler
  
  npm install lodash
  ```

# 개발 서버 실핼과 빌드

## package.json

```java
"scripts": {
    "dev": "parcel index.html",
    "build": "parcel build index.html"
  },
```

- package.json 파일에 dev, build가 2가지가 있는데, 각각 이들은 npm run dev, npm run build로 명령어를 실행할 수가 있다. dev의 뜻은 parcel 패키지를 사용해서 index.html을 개발용 서버를 실행하는 의미로써 개발 테스트를 위한 서버를 만들어준다.
- 반면에 build는 사용자 브라우저를 위한 빌드용 앱을 개발하여 출력하는 것이다. 따라서 build된 파일을 살펴보면 코드 난독화로 보여지는 것을 알 수가 있다.

## 코드 난독화

```java
<!DOCTYPE html><html lang="en"><head><meta charset="UTF-8"><meta http-equiv="X-UA-Compatible" content="IE=edge"><meta name="viewport" content="width=device-width, initial-scale=1.0"><title>Document</title><script src="/main.5b732838.js"></script></head><body> <h1>Hello h</h1> </body></html>
```

- 웹 개발하다보면 위의 코드같이 다닥다닥 붙어있는 코드들을 볼 수가 있다.
- 코드 난독화는 작성된 코드를 읽기 어렵게 만드는 작업을 말한다. 빌드된 결과(제품)은 브라우저에서 해석되는 용도로, 용량을 축소하고 읽기 어렵게 만드는 등의 최적화를 거치는 것이 좋다.

## 번들

- 번들은 우리가 프로젝트 개발에 사용한 여러 모듈(패키지)을 하나로 묶어내는 작업을 말한다.

# 유의적 버전(Semantic Versioning, SemVer)

- 유의적 : 의미가 있는 버전.
- Major.Minor.Patch라는 의미

## Major

- 기존 버전과 호환되지 않는 새로운 버전이다.



## Minor

- 기존 버전과는 호환되는 새로운 기능이 추가된 버전.



## Patch

기존 버전과 호환되는 버그 및 오타 등이 수정된 버전

# ^

- Major 버전 안에서 가장 최신 버전으로 업데이트 가능



## npm update 패키지

- 패키지를 최신버전으로 업데이트를 시켜주는것
- 이럴 때 버전이 ^이 포함되어 있어야된다.

## 특정 버전 패키지 설치하기

```java
npm install 패키지@버전
```

## 특정 패키지 정보 확인하기

```java
npm info 패키지
```