public class test {
    public static void main(String[] args) {
        Outer o = new Outer();

        // static이 붙은 변수는 "클래스명.변수명"
        // static이 붙지 않은 변수는 "객채명.변수"로 지정한다.

        System.out.println("o.a = " + o.a);
        System.out.println("Outer.b = " + Outer.b);
        // Outer class 안에 있는 Inner 클래스의 변수 c 출력
        Outer.Inner oi = o.new Inner();
        System.out.println("oi.c = " + oi.c);

        // Outer class 안에 있는 Inner 클래스의 foo() 메소드 호출
        oi.foo();

        // Outer class 안에 있는 SInner 클래스의 d 출력
        Outer.Sinner osi = new Outer.Sinner();
        System.out.println("osi.d = " + osi.d);

        osi.bar();

        // baz() 메소드가 static으로 선언했기 때문에 아래와 같이 클래스명, 내부클래스명, 메소드로
        Outer.Sinner.baz();
    }
}
