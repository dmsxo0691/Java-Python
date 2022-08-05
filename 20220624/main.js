//this
//자기자신의 객체를 가르키는 녀석

//최상위 객체: window

// var a = 5;
// console.log(a);
// console.log(window.a);
// console.log(this.a);

// function func(){
//     console.log('함수');
// }
// func();
// window.func();
// console.log(func()===window.func())

// function f(){
//     if(window === this)console.log("윈도우는 this임");
// }
// f();

// var stdudent = {
//     name:'hong',            //property
//     st:function(){          //method
//         console.log(this);
//     },
// };
// //호출하는 주체는 학생
// stdudent.st();
// var s = stdudent.st;
// s();


// //이하는 고양이 객체(Object)
// //이하는 property(요소)
// cat.name = "경동 나비엔";  
// cat.age = 3;
// cat.weight = 2;

// /* ---- */

// //이하는 method(기능)
// cat.eat();
// cat.run();
// cat.stop();
// cat.sleep();




//빈 객체 만들기
//객체는 로그 상 중괄호로 감싸져 있음

const person = new Object();

person.name = 'Lee'
person.Hello = function (){
    console.log("안녕 내 이름은" + this.name);
}
console.log(person);
person.Hello();


//생성자 함수에 의한 객체 생성

function Circle(radius){
    this.radius = radius;   //프로퍼티
    this.getDiameter = function(){
        return 2* this.radius;
    }
}

const circle1 = new Circle(5);  //반지름이 5인 Circle이라는 객체를 생성
const circle2 = new Circle(10); 
console.log(circle1.getDiameter());
console.log(circle2.getDiameter());
console.log(circle1.getDiameter === circle2.getDiameter);

function Person(name,age,city){
    this.name = name;
    this.age = age;
    this.city = city;

    this.information = function(){
        console.log('나는'+this.name+'나이는'+this.age+'사는 곳은'+this.city);
    }
}

// 지금 해볼 것
// student라는 생성자 함수를
// 나이, 키, 사는 곳, 몸무게, 학번의 프로퍼티를 추가
// 밥먹기, 똥싸기, 집에 가기, 등교하기 등등 어떤 동작을 하는 메서드를 만들기
// 3명의 학생 정보를 출력



function student(name, height, city, weight, classNumber){
    this.name = name;
    this.height = height;
    this.city = city;
    this.weight = weight;
    this.classNumber = classNumber;

    this.eat = function(){
        return (name + name +'우걱우걱');
    }
    this.shit = function(){
        return (name + name +'...!');
    }
    this.home = function(){
        return (name + name + city +'(으)로 간다.')
    }
    this.school = function(){
        return (name + name + '학교로 간다.')
    }
}


const student1 = new student('태용', 180, '양주', 100, 16);
const student2 = new student('소리', 170, '서울', 70, 08);
const student3 = new student('마태', 175, '남한산성', 90, 14);
console.log(student1.eat());
console.log(student2.eat());
console.log(student3.eat());
console.log(student1.shit());
console.log(student2.shit());
console.log(student3.shit());
console.log(student1.home());
console.log(student2.home());
console.log(student3.home());
console.log(student1.school());
console.log(student2.school());
console.log(student3.school());


