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

    void method2(Insect spider) {
        spider.Attack();
    }
}

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous a = new Anonymous();
        a.spider1.Attack();
        a.method1();
        a.method2(new Insect() {
            String name = "타란튤라";

            @Override
            void Attack() {
                System.out.println(name + " : 공격하지 않고 후퇴");
            }
        });
        a.spider1.Attack();
    }
}
