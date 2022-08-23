class Insect {
    void Attack() {
        System.out.println("곤충은 공격을 한다");
    }
    // 부모클래스로 정의
}

class Anonymous {
    // 방법1 : 필드에 익명자식 객체를 생성
    Insect spider1 = new Insect() {
        String name = "무당거미";

        @Override
        void Attack() {
            System.out.println(name + " : 독을 발사한다");
        }
    };

    // 방법2 : 로컬 변수의 초기값으로 대입
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

    // 방법3 : 익명개체를 매개변수로 대입
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
