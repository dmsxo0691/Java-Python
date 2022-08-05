
class Math {
    int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    int mul(int a, int b) {
        int result = a * b;
        return result;
    }

    double divide(double a, double b) {
        double result = a / b;
        return result;
    }
}

class Math2 {
    int a, b; // 인스터스 변수

    // 인스턴스 a b만을 이용해서 동작하기 때문에 매개 변수가 필요없음
    int sum() {
        int result = a + b;
        return result;
    }

    int sub() {
        int result = a - b;
        return result;
    }

    int mul() {
        int result = a * b;
        return result;
    }

    double divide() {
        double result = a / b;
        return result;
    }

    // 클래스 메서드
    // 인스턴스 변수인 a, b를 사용하지 않는다.
    static int sum(int a, int b) {
        int result = a + b; // 지역변수
        return result;
    }

    static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    static int mul(int a, int b) {
        int result = a * b;
        return result;
    }

    static double divide(double a, double b) {
        double result = a / b;
        return result;
    }
}

public class Function {
    public static void main(String[] args) {
        Math2 m = new Math2();
        m.a = 200;
        m.b = 100;
        int res = m.sum();
        int res1 = m.sub();
        int res2 = m.mul();
        double res3 = m.divide();
        System.out.println("인스턴스 메서드 호출");
        System.out.println("더하기 함수 호출 : " + res);
        System.out.println("빼기 함수 호출 : " + res1);
        System.out.println("곱하기 함수 호출 : " + res2);
        System.out.println("나누기 함수 호출 : " + res3);

        System.out.println("클래스 메서드 호출");
        System.out.println(Math2.sum(11, 2));
        System.out.println(Math2.sub(15, 2));
        System.out.println(Math2.mul(20, 2));
        System.out.println(Math2.divide(10, 2));

        // 인스턴스 메서드와 클래스 메서드의 차이점과 어떤 경우에 사용해야 하는지 알아야 한다.

    }

    // 함수는 왜 쓰는걸까
    // 1. 중복된 코드 제거 2. 재사용

    // 반환타입 함수 이름
    // void Print ()

    // int add(int a, int b){
    // int result = a+b;
    // return result;
    // }

    // 메서드를 호출할 때 괄호 안에 지정해준 값?
    // 인자는 메서드에서 호출되면서 매개변수에 대입됨. 해서 인자의 타입은 매개변수의 타입과 동일하거나 자동 형변환이 가능한 값을 넣어줘야 함

    // 클래스 메서드, 인스턴스 메서드
    // 클래스 메서드 : 객체를 생성하지 않아도 사용 가능 (static)
    // 클래스 메서드를 사용해야하는 상황: 인스턴스와 관계가 없는 메서드를 클래스 메서드로 정의한다.
    // 인스턴스 메서드: 인스턴스 변수와 관련된 작업을 한다. 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드
    // 인스턴스 메서드 역시 객체를 생성해야만 사용할 수 있다.

    // 클래스를 설계할 때 멤버 변수 중에 모든 인스턴스에 공통으로 사용하는 것에 static을 붙인다.
    // 클래스 메서드는 인스턴스 변수를 사용할 수 없다. 클래스는 있으나 인스턴스가 없는 상황이 발생할 수도 있기 때문

    // 인스턴스 변수나 인스턴스 메서드는 static이 붙은 멤버들을 사용하는 것이 가능하다.
    // 인스턴스가 메모리 내에 있다는 건 클래스, 즉 static 멤버들이 메모리 내에 자리하고 있음을 의미하기 때문이다.
    // 메서드 내에서 인스턴스 변수를 쓰지 않는다면 static을 붙이는 것을 고려하자. 성능적으로 효율이 좋아지기 때문

}
