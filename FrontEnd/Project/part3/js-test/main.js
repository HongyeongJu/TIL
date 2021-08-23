// 콜백(Callback)
// 함수의 인수로 사용되는 함수

// setTimeout(함수, 시간)
// setTimeout 매개변수에서 함수가 들어온 것처럼 이것을 콜백함수라고 부른다.


function timeout(callback){
  setTimeout(()=> {
    console.log('Heropy!')
    callback()
  }, 3000)
}
timeout(() => {
  console.log('Done!')
})
