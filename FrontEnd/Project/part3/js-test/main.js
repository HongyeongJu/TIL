const numbers= [1,2,3,4]
const fruits = ['Apple', 'Banana', 'Cherry']

const a = fruits.forEach((fruit, index) =>{
  console.log(`${fruit}-${index}`)
})
console.log(a)

const b = fruits.map((fruit, index) =>({
  id:index,
  name:fruit
}))
console.log(b)