const list = [];

for(let i = 0; i<=45; i++){
    list.push(i);
}

const result = [];
for(let i = 0; i<6; i++){
    const index = Math.floor(Math.random()*list.length);
    const num = list [index];
    list.splice(index,1);
    result.push(num);
}

for(let i = 0; i<6; i++){
    document.write('<span class = "ball">'+result[i]+'</span>')
}


