class Insect {
    void Attack() {
        System.out.println("곤충은 공격을 한다");
    }
}

class Anonymous {
    Insect spider1 = new Insect() {
        String name = "무당거미";

        @Override
        void Attack() {
            System.out.println(name + " : 독을 발사한다");
        }
    };

    void method1() {
        Insect spider2 = new Insect() {
            String name = "늑대거미";

            @Override
            void Attack() {
                System.out.println(name + " : 앞니로 문다");
            }
        };
        spider2.Attack();
    }
}

public class AnonymousExample {

}
