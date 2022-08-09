public abstract class Car {
    public abstract void start();

    public abstract void drive();

    public abstract void stop();

    public abstract void trunoff();

    final public void run() {
        start();
        drive();
        stop();
        trunoff();
        System.out.println("======================");
        // Car 클래스 메서드들이 기능하는 순서를 조작하는 run 메서드
    }
    // Car 클래스 작성 공통 메서드 추상 메서드로 구현, 클래스에 avstract 선언

}
