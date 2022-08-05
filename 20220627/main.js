//디스트럭처링(구조분해) 할당
//1개 이상 변수에 개별정으로 할당하는 것

// //ES5
// var arr = [1, 2, 3];
// var one = arr[0];
// var two = arr[1];
// var three = arr[2];

// console.log(one, two, three);
/* --------------------------- */

//ES6
// const arr = [1, 2, 3];
// const [one, two, three] = arr;
// console.log(one, two, three);

// const [a, b] = [1, 2];
// console.log(a, b);

// const [c, d] = [1];
// console.log(c, d);

// const [e, f] = [1, 2, 3];
// console.log(e, f);

// //디폴트로 넣을 수 있다
// const [a, b, c = 3] = [1, 2];
// console.log(a, b, c);

// //기본값보다 할당된 값이 우선시 된다.
// const [e, f = 10, g = 3] = [1, 2];
// console.log(e, f, g);

/* ======================== */
//ES5
//key       value
// var user = { firstname: "Lee", lastname: "chang" };
// var firstName = user.firstname;
// var lastName = user.lastname;
// console.log(firstName, lastName);

//ES6
// const user = { firstname: "Lee", lastname: "chang" };
// const { lastname, firstname } = user;
// console.log(firstname, lastname);

//객체 구조분해 할당은 객체를 인수로 전달받는 함수의 매개변수에도 사용할 수 있음

function print({ content, completed }) {
  console.log(`할일 ${content}은 ${completed ? "완료" : "비완료"}`);
}
// print({});

const todo = { id: 1, content: "HTML", completed: true };
// todo객체로부터 id프로퍼티만 가져온다.
const { id } = todo;
