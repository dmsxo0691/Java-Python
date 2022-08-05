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
  } else if (!numOne) {
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
