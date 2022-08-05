let numOne = "";
let numTwo = "";
let operator = "";

const $operator = document.querySelector("#operator");
const $result = document.querySelector("#result");

//숫자버튼 클릭
const onClickNum = (event) => {
  if (!operator) {
    numOne += event.target.textContent;
    $result.value += event.target.textContent;
    return;
  }
  //여기부터는 operator가 존재하는 경우에만 실행
  //값을 저장하기 전에 비워버림
  if (!numTwo) {
    $result.value = "";
  }
  numTwo += event.target.textContent;
  $result.value += event.target.textContent;
};

const onClickOper = (op) => () => {
  if (numOne) {
    operator = op;
    $operator.value = op;
  }
  if (numTwo) {
    switch (operator) {
      case "+":
        $result.value = parseInt(numOne) + parseInt(numTwo);
        numOne = parseInt(numOne) + parseInt(numTwo);
        numTwo = "";
        break;

      //더하기 외에 나머지 연산자들은 알아서 숫자로 변경해주기 때문에 parseInt가 필요하지 않음
      case "-":
        $result.value = numOne - numTwo;
        numOne = numOne - numTwo;
        numTwo = "";
        break;

      case "/":
        $result.value = numOne / numTwo;
        numOne = numOne / numTwo;
        numTwo = "";
        break;

      case "*":
        $result.value = numOne * numTwo;
        numOne = numOne * numTwo;
        numTwo = "";
        break;

      default:
        break;
    }
  } else {
    alert("숫자 먼저 입력해라");
  }
};
document.querySelector("#num-0").addEventListener("click", onClickNum);
document.querySelector("#num-1").addEventListener("click", onClickNum);
document.querySelector("#num-2").addEventListener("click", onClickNum);
document.querySelector("#num-3").addEventListener("click", onClickNum);
document.querySelector("#num-4").addEventListener("click", onClickNum);
document.querySelector("#num-5").addEventListener("click", onClickNum);
document.querySelector("#num-6").addEventListener("click", onClickNum);
document.querySelector("#num-7").addEventListener("click", onClickNum);
document.querySelector("#num-8").addEventListener("click", onClickNum);
document.querySelector("#num-9").addEventListener("click", onClickNum);
document.querySelector("#plus").addEventListener("click", onClickOper("+"));
document.querySelector("#minus").addEventListener("click", onClickOper("-"));
document.querySelector("#divide").addEventListener("click", onClickOper("/"));
document
  .querySelector("#multuiply")
  .addEventListener("click", onClickOper("*"));
document.querySelector("#calculate").addEventListener("click", () => {
  if (numTwo) {
    switch (operator) {
      case "+":
        $result.value = parseInt(numOne) + parseInt(numTwo);
        numOne = parseInt(numOne) + parseInt(numTwo);
        numTwo = "";
        break;

      //더하기 외에 나머지 연산자들은 알아서 숫자로 변경해주기 때문에 parseInt가 필요하지 않음
      case "-":
        $result.value = numOne - numTwo;
        numOne = numOne - numTwo;
        numTwo = "";
        break;

      case "/":
        $result.value = numOne / numTwo;
        numOne = numOne / numTwo;
        numTwo = "";
        break;

      case "*":
        $result.value = numOne * numTwo;
        numOne = numOne * numTwo;
        numTwo = "";
        break;

      default:
        break;
    }
  } else {
    alert("숫자 입력해라.");
  }
});
document.querySelector("#clear").addEventListener("click", () => {
  //숙제 : 1.채우기
  numOne = "";
  numTwo = "";
  operator = "";
  $result.value = "";
  $operator.value = "";
});

console.log(numOne);
// 연이어서 계산이 가능한 계산기 만들기

// const func = (msg) => {
//   return () => {
//     console.log(msg);
//   };
// };

//위 func처럼 함수 본문에서 바로 리턴되는 값이 있으면 return과 {}를 생략할 수 있다
// const func = (msg) =>()=>{
//     console.log(msg);
// }

//1.if문 다음에 나오는 공통된 절차를 각 분기점 내부에 넣는다
//2.분기점에서 짧은 절차부터 실행할 수 있도록 if문 작성
//3.짧은 절차가 끝났을 경우 return(함수 내부의 경우) 또는 break(for문 내부의 경우)로 중단한다.
//4.else 제거(이 때 중첩된 녀석이 사라짐)
//5.다음 중첩이 생길 경우 1~4과정 반복
