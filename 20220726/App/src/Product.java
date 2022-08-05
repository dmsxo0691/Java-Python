
class Pro {
    // count가 인스턴스였다면 인스턴스가 생성될 때마다 0으로 초기화
    // 해서 모든 Pro 인스턴스의 number는 1이 된다.
    static int count = 0;
    int number;
    {
        ++count;
        number = count;
    }
}

class parent{
    int number = 0;
}

class child extends parent{

}

class Child extends parent{
    // 자식 클래스 둘, 형제 클래스는 서로 영향을 끼칠 수 없다.
}

class jason extends Child{
    
}
public class Product {

    public static void main(String[] args) {
        Pro p1 = new Pro();
        Pro p2 = new Pro();
        Pro p3 = new Pro();

        System.out.println("넘버 : " + p1.number);
        System.out.println("넘버 : " + p2.number);
        System.out.println("넘버 : " + p3.number);

        // 상속
        // 기존의 클래스를 재사용하여 새로운 클래스를 만든다
        // 상속을 통해서 클래스를 만들면 적은 양의 코드로 새로운 클래스를 만들 수 있고
        // 코드를 공통적으로 관리하기 때문에 코드의 추가, 변경이 매우 수월하다.



    }
}
