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