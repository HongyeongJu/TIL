// typeof 대신에 쓸 수 있는 함수 (왜냐하면 typeof가 뭉뜽그려서 object라고 표현했기 때문)
export default function getType(data){
  return Object.prototype.toString.call(data).slice(8, -1)
}