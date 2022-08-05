

let computerScore = 0; 
let userScore = 0;

function onComputerShoot(){

    const textElem = document.getElementById("text")
    const shootType = Math.random() < 0.5 ? 2:3;
    const comElem = document.getElementById("computer-score")


    if(shootType==2){
        if(Math.random() < 0.5)
        {
            textElem.innerHTML = "2점슛 성공";
            computerScore +=2;
            comElem.innerHTML = computerScore;
            
        }
        else
        {
            textElem.innerHTML = "2점슛 실패";
        }
    }
    else
    {
        if(Math.random()<0.33)
        {
            textElem.innerHTML = "3점슛 성공"
            computerScore +=3;
            comElem.innerHTML = computerScore;
        }
        else
        {
            textElem.innerHTML = "3점슛 실패"
        }
    }
}

function on2Shoot(){
    const textElem = document.getElementById("text")
    const userElem = document.getElementById("user-score");
    const percentage = Math.random();
    
    if(percentage<0.5)
    {
        textElem.innerHTML = "2점슛 성공";
        userScore +=2;
        userElem.innerHTML = userScore;
    }
    else
    {
        textElem.innerHTML = "2점슛 실패";
    }
}

function on3Shoot(){
    const textElem = document.getElementById("text")
    const userElem = document.getElementById("user-score");
    const percentage = Math.random();
    
    
    if(percentage<0.3)
    {
        textElem.innerHTML = "3점슛 성공";
        userScore +=3;
        userElem.innerHTML = userScore;
    }
    else
    {
        textElem.innerHTML = "3점슛 실패";
    }
}





//클릭에 대한 반응 버튼은 이걸 더 많이 사용함
//btn이라는 버튼이 있다 가정
// const btnId = document.getElementById('btn').addEventListener("click",함수); //메서드 체이닝: 함수가 이어져 있는 것
// btnId.addEventListener("click",함수)








