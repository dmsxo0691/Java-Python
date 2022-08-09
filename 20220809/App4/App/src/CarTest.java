import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Sonata());
        carList.add(new Grandeur());

        for (Car car : carList) { // carList에 있는 모든 인스턴스들이
            car.run(); // 해당 메서드를 수행함
        }

    }
    // CarTest 클래스를 작성하고 Car를 자료형으로 하는 ArrayList를 만들어
    // add 메서드를 통해 하부 클래스들을 new하여 배열에 담습니다.
    // 향상된 for문을 사용하여 배열안에 모든 인스턴스들이 run() 메서드를 사용하게 됩니다.
}
