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
let cash = 10000;

//문양별 번호 배열 생성
const shapeList1 = [];

for(let i = 1; i<14; i++){
    shapeList1.push(i);
}

const spade = [];
for(let i = 0; i<13; i++){
    const index = Math.floor(Math.random()*shapeList1.length);
    const num = shapeList1 [index];
    shapeList1.splice(index,1);
    spade.push(num);
}

const shapeList2 = [];

for(let i = 1; i<14; i++){
    shapeList2.push(i);
}
const heart = [];
for(let i = 0; i<13; i++){
    const index = Math.floor(Math.random()*shapeList2.length);
    const num = shapeList2 [index];
    shapeList2.splice(index,1);
    heart.push(num);
}

const shapeList3 = [];

for(let i = 1; i<14; i++){
    shapeList3.push(i);
}
const club = [];
for(let i = 0; i<13; i++){
    const index = Math.floor(Math.random()*shapeList3.length);
    const num = shapeList3 [index];
    shapeList3.splice(index,1);
    club.push(num);
}

const shapeList4 = [];

for(let i = 1; i<14; i++){
    shapeList4.push(i);
}
const diamond = [];
for(let i = 0; i<13; i++){
    const index = Math.floor(Math.random()*shapeList4.length);
    const num = shapeList4 [index];
    shapeList4.splice(index,1);
    diamond.push(num);
}

const buttun = document.getElementById("buttun");
buttun.addEventListener("click", select);
//카드뽑기 버튼 클릭시 작동 함수
function select(){
    const firstShape = document.getElementById("first-shape");
    const secondShape = document.getElementById("second-shape");
    const thirdShape = document.getElementById("third-shape");
    const firstNumber = document.getElementById("first-number");
    const secondNumber = document.getElementById("second-number");
    const thirdNumber = document.getElementById("third-number");
    
    const firstShapeType = Math.random();
    if(firstShapeType<0.25){
        "spade".innerHTML = firstShape;
        spade[0].innerHTML = firstNumber;
        if(spade.includes(spade[0])){
            spade.splice(spade[0],1);
        }
    }
    else if(firstShapeType<0.5){
        "heart".innerHTML = firstShape;
        heart[0].innerHTML = firstNumber;
        if(heart.includes(heart[0])){
            heart.splice(heart[0],1);
        }
    }
    else if(firstShapeType<0.75){
        "club".innerHTML = firstShape;
        club[0].innerHTML = firstNumber;
        if(club.includes(club[0])){
            club.splice(club[0],1);
        }
    }
    else{
        "diamond".innerHTML = firstShape;
        diamond[0].innerHTML = firstNumber;
        if(diamond.includes(diamond[0])){
            diamond.splice(diamond[0],1);
        }
    }

    const secondShapeType = Math.random();
    if(secondShapeType<0.25){
        "spade".innerHTML = secondShape;
        spade[0].innerHTML = secondNumber;
        if(spade.includes(spade[0])){
            spade.splice(spade[0],1);
        }
    }
    else if(secondShapeType<0.5){
        "heart".innerHTML = secondShape;
        heart[0].innerHTML = secondNumber;
        if(heart.includes(heart[0])){
            heart.splice(heart[0],1);
        }
    }
    else if(secondShapeType<0.75){
        "club".innerHTML = secondShape;
        club[0].innerHTML = secondNumber;
        if(club.includes(club[0])){
            club.splice(club[0],1);
        }
    }
    else{
        "diamond".innerHTML = secondShape;
        diamond[0].innerHTML = secondNumber;
        if(diamond.includes(diamond[0])){
            diamond.splice(diamond[0],1);
        }
    }

    const thirdShapeType = Math.random();
    if(thirdShapeType<0.25){
        "spade".innerHTML = thirdShape;
        spade[0].innerHTML = thirdNumber;
        if(spade.includes(spade[0])){
            spade.splice(spade[0],1);
        }
    }
    else if(thirdShapeType<0.5){
        "heart".innerHTML = thirdShape;
        heart[0].innerHTML = thirdNumber;
        if(heart.includes(heart[0])){
            heart.splice(heart[0],1);
        }
    }
    else if(thirdShapeType<0.75){
        "club".innerHTML = thirdShape;
        club[0].innerHTML = thirdNumber;
        if(club.includes(club[0])){
            club.splice(club[0],1);
        }
    }
    else{
        "diamond".innerHTML = thirdShape;
        diamond[0].innerHTML = thirdNumber;
        if(diamond.includes(diamond[0])){
            diamond.splice(diamond[0],1);
        }
    }
    //console.log(shapeType);
    
    // "spade".innerHTML = firstShape;
    // spade[0].innerHTML = firstNumber;
    // if(spade.includes(firstNumber)){
    //     spade.splice(firstNumber,1);
    // }
    // "spade".innerHTML = secondShape;
    // spade[0].innerHTML = secondNumber;
    // if(spade.includes(secondNumber)){
    //     spade.splice(secondNumber,1);
    // }
    // "spade".innerHTML = thirdShape;
    // spade[0].innerHTML = thirdNumber;
    // if(spade.includes(thirdNumber)){
    //     spade.splice(thirdNumber,1);
    // }
}

console.log(shapeList1);
console.log(spade);
console.log(heart);
console.log(club);
console.log(diamond);


