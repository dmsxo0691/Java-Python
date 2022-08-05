
let number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13];
let shape = ['spade','heart','club','diamond']
let cards = [];
let pickCard = [];


for(let i = 1; i<53; i++){
    let random = shape[Math.floor(Math.random()*shape.length)] +
                number[Math.floor(Math.random()*number.length)];
        if(!cards.includes(random)){
            cards.push(random);
        }
        else if(cards.includes(random)){
            i--;
        }
}
console.log(cards);



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
console.log(cards);
console.log(pickCard);









