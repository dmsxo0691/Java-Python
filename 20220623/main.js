//String

const str = "hello World";
//인수로 전달받은 문자열을 검색해서 첫번째 인덱스 반환.
console.log(str.indexOf('l'));
//or을 검색해서 첫번째 인덱스 반환 -> 7
console.log(str.indexOf('or'));
//없으면 -1 반환
console.log(str.indexOf('a'));
//인덱스 3부터 'l'을 검색하겠다. 첫번째 인덱스 반환
console.log(str.indexOf('l',3));

// if(str.indexOf('hello')==-1){
//     //hello가 문자열에 포함되어 있는 경우 처리할 코드
// }

// if(str.includes('hello')){
//     //hello가 문자열에 포함되어 있는 경우 처리할 코드
// }


//ES6
//대상 문자열이 인수로 전달받은 문자열로 시작하는지 확인(trun, false)
console.log(str.startsWith('he'));
console.log(str.startsWith('He'));



//인덱스 1부터 인덱스 4 인전까지의 부분문자열을 반환
//두번째 인수는 생략 가능, 이때 첫번째 인수로 전달한 
//인덱스에 위치하는 문자부터 마지막 문자까지 부분문자열 반환
//substring의 첫번째 인수는 두번째 인수보다 작은 정수여야 정상
//첫번째 인수 > 두번째 인수인 경우 교환
//인수 < 0 or NaN(not a number) 인 경우 0으로 취급
console.log(str.substring(1,4));

//스페이스 기준으로 앞에 있는 부분문자열
console.log(str.substring(0,str.indexOf(' ')));
//스페이스 기준으로 뒤에 있는 부분문자열
console.log(str.substring(str.indexOf(' ')+1,str.length));



console.log(str.substring(0,5));
console.log(str.slice(0,5));

console.log(str.substring(2));
console.log(str.slice(2));

//0으로 취급
console.log(str.substring(-5));
//뒤에서 5자리를 잘라내서 반환
console.log(str.slice(-5));


console.log(str.toUpperCase()); //모두 대문자
console.log(str.toLowerCase()); //모두 소문자



const str1 = " fo o  ";
//문자열의 앞뒤에 공백문자가있을 경우 제거하고 반환
console.log(str1.trim());

//첫번째 인수를 찾아서 두번째 인수로 치환
console.log(str.replace('World','Lee'));

const str2 = "how are you doing?";
//split : 대상 문자열에서 첫번째 인수로 전달한 문자열또는 정규표현식을 검색하여
//문자열을 구분한 후 분리된 각 문자열로 배열을 반환
//공백(단어)으로 구분하여 배열로 반환
console.log(str2.split(' '));
//빈문자열로 인수를 넣으면 각 문자를 모두 분리한다.
console.log(str2.split(''));
//인수 생략 시 문자열 전체를 배열로 반환
console.log(str2.split());


//split은 배열로 반환하기 때문에 Array.reverse, join등을 이용하여 문자열을 뒤집을 수 있다
function reverseString(str){
    return str.split('').reverse().join('');
}
const Hellostr = 'Hello World';
console.log(reverseString(Hellostr));





