
//생성자에서 다른 생성자 호출하기
// this(), this
// 1. 생성자의 이름으로 클래스 이름 대신 this를 호출
// 2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫줄에서만 호출이 됨

// 생성자에서 다른 생성자를 첫 줄에서만 호출 가능한 이유는?
// 생성자 내에서 초기화 작업 도중에 다른 생성자를 호출하게 되면 다른 생성자 내에서도 멤버 변수들의 값을 초기화하기 때문
// 다른 생성자를 호출하기 이전의 초기화 작업이 무의미해지기 때문

/////////////////////////////////////////

// class Data {
//     Data(String data){
//         //num = 5;      error
//         //Data(data);   error
//     }
// }

/////////////////////////////////////////

class Car {
    String color;
    String name;
    int price;

    Car() {
        // Car(String color, String name, int price) 호출
        this("yellow", "테슬라", 1000);
    }

    Car(String color) {
        this(color, "봉고", 200);
    }

    Car(String color, String name, int price) {
        // this 는 참조변수로 인스턴스 자신을 가리킨다.

        this.color = color;
        this.name = name;
        this.price = price;
    }

}

/*
 * 생성자를 이용한 인스턴스 복사
 * 현재 사용하고 있는 인스턴스와 같은 상태를 갖는 인스턴스를 하나 더 만들 때 생성자를 이용할 수 있다.
 * 두 인스턴스가 같은 상태를 갖고 있다는 것은 모든 인스턴스 변수가 동일한 값을 가지고 있다는 의미이다.
 */

class Car1 {
    String color;
    String name;
    int price;

    Car1() {
        // Car(String color, String name, int price) 호출
        this("yellow", "테슬라", 1000);
    }

    // 인스턴스 복사를 위한 생성자
    // Car1(Car1 c) {
    // color = c.color;
    // name = c.name;
    // price = c.price;
    // }

    // 이게 더 좋음
    Car1(Car1 c) {
        this(c.color, c.name, c.price);
    }

    Car1(String color, String name, int price) {
        // this 는 참조변수로 인스턴스 자신을 가리킨다.

        this.color = color;
        this.name = name;
        this.price = price;
    }

}

public class App {

    public static void main(String[] args) {
        // Car c1 = new Car();
        // Car c2 = new Car("파란색");

        // System.out.println(c1.color + "," + c1.name + "," + c1.price);
        // System.out.println(c2.color + "," + c2.name + "," + c2.price);

        // this 는 인스턴스 자신을 가리키는 참조변수기에 인스턴스의 주소가 저장되어 있음
        // this(), this(매개변수)는 생성자이기에 같은 클래스의 다른 생성자를 호출할 때 사용한다.

        System.out.println("=======================================");

        Car1 c1 = new Car1();
        // c1의 복사본 c2를 만든다
        Car1 c2 = new Car1(c1);

        System.out.println(c1.color + "," + c1.name + "," + c1.price);
        System.out.println(c2.color + "," + c2.name + "," + c2.price);
        c1.price = 2000;
        System.out.println("=======================================");
        System.out.println(c1.color + "," + c1.name + "," + c1.price);
        System.out.println(c2.color + "," + c2.name + "," + c2.price);
    }
}
