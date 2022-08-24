public class Example2 {
    interface Math {

        int sum(int n1, int n2);

    }

    static int doSomething(Math math) {
        return math.sum(10, 20);
    }

    // 람다식을 사용하여 동일 내용 구현
    // 익명 함수와 비슷하지만 불필요한 선언부 모두 생략 가능
    // 인터페이스의 함수의 구현부만 정의 - 코드가 가장 간결
    public static void main(String[] args) {
        int result = doSomething((n1, n2) -> n1 + n2);
        // int result = doSomething(new Math() { // Anonymous funtion

        // @Override
        // public int sum(int n1, int n2) {
        // return n1 + n2;
        // }

        // });
        System.out.println(result);
    }
}

// 람다식의 특징
// 클래스를 구현하지 않아도 사용 가능
// 인터페이스(추상 메소드)를 구현
// Abstract 클래스의 경우 익명 함수는 가능하나 람다식 구현 안됨
// 인자를 전달할 수 있고 결과를 리턴할 수 있다.
// 코드가 간결하다