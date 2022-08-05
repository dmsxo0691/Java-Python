//오늘의 숙제1
//Monster 부모 클래스를 만들고 상속관계를 이용해서
//Boss몹, 기타 잡몹 만들기


class Monster {
    constructor(name, hp, atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }
    attack(atk){
        this.atk = atk;
        console.log("Player가 "+this.name+"에게 공격받아 "+this.atk+"의 데미지를 입습니다.");
    }
}

class smallMonster extends Monster{
    attack(atk){
        this.atk = atk;
        console.log("Player가 "+this.name+"에게 공격받아 "+this.atk+"의 데미지를 입습니다.");
    }
}


let bossMob = new Monster("보스몹", 10000);
let gobrin = new smallMonster("고블린", 1000);

bossMob.attack(10000);
gobrin.attack(1000);


//오늘의 숙제2
//클래스 플레이어 만들기
//1. 플레이어가 때리면 몬스터의 Hp가 감소
//2. 몬스터가 때리면 플레이어 Hp가 감소
//스킬 1. 랜덤 확률 발사 
//스킬 2. 확률적으로 회피가 되지만, 적중시 데미지 세배
//스킬 3. 확률적으로 데미지 두배

function pAtkHtml(){
    return score.innerHTML=(player.name+" 의 Hp가 "+player.hp+" 남았습니다!")
}

class Player {
    constructor(name,hp,atk){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }
    attack(atk){
        this.atk = atk;
        mon.hp = mon.hp - this.atk;
        score.innerHTML=(this.name+"이(가) " +mon.name+"을 공격하여"+this.atk+"의 데미지를 입힙니다."
        + "<br>" + mon.name + " 의 Hp가 " + mon.hp + " 남았습니다!");
        if(mon.hp <= 0){
            alert(mon.name + " (이)가 사망했습니다.")
            mon.hp = 1000;
        }
    }
}
class BMonster {
    constructor(name,hp,atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }
    attack(atk){
        this.atk = atk;
        player.hp = player.hp - this.atk;
        score.innerHTML=(player.name + "이(가) "+this.name+"에게 공격받아 "+this.atk+"의 데미지를 입습니다."
        +"<br>" + player.name+" 의 Hp가 " + player.hp + " 남았습니다!");
        if(player.hp <=0){
            alert(player.name + " (이)가 사망했습니다.")
            player.hp = 1000;
        }
    }
}


const player = new Player("김땡땡",10000);
const mon = new BMonster("보스몹",10000);

const playerAtk = document.getElementById("playerAtk");
const monAtk = document.getElementById("monAtk");
const score = document.getElementById("score");


player.attack(1000);

mon.attack(1000);


