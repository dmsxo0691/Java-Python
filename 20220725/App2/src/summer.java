
//생성자

class Student {
    // Student() {
    // // 인스턴스 생성할 때 돌아갈 코드
    // // 주로 인스턴스 변수의 초기화 코드를 작성한다.
    // }
    // 생성자 함수도 오버로딩이 가능하다.
    // Student(String str, int number) {

    // }
}

class Data {
    int value;

    // 생성자 없으므로 컴파일러가 자동으로 만들어주는 default constructor
    // Data(){
    // }
}

class Data1 {
    int value1;

    Data1(int n) {
        value1 = n;
    }
}

public class summer {
    public static void main(String[] args) {
        // 생성자(constructor)
        // 생성자는 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드
        // 인스턴스 변수의 초기화 작업에 주로 사용
        // 인스턴스 생성시에 실행되어야 할 작업을 위해서도 사용된다.
        // 생성자도 메서드와 유사하지만 return value가 없다.

        // 생성자 조건
        // 1. 생성자의 이름은 클래스 이름과 동일해야 한다.
        // 2. 생성자는 리턴이 없다

        ///////////////////////////////////////////

        // Student st = new Student(); // Student() -> 생성자
        // 연산자 new 가 새로운 인스턴스를 생성해주는 것이지 생성자만 있다고 해서 인스턴스가 생성되지 않는다.
        // default Constructor
        // 클래스 내부에 생성자가 하나도 없을 겨우 컴파일러가 default Constructor를 제공한다.
        // 디폴트 생성자는 매개변수 및 아무런 내용도 없다.
        // 인스턴스 초기화 작업이 굳이 필요하지 않다면 디폴트 생성자를 사용해도 무방하다.

        Data d = new Data();
        d.value = 10;

        System.out.println(d.value);

        Data1 d1 = new Data1(1);
        System.out.println(d1.value1);

        // Data1 d2 = new Data1(); 클래스 내부에 생성자가 있을 경우 디폴트 생성자는 제공되지 않기에 에러

        ///////////////////////////////////////

        Car hyundai = new Car();
        hyundai.color = "black";
        hyundai.productName = "구뤤졀";
        hyundai.price = 5000;

        Car kia = new Car("red", "모닝", 2000);

        System.out.println("현대 컬러: " + hyundai.color + "현대 제품: " + hyundai.productName + "가격: " + hyundai.price);
        System.out.println("기아 컬러: " + kia.color + "기아 제품: " + kia.productName + "가격: " + kia.price);

        // 턴제 게임을 생성자를 이용해서 객체를 만들고(Player, Monster 등...)
        // 스킬 5개(함수 오버로딩으로 만들어라)
    }
}
