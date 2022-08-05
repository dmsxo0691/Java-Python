
class Test {
    int n;
}

public class Sora {
    public static void main(String[] args) {
        Test d = new Test();

        d.n = 100;

        System.out.println("메인에서의 data: " + d.n);
        // callByValue(d.n);
        callByReference(d);

        System.out.println("메인에서의 data: " + d.n);
    }

    // static void callByValue(int n) {
    // n = 2000;
    // System.out.println("함수에서의 데이터: " + n);
    // }

    static void callByReference(Test t) {
        t.n = 2000;
        System.out.println("함수에서의 데이터: " + t.n);
    }
}
