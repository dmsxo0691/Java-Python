public class Example1 {
    interface Math {

        int sum(int n1, int n2);

    }

    // Math 인터페이스를 구현한 MyMath 클래스의 객체가 한번만 사용되고
    // 재사용되지 않는다면 비효율적일 수 있다 - 이럴때 익명함수 사용
    // static class MyMath implements Math {
    // public int sum(int n1, int n2) {
    // return n1 + n2;
    // }
    // }

    static int doSomething(Math math) {
        return math.sum(10, 20);
    }

    // Example과 동일한 내용 구현, 한번만 사용되는 객체를 만들기 위해 클래스를
    // 구현하지 않아도 된다. 그러힉 때문에 익명 객체는 클래스 이름이 없다.
    public static void main(String[] args) {
        int result = doSomething(new Math() { // Anonymous funtion

            @Override
            public int sum(int n1, int n2) {
                return n1 + n2;
            }

        });
        System.out.println(result);
    }
}
