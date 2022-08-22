class AAA {
    int i = 100;
    BBB b = new BBB();

    class BBB {
        void method() {
            // AAA a = new AAA();
            // System.out.println(a.i);
            System.out.println(i); // 객체생성없이 외부 클래스로 접근 가능
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        // BBB b = new BBB();
        // b.method();
        AAA a = new AAA();
        AAA.BBB b = a.new BBB();
        b.method();
    }
}
