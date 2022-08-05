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


let shapeType = Math.random();
if(shapeType<0.25){
    shapeType = "spade";
}
else if(shapeType<0.5){
    shapeType = "heart";
}
else if(shapeType<0.75){
    shapeType = "club";
}
else{
    shapeType = "diamond";
}
console.log(heart[0]);

