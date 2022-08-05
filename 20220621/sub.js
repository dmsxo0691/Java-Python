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

randomL.sort(function(a,b){
    return a-b;
});
console.log(randomL);