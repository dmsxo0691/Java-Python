public class Grandeur extends Car {

    @Override
    public void drive() {
        System.out.println("Grandeur 가 달립니다");

    }

    @Override
    public void start() {
        System.out.println("Grandeur 가 시동을 켭니다");

    }

    @Override
    public void stop() {
        System.out.println("Grandeur 가 멈춥니다");

    }

    @Override
    public void trunoff() {
        System.out.println("Grandeur 가 시동을 끕니다");

    }
}
