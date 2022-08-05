package Game;

import java.util.Random;

class Player {
    // 대전게임
    // 플레이어와 몬스터가 존재함
    // 캐릭터 구성요소 (HP, MP, Atk, Dep방어력, 회피율 , Critical, Skill 3개)
    // 몬스터는 세마리
    // 몬스터 죽이면 보상금

    static int HP = 10000;
    static int MP = 1000;
    static int Atk = 700;
    static int Dep = 150;
    static int Evasion = 10;
    static int Critical = 10;

    static int randomNum = (int) (Math.random() * 100);
    static int randomNum2 = (int) (Math.random() * 100);

    void Attack() {
        int Damege = Atk - Monster.Dep;
        if (randomNum < Critical) {
            Damege *= 2;
            System.out.println("Critical!!");
        }
        if (randomNum2 < Monster.Evasion) {
            Damege = 0;
            System.out.println("적이 회피했습니다.");
        }
        Monster.HP = Monster.HP - Damege;
        System.out.println(Damege);
        System.out.println("적의 체력" + Monster.HP);
    }

    void FireBall() {
        if (MP < 100) {
            System.out.println("MP가 부족합니다.");
            App.turn = false;
        }
        int Damege = (Atk * 2) - Monster.Dep;
        if (randomNum < Critical) {
            Damege *= 2;
            System.out.println("Critical!!");
        }
        if (randomNum2 < Monster.Evasion) {
            Damege = 0;
            System.out.println("적이 회피했습니다.");
        }
        Monster.HP = Monster.HP - Damege;
        System.out.println(Damege);
        System.out.println("적의 체력" + Monster.HP);
        MP = MP - 100;
    }

    void Lightning() {
        if (MP < 200) {
            System.out.println("MP가 부족합니다.");
            App.turn = false;
        }
        for (int i = 0; i < 3; i++) { // 별개의 치명타, 회피 확률을 가진 연속 공격 3번
            int Damege = Atk - Monster.Dep;
            if (randomNum < Critical) {
                Damege *= 2;
                System.out.println("Critical!!");
            }
            if (randomNum2 < Monster.Evasion) {
                Damege = 0;
                System.out.println("적이 회피했습니다.");
            }
            Monster.HP = Monster.HP - Damege;
            System.out.println(Damege);
            System.out.println("적의 체력" + Monster.HP);
        }
        MP = MP - 200;
    }

    void Meteor() {
        if (MP < 300) {
            System.out.println("MP가 부족합니다.");
            App.turn = false;
        }
        int Damege = (Atk * 10) - Monster.Dep;
        if (randomNum < Critical) {
            Damege *= 2;
            System.out.println("Critical!!");
        }
        if (randomNum2 / 2 < Monster.Evasion) { // 데미지 메리트에 따른 명중률 디메리트
            Damege = 0;
            System.out.println("적이 회피했습니다.");
        }
        Monster.HP = Monster.HP - Damege;
        System.out.println("적의 체력" + Monster.HP);
        MP = MP - 300;
    }

    void Defence() {
        HP += 300;
        MP += 150;
    }
}
