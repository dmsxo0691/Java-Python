public class UnitEx {
    public static void main(String[] args) {
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
    }
}
