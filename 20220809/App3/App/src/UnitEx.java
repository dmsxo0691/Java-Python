public class UnitEx {
    public static void main(String[] args) {

        // Unit unit = new Unit();
        // Unit 추상클래스이므로 인스턴스를 생성할 수 없어 에러가 발생함

        System.out.println("-------------------------");
        Tank tank = new Tank();
        tank.move(100, 300);
        tank.sizeMode();
        tank.stop("탱크", 300, 400);

        System.out.println("-------------------------");

        Marine marine = new Marine();
        marine.move(200, 500);
        marine.stimPack();
        marine.stop("마린", 300, 400);

        System.out.println("-------------------------");

        DropShip dropShip = new DropShip();
        dropShip.move(500, 600);
        dropShip.load();
        dropShip.unload();
        dropShip.stop("드랍쉽", 200, 100);

        System.out.println("-------------------------");

        Granger car = new Granger();
        car.Start();
        car.Drive();
        car.Stop();
        car.Off();

    }
}
