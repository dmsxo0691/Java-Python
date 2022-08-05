package Game;

public class Monster {
    static int HP = 20000;
    static int Atk = 300;
    static int Dep = 200;
    static int Evasion = 10;
    static int Critical = 10;

    static int randomNum = (int) (Math.random() * 100);
    static int randomNum2 = (int) (Math.random() * 100);

    void Attack() {
        int Damege = Atk - Player.Dep;
        if (randomNum < Critical) {
            Damege *= 2;
            System.out.println("치명적인 피해를 입었습니다.");
        }
        if (randomNum2 < Monster.Evasion) {
            Damege = 0;
            System.out.println("Player가 회피했습니다.");
        }
        Player.HP = Player.HP - Damege;
        System.out.println(Damege);
        System.out.println("나의 체력: " + Player.HP);
    }

    void Rage() {
        for (int i = 0; i < 10; i++) { // 별개의 치명타, 회피 확률을 가진 연속 공격 10번
            int Damege = (Atk / 3) - Player.Dep; // 공격횟수에 따른 데미지 조정
            if (randomNum < Critical) {
                Damege *= 2;
                System.out.println("Critical!!");
            }
            if (randomNum2 < Player.Evasion) {
                Damege = 0;
                System.out.println("Player가 회피했습니다.");
            }
            Player.HP = Player.HP - Damege;
            System.out.println(Damege);
            System.out.println("나의 체력: " + Player.HP);
            HP -= 300; // 몬스터는 MP대신 HP 소모
        }
    }

    void Smash() {
        int Damege = (Atk * 5) - Player.Dep;
        if (randomNum < Critical) {
            Damege *= 2;
            System.out.println("치명적인 피해를 입었습니다.");
        }
        if (randomNum2 < Monster.Evasion) {
            Damege = 0;
            System.out.println("Player가 회피했습니다.");
        }
        Player.HP = Player.HP - Damege;
        System.out.println(Damege);
        System.out.println("나의 체력: " + Player.HP);
        HP -= 1000;
    }

    void Riot() { // 체력이 일정 수치 이하일 경우 시전 가능한 스킬. 회피 불가
        for (int i = 0; i < 2; i++) {
            int Damege = (Atk * 3) - Player.Dep;
            if (randomNum < Critical) {
                Damege *= 2;
                System.out.println("치명적인 피해를 입었습니다.");
            }
            Player.HP = Player.HP - Damege;
            System.out.println(Damege);
            System.out.println("나의 체력: " + Player.HP);
        }

    }
}
