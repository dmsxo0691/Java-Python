class Person{
    //생성자
    constructor(age,phone,city){
        this.age = age;
        this.phone = phone;
        this.city = city;
    }
    getInfo(){
        return ("나이는 " + this.age + "살" +
        " 핸드폰 번호는 " + this.phone + " 사는 곳은 " + 
        this.city + "입니다.")}

}

const st = new Person (10, 10, "부산");
console.log(st);
console.log(st.age);
console.log(st.getInfo());

//private, public, protected

class Prodect{
    constructor(name,price){
        this.name = name;
        this.price = price;
    }
    get getName(){
        return '제품이름' + this.name;
    }
    set setPrice(price){
        this.price = price;
    }
}


let Pr = new Prodect("아이폰 14 언제 출시하냐?", 1000000);
console.log(Pr);
console.log(Pr.getName);
Pr.setPrice = 2000;
console.log(Pr);


//////////////////////////////////////

class Mother{
    constructor(name,age){
        this.name = name;
        this.age = age;
    }

    getInfo(){
        return console.log("내 이름은" + this.name + "이고 나이는" + this.age+"입니다");
    }
}

let a = new Mother("바보",20);
a.getInfo();

//extends 키워드를 사용해서 상속할 수 있다.
//자식 클래스가 부모 클래스를 상속받아 자식 클래스에서 부모 클래스의 기능을 물려받아 사용할 수 있다.
//기존에 존재하던 기능을 토대로 새로운 기능을 만들 수 있다.

class Child extends Mother {}
let b = new Child("나는 자식",30);
b.getInfo();


class Animal{
    constructor(name,age){
        this.name = name;
        this.speed = 0;
    }
    run(speed)
    {
        this.speed = speed;
        console.log(this.name+"은"+this.speed+"로 달린다","나는 부모다")
    }
    stop()
    {
        this.speed = 0;
        console.log(this.name + "이 멈췄다","부모");
    }
}

const ani = new Animal("동물");
ani.run(5);
ani.stop();

//상속을 이용해 고양이 클래스 만들기
class Cat extends Animal{
    //constructor가 없으면 비어 있는 생성자가 만들어진다.
    //run함수가 없으면 상속받은 run함수를 실행
    //부모의 함수를 받아 재정의하여 사용(=함수 오버라이딩)
    run(speed){
        this.speed = speed;
        console.log(this.name+"은"+this.speed+"로 달린다","나는 자식이다.")
    }
    speak(){
        console.log("야옹야옹");
    }
    stop(){
        //super는 상속받은 부모 클래스를 칭함
        //재정의 해서 사용할 수도 있지만 super키워드를 이용해서 부모함수를 실행할 수 있다.
        super.stop();
        // this.speak();
    }
}
let cat = new Cat("고양이");
cat.run(2);
cat.stop();


class Human{
    constructor(name,age){
        this.name = name;
        this.age = age;
    }
}
class Man extends Human{
    //상속 클래스(Man)의 생성자 함수가 실행되면
    //일반적인 함수에서 일어나는 일이 발생하지 않는다
    //->new 키워드와 함께 실행되면 빈 객체가 생성되고
    // this 키워드에 이 객체가 할당

    // this에 객체를 할당하는 일을 부모클래스의 생성자가
    // 처리해주길 바라기 때문임
    constructor(name,age){
        super(name,age);
        this.name = name;
        this.age = age;
    }
}
let ma = new Man("경일",30);
console.log(ma);








