class A {
    int m = 3;
    static int n = 5;
}

public class B {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        a1.m = 5;
        a2.m = 6;
        System.out.println(a1.m);
        System.out.println(a2.m);

    }
}
// Static member 정적 멤버의 특징
// 객체생성 없이 "클래스명"."멤버명"으로 호출 가능
// -> static member : 객체 생성 안해도 사용 가능
// -> instance member : 객체 생성 후 사용 가능
