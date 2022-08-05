//카드게임 월남뽕
//52장
//1. 카드 2장을 보여줌 문양+숫자, 문양+숫자 랜덤
//2. 베팅 후 히든 카드 개봉
//3. 돈 오링되면 게임 오버 or 게임 17판 돌면 끝
//4. 1판 게임 후 사용된 카드제거

let number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13];
let pattern = ["♦", "♥", "♣", "♠"];
let hidden = [];
let deck = [];
let com_pick = [];
let user_money = 100000;

//유저가 이겼을 경우
function win_user(user_money, gamble) {
  return (user_money-gamble)+(gamble*2);
}

//유저가 질 경우
function lose_user(user_money, gamble) {
  return (user_money-gamble)-(gamble*2);
}

//랜덤 덱 생성
for (let a = 1; a <= 52; a++) {
  //카드덱 셔플
  let shuffle = pattern[Math.floor(Math.random() * pattern.length)] +  
                number[Math.floor(Math.random() * number.length)] ;
  
  if (deck.indexOf(shuffle) == -1) {
        deck.push(shuffle);
    }
  
    //중첩된 번호 날리고 생성기회 +1
  else if (deck.indexOf(shuffle) >= 0) {
        a--;
    }
  }
    console.log(deck);

alert(
  "월남뽕 게임을 시작합니다.\n컴퓨터가 제시한 2개의 카드를 본 후 베팅할 수 있습니다.\n컴퓨터가 제시한 2개의 카드 범위 안에 들어가면 당신의 승리입니다."
  );


for(let play_game = 1; play_game <= 17; play_game++) {

  //랜덤 2개 지정 및 순차배열
  for (let b = 1; b <= 2; b++) {
    let two_pick = deck[Math.floor(Math.random() * deck.length)];
    if (com_pick.indexOf(two_pick) == -1) {
        com_pick.push(two_pick);
      deck.splice(deck.indexOf(com_pick),1);
    } else if (com_pick.indexOf(two_pick) >= 0) {
      b--;
    }
  }

  console.log(deck);

    com_pick.sort(function(a,b) {
      if (parseInt(a.substr(1, com_pick.length)) > parseInt(b.substr(1, com_pick.length)))
      {   
        return 1;
      }
      else if(parseInt(a.substr(1, com_pick.length)) < parseInt(b.substr(1, com_pick.length)))
      {
        return -1;
      }
      else { 
        return 0; 
      }
    });
   
    console.log(com_pick);
  
// // 컴퓨터 카드 뽑기 후 새로운 배열
// // let last_pick = [];
// // if(parseInt(com_pick[0].substr(1,com_pick[0].length)) > parseInt(com_pick[1].substr(1,com_pick[1].length))){
// //   last_pick=[com_pick[1], com_pick[0]];
// // }
// // else (last_pick=[com_pick[0], com_pick[1]])

// // console.log(last_pick);

// console.log(deck);

alert(
`컴퓨터가 뽑은 두 개의 카드는 ${com_pick[0]}와(과) ${com_pick[1]}입니다.`
)

let gamble = Number(prompt(`크크크크크 돈을 거세요. 당신이 가진 돈은 ${user_money}원입니다
승리하시면 건 돈의 2배를 드립니다!`))

//유저 히든뽑기
let hidden_pick = deck[Math.floor(Math.random() * deck.length)];
    hidden.push(hidden_pick);
    deck.splice(deck.indexOf(hidden_pick),1);
    console.log(hidden_pick);


console.log(deck);

alert(
    "과연....\n당신의 카드는?!"
)

alert(
    `당신의 카드는 ${hidden}입니다!!`
)

//승리
if(parseInt(hidden[0].substr(1, com_pick.length)) > parseInt(com_pick[0].substr(1, com_pick.length)) && 
parseInt(hidden[0].substr(1, com_pick.length)) < parseInt(com_pick[1].substr(1, com_pick.length))) 
{
  alert("당신이 승리하였습니다! 건 금액에 2배를 돌려드립니다!");
  user_money = win_user(user_money,gamble); 
}

//패배
else 
{
  alert("당신이 패배하였습니다! 건 금액에 2배를 가져가겠습니다!");
  user_money = lose_user(user_money,gamble);
}

console.log(parseInt(hidden[0].substr(1, com_pick.length)) > parseInt(com_pick[0].substr(1, com_pick.length)));
console.log(parseInt(hidden[0].substr(1, com_pick.length)) < parseInt(com_pick[1].substr(1, com_pick.length)));

com_pick = [];
hidden = [];

console.log(user_money);

// 게임오버
if(play_game = 0 || user_money <= 0) {
  break;
}
}