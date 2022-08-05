
class Unit {
    int HP;
    int DP;
    int Stk;
    int Miss;
    int Cri;
}

class Player extends Unit {
    int MP;

    Player(int h, int m, int d, int s, int M, int c) {
        HP = h;
        MP = m;
        DP = d;
        Stk = s;
        Miss = M;
        Cri = c;
    }
}

class Monster extends Unit {

    Monster(int h, int d, int s, int M, int c) {
        HP = h;
        DP = d;
        Stk = s;
        Miss = M;
        Cri = c;
    }
}

public class Sub {
    // Unit 클래스를 만들고
    // 1. 유닛 클래스를 상속 받아서 Player와 Monster 클래스를 만든다.
    // 2. Player와 Monster의 정보를 출력한다.
    public static void main(String[] args) {
        Player man = new Player(10000, 1000, 500, 1000, 10, 10);
        Monster mon = new Monster(20000, 400, 800, 10, 10);

        System.out.println("플레이어의 스텟: " + "HP-" + man.HP + " MP-" + man.MP + " DP-" + man.DP + " Stk-" + man.Stk);
        System.out.println("몬스터의 스텟: " + "HP-" + mon.HP + " DP-" + mon.DP + " Stk-" + mon.Stk);
    }
}
