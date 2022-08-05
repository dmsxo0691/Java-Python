

// const arr = [1,2,3,4];
// //join() 원본배열의 모든 요소를 문자열로 변환
// //인수로 전달받은 문자열, 구분자로 연결한 문자열을 반환
// //const result = arr.join(':');

// //reverse: 순서를 반대로, 원본배열 변동
// const reverseResult = arr.reverse();

// console.log(reverseResult);

// //고차함수(함수를 인수로 전달받거나 함수를 리턴하는 함수)
// //자바 스크립트는 고차함수를 지원함. 특히 배열은 매우 유용한 고차함수를 지원
// const fruits = ['nanana', 'apple', 'orange'];
// fruits.sort();
// console.log(fruits);

//정리해둘 것
// 배열과 관련된 메서드
// map, filter, reduce,some,every,find

//1. 로또 번호 생성기
//1~45 난수 생성(중복제거) 
//6개의 랜덤한 숫자를 뽑는다

const L = [];
for(let i = 0; i<45; i++){
    L.push(i+1);
}

const randomL = [];
for(let n = 0; n<6; n++){
    const B = Math.floor(Math.random()*L.length);
    randomL.push(L[B]);
    L.splice(B,1);
}

console.log(randomL);






