class AA {
    void abc() { // 인스턴스 메소드
        System.out.println("instance 메소드");
    }

    static void bcd() { // 정적 메소드
        System.out.println("static메소드");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // 인스턴스 메소드 활용(객체를 생성한 후 사용 가능)
        AA a1 = new AA();
        a1.abc();

        // 정적 메소드 활용
        // 1. 클래스명으로 바로 접근해서 사용
        AA.bcd();

        // 2. 객체를 생성한 후 사용(권장X)
        AA a2 = new AA();
        a2.bcd();
    }
}