# CLI창에서 git 사용법 다뤄보기.
## git 초기화

git을 초기화 하고 싶은 폴더로 들어가서 git init을 입력해준다.
```
git init
```

git 폴더에서 우리의 프로젝트가 기록이 되어진다.
그러면 다음과 같이 git 폴더가 생성되는 것을 알 수가 있다.
```
홍영주@DESKTOP-3SHNENU MINGW64 /e/TIL/Git/hello-git-cli (master)
$ ls -al
total 4
drwxr-xr-x 1 홍영주 197121 0  8월  5 09:50 ./
drwxr-xr-x 1 홍영주 197121 0  8월  5 09:49 ../
drwxr-xr-x 1 홍영주 197121 0  8월  5 09:50 .git/
```

## 버전의 생성

Repository :  버전이 저장되는 저장소
Working tree :  버전으로 만들어지기 전단계 (파일을 수정한 것들)
Staging Area : 버전으로 올리고 싶은 파일을 올려놓는 공간


```
nano hello1.txt
```
- nano hello1.txt는 hello1.txt라고 불리는 텍스트 편집기를 불러오는 것.

```
cat hello1.txt
```
- cat hello1.txt의 뜻은 hello1.txt의 내용을 확인하는 것이다.


```
git status
```
- git status <- 깃의 현재 상태를 볼 수가 있다.

```
git add hello1.txt
```
- hello1.txt을 Staging Area로 올려라라는 명령


```
git commit -m "Commit 내용"
```
- 버전을 만든다.

```
git log
```
- git의 버전들을 보고싶다.
- 나가려면 q를 누른다.

## 버전간의 차이점 비교

```
git diff
```
- 이전 버전과 현재 버전과의 차이점을 비교하는 명령어이다.

```
git reset --hard
```
- 우리가 작업한 내용을 삭제하고 되돌려 놓기.

```
git log -p
```

- git 버전 리스트에서 어떤것들이 추가되었는지 확인하는 방법임.


## checkout을 사용하여 이전 버전으로 이동하기.

```
git checkout "버전이름"
```
- 버전이름을 checkout 명령어로 입력하면 버전이름으로 HEAD가 이동하게 된다.


```
git checkout master
```
- 현재 master 브랜치가 가리키는 버전으로 이동한다.


## 보충수업

```
git add .
```
- 현재 폴더의 git내용을 모두 stating area에 넣는다.

```
git add 폴더명
```
- 폴더명을 모두 stating area에 넣는다.

```
git commit -am "4"
```
- am의 의미는 add와 message를 합친 것으로 add를 해주고 commit을 동시에 한다는 뜻이다.
- 그리고 -a는 이미 git에서 버전이 추적되는 것만 자동으로 추적된다.


```
git commit
```
- git commit을 입력하면 GNU nano가 출력하게됨. 그리고 여러줄의 commit 메시지를 만들 수가 있다.

```
git config --global core.editor "nano"
```
- git editor를 nano 로 바꾸겠다는 의미이다.

## 버전을 삭제하는 방법

```
git reset --hard "버전 이름"
```
- "버전 이름"으로 강제로 버전으로 리셋하겠다라는 의미

```
git reset --mixed | --soft "버전 이름"
```
- "버전 이름"으로 버전으로 리셋을하는데, 현재 코드를 작성하는 것을 살리고 싶다는 뜻.

## 버전을 삭제를 하지 않으면서, 되돌리는 방법

```
git revert "버전 이름"
```

- "버전 이름"을 가만히 두면서, "버전 이름"의 변경내용을 취소하는것(버전 이름의 이전단계로 돌려놓는 것을 의미)
- revert을 사용해서 "Message1"까지 내려가려면 쭉 거쳐왔던 것을 revert를 역순으로 사용해야된다.
- 만일 역순으로 하지 않고 바로 "message2"를 사용하게 되면 충돌이 발생한다.
