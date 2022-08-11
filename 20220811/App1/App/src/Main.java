public class Main {
    public static void main(String[] args) {
        Hero[] heros = new Hero[3];

        heros[0] = new Warrior("전사");
        heros[1] = new Archer("궁수");
        heros[2] = new Wizard("마법사");
        // 배열 생성 후 직업을 기재해줌

        for (int i = 0; i < heros.length; i++) {
            heros[i].attack();

            if (heros[i] instanceof Warrior) { // 접근하고 있는 인스턴스가 전사가 맞는지 확인
                Warrior temp = (Warrior) heros[i]; // 형변환 후 temp에 담아서 인스턴스 생성
                temp.groundCutting();
            }
            if (heros[i] instanceof Archer) {
                Archer temp = (Archer) heros[i];
                temp.fireArrow();
            }
            if (heros[i] instanceof Wizard) {
                Wizard temp = (Wizard) heros[i];
                temp.freezing();
            }
            // 배열이 돌면서 해당 인덱스에 해당하는 캐릭터의 속성을 진행
        }
    }
}
