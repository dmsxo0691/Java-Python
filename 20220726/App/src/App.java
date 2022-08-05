
class Data {
    // 명시적 초기화
    // int n = 100;

    int count;
    int num;
    String name;
    int number;

    // 인스턴스 초기화 블럭
    // 생성자와 같이 인스턴스를 생성할 때마다 실행됨
    // 생성자보다 인스턴스 초기화 블럭이 먼저 실행됨
    // 모든 생성자에서 공통으로 돌아갈 코드를 작성함
    {
        count++;
        number = count;
    }

    Data() {

        // 중복
        // count++;
        // number = count;
    }

    Data(String name, int number) {

        // 중복
        // count++;
        // number = count;
        this.name = name;
        this.number = number;
    }

    // 클래스 초기화 블럭
    // 클래스 변수의 복잡한 초기화에 사용
    // 클래스가 메모리에 처음으로 로딩될 때 한 번만 실행됨
    // static {

    // }
}
/*
 * 멤버 변수 초기화
 * 명시적 초기화
 * 생성자 초기화
 * 초기화 블럭
 * 1. 인스턴스 초기화 블럭: 인스턴스 변수를 초기화할 때
 * 2. 클래스 초기화 블럭: 클래스 변수를 초기화할 때
 */

public class App {

    // 클래스 초기화 블럭
    // 1번만 실행
    static {
        System.out.println("안녕 나는 클래스 초기화 블럭이야0");
    }
    // 인스턴스 초기화 블럭
    // 인스턴스 생성마다 실행
    {
        System.out.println("안녕 나는 인스턴스 초기화 블럭이야/");
    }

    // 생성자
    App() {
        System.out.println("안녕 나는 App 생성자야");
    }

    public static void main(String[] args) {

        App a = new App();
        System.out.println("====================");
        App b = new App();

        /*
         * 멤버 변수의 초기화 시기와 순서
         * 클래스 변수의 초기화 시점: 클래스가 처음 로딩될 때 한번만 실행
         * 인스턴스 변수의 초기화 시점: 인스턴스가 생성될때마다 각 인스턴스 별로 초기화된다.
         * 
         * 클래스 변수의 초기화 순서: default value -> 명시적 초기화 -> 클래스 초기화 블럭
         * 인스턴스 변수의 초기화 순서: default value -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
         */
    }
}
