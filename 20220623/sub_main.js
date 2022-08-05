//숙제:월남뽕
//조커 뺀 트럼프카드 52장
// 스페이드, 하트, 클로버, 다이아
// A = 1, j = 11, q = 12, k = 13
// 각 문양마다 A~K
// 랜덤의 3장의 카드를 보여줌
// ex)하트3, 클로버7, 다이아4
//     A        B       C
// 숫자로만 비교했을 때, C의 값이 A와 B 사이에 있으면 승리 이외엔 모두 패배
// 한번 뽑힌 카드는 더이상 나오면 안됨
// 종료조건 = 카드 소진 OR 배팅금액 소진
// 이길 시: 배팅금액 2배

//1. 소지금 배팅금액
//2. 랜덤한 3장의 카드 보여주고
//3. 한번 사용된 카드 재사용 금지
//4. 소지금 0 OR 카드를 다 소진

let number = [01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12, 13];
let shape = ['spade','heart','club','diamond']
let cards = [];
let pickCard = [];
let cash = 10000;
let batCash = Number(prompt(`배팅금액을 설정하세요. \n 소지금: ${cash}`))
cash = cash-batCash;

const firstCard = document.getElementById("first-card");
const secondCard = document.getElementById("second-card");
const thirdCard = document.getElementById("third-card");
const buttun = document.getElementById("buttun");
buttun.addEventListener("click", select);



    for(let i = 1; i<53; i++){
        let random = shape[Math.floor(Math.random()*shape.length)]
                     + number[Math.floor(Math.random()*number.length)];
            if(!cards.includes(random)){
                cards.push(random);
            }
            else if(cards.includes(random)){
                i--;
            }
    }



//카드뽑기 버튼 클릭시 작동 함수
function select(){

    for(let i=1; i<4; i++){
        let threeCards = cards[Math.floor(Math.random()*cards.length)];
        if(!pickCard.includes(threeCards)){
            pickCard.push(threeCards);
            cards.splice(cards.includes(threeCards),1)
        }
        else if(pickCard.includes(threeCards)){
            i--;
        }
    }

    firstCard.innerHTML = pickCard[0];
    secondCard.innerHTML = pickCard[1];
    thirdCard.innerHTML = pickCard[2];
    
    
    console.log(parseInt(pickCard[0]));
    console.log(cash);
    // console.log(Number(pickCard[1]))
    // console.log(Number(pickCard[2]))

    if(Number(pickCard[0])>Number(pickCard[2])<Number(pickCard[1]) 
    || Number(pickCard[1])>Number(pickCard[2])<Number(pickCard[0]))
    {
        alert("승리")
        cash = cash+batCash;
    }
    else{
        alert("패배")
        cash = cash
    }
    if(cards.length == 4 || cash <= 0){
        alert("게임종료")
    }


    pickCard = [];
}




