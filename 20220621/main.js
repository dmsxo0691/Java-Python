//배열 빌트인 메서드
//두 가지 패턴: 
//1. 원본배열 변경
//2. 원본배열 변경하지 않고 새로운 배열을 생성해서 반환

const arr = [1,2,2,3];
//indexOf() : 원본 배열에서 인수로 전달된 요소를 검색하여 인덱스를 반환
//            원본 배열에 인수로 전달한 요소와 중복되는 요소가 여러개가 있다면 첫번째로 검색된 요소의 인덱스를 반환
//            원본 배열에 인수로 전달한 요소가 존재하지 않는다면 "-1"을 반환

//배열 arr에서 요소 "2"를 검색하여 첫번째로 검색된 요소의 인덱스 반환
console.log(arr.indexOf(2));
//없으므로 "-1" 반환
console.log(arr.indexOf(4));
//두번째 인수는 검색을 시작할 인덱스. 두번째 인수를 생략하면 처음부터 검색
console.log(arr.indexOf(2,2));

const foods = ['apple','banana','orange'];

//foods 배열에 orange 요소가 있는지 검사
// if(foods.indexOf('subak')===-1){
//     foods.push('subak');
// }

//indexOf 메서드 대신 includes를 활용한 식(가독성이 좋음)
if(!foods.includes('orange')){
    foods.push('orange');
}

console.log(foods);

//push 메서드는 인수로 전달받은 모든 값을 원본 배열의 마지막 요소로 추가한다.
//원본 배열을 직접 변경하는 메서드
// const arr1 = [1,2];
// let result = arr1.push(3,4);
// console.log(arr1);

//만약 마지막 요소에 추가할 요소가 하나라면, length 프로퍼티를 이용하는 것이 더 빠름
const arr2 = [1,2];
arr2[arr2.length] = 3;
console.log(arr2);

//pop() : 원본 배열에서 마지막 요소를 제거하고 제거한 요소를 반환
//원본 배열을 직접 변경하는 메서드
const arr3 = [1,2,3];
let result = arr2.pop();
console.log(result);
console.log(arr2);

//unshift() : 인수로 전달받은 모든 값을 원본 배열의 선두에 요소로 추가하고 변경된 length 프로퍼티 값을 반환
// 원본 배열을 직접 변경하는 메서드

const arr4 = [1,2];
let result1 = arr4.unshift(3,4);
console.log(result1);
console.log(arr4);

//shift() : 원본 배열에서 첫번째 요소를 제거하고 제거한 요소를 반환.
//원본 배열을 직접 변경하는 메서드
const arr5 = [1,2];
let result2 = arr5.shift();
console.log(result2);
console.log(arr5);


//concat() : 인수로 전달된 값들을 원본 배열의 마지막 요소로 추가한 새로운 배열을 반환
//인수로 전달한 값이 배열인 경우 배열을 분해하여 새로운 배열의 요소로 추가함
//원본 배열 변경되지 않는 메서드

const arr6 = [1,2];
const arr7 = [3,4];

//배열 arr7을 원본배열 arr6의 마지막 요소로 추가한 새로운 배열을 반환
//
let result3 = arr6.concat(arr7);
console.log(result3); //[1,2,3,4]

//숫자를 원본 배열 arr6의 마지막 요소로 추가한 새로운 배열을 반환
result3 = arr6.concat(3);
console.log(result3); //[1,2,3]

//배열 arr7, 숫자를 원본 배열 arr6에 마지막 요소로 추가한 새로운 배열을 반환
result3 = arr6.concat(arr7,5);
console.log(result3);

//확인 결과 원본 배열은 변경되지 않는다
console.log(arr6);

//push, unshift 메서드는 concat메서드로 대체 가능
//1. concat은 원본 배열을 변경하지 않고 새로운 배열을 반환
//2. push, unshift 메서드를 사용할 경우 원본 배열을 반드시 변수에 저장해야 함
//3. concat은 반환값을 반드시 변수에 할당해야 함

//splice() : 원본 배열의 중간에 요소를 추가하거나 중간에 있는 요소를 제거하는 경우 사용
//3개의 매개 변수가 있고 원본 배열을 직접 변경함
//1. start : 원본 배열의 요소를 제거하기 시작할 인덱스
//          start가 음수일 경우 배열 끝에서의 인덱스를 나타낸다. ex) -2 = 마지막에서 2번째 요소
//2. deleteCount : start부터 제거할 요소의 개수
//3. items : 제거한 위치에 삽입할 요소들의 목록

const arr8 = [1,2,3,4];
//원본 배열의 인덱스 1부터 2개의 요소를 제거하고 그 자리에 20,30을 insert한다.
const result4 = arr8.splice(1,2,20,30) 
//제거한 요소가 배열로 반환
console.log(result4);
//원본 배열을 직접 변경
console.log(arr8);

//배열에서의 특정 요소 제거
const arr9 = [1,2,3,1,2];

function remove(array,item){
    //제거할 item 요소의 인덱스를 가져옴
    const index = array.indexOf(item);
    //제거할 아이템이 있다면 제거해라
    if(index !== -1)array.splice(index,1);

    return array;
}
console.log(remove(arr9,2));

//slice(): 인수로 전달된 범위의 요소들을 복사해서 배열로 반환
//원본배열은 변경되지 않음

const arr10 = [1,2,3];
//arr10[0]~arr10[1] 이전까지 복사하여 반환
arr10.slice(0,1);
//arr10[1]~arr10[2] 이전까지 복사하여 반환
arr10.slice(1,2);


