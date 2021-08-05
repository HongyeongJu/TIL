# 백업



Local Repository : 버전을 생성하는 내가 사용하는 컴퓨터

Remote Repository : 버전을 저장하는 원격 서버 컴퓨터

push: 지역저장소의 내용을 원격저장소에 저장하는 행동

clone: 원격저장소의 내용을 지역저장소에 복사하는 행동

pull : 원격저장소의 내용을 지역저장소에 업데이트하는 행동



### `git remote add origin [깃허브주소]`

- git 원격저장소를 origin 이라는 별명으로 추가하는 것이다.



### `git remote`

- 원격저장소 리스트를 보여주는 명령어이다.
- `git remote -v` : 자세하게 원격저장소 리스트의 주소를 보여주는 명령어



### `git push`

- 처음에 git push를 하게되면 다음과 같은 오류가 발생한다.

```
$ git push
fatal: The current branch master has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin master

```

- 이 뜻은 `git push --set-upstream origin master` 의 명령어를 입력해서  origin을 master로 설정한다고 초기 설정을 해줘야된다.



### `git pull`

- 원격저장소에 있던 내용을 업데이트 하는 명령어



### `git clone`

- 원격저장소에 있는 내용을 복제하는 명령어



