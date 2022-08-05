
/*
 * 변수는 Class Variable, instance Variable, Local Variable
 * 
 * 지역변수 : 함수, 초기화 내부 블럭, 생성자에 생성된 변수
 *      변수 선언이 실행되었을 때 생성된다.
 * 
 * 인스턴스변수: 클래스 영역 내부에 생성됨, 인스턴스가 생성될 때 생성됨
 * 클래스변수: 클래스 영역 내부에 생성됨, 클래스가 메모리에 올라갈 때
 * 
 * 인스턴스변수: 인스턴스변수의 값을 read, write 할 때는 먼저 인스턴스를 생성해야 한다.
 * 클래스변수: 공통된 공간을 공유하게 된다. 한 클래스의 공통적인 값을 유지해야하는 속성의 경우
 *              클래스 변수로 선언한다. 인스턴스를 생성하지 않고 바로 사용할 수 있는 특징이 있다.
 *              클래스가 생성될 때 동시에 생성되기 때문
 * **지역변수, 인스턴스 변수, 클래스 변수의 차이점은 반드시 알아야 한다.
 */
class Data {
    // int intanceVal; //인스턴스 변수
    // static int n; //클래스 변수(공유)

    // void print(){
    // int number; //지역변수
    // }

    // 인스턴스 변수
    String name;
    int productNumber;

    // 클래스 변수
    static int width = 100;
    static int height = 200;
}

public class App {
    public static void main(String[] args) {
        System.out.println("제품의 가로 크기: " + Data.width);
        System.out.println("제품의 세로 크기: " + Data.height);
        Data d = new Data();
        d.name = "♥ 올레드 티비";
        d.productNumber = 10;

        System.out.println("d의 이름: " + d.name);
        System.out.println("d의 제품번호: " + d.productNumber);

        Data d1 = new Data();
        d1.name = "★ 시그니처 티비";
        d1.productNumber = 20;

        System.out.println("d1의 이름: " + d1.name);
        System.out.println("d1의 제품번호: " + d1.productNumber);

        // 클래스 변수로 선언된 변수를 수정할 경우 다른 객체에 클래스 변수의 값도 변동됨
        // 인스턴스변수가 아님을 인지시키기 위해 객체명.변수명 = 값 의 양식으로 수정하는 게 좋음
        Data.width = 200;
        Data.height = 300;
        System.out.println("제품의 가로 크기: " + Data.width);
        System.out.println("제품의 세로 크기: " + Data.height);
        System.out.println("제품1의 가로 크기: " + d1.width);
        System.out.println("제품1의 세로 크기: " + d1.height);
    }
}
