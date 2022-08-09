public class DropShip extends Unit {

    public DropShip() {

    }

    @Override
    public void move(int x, int y) {
        // TODO Auto-generated method stub
        System.out.println("드랍쉽의 위치 : " + x + ", " + y + "로 이동함.");

    }

    public void load() {
        System.out.println("탑승모드: 유닛 탑승");
    }

    public void unload() {
        System.out.println("탑승모드: 유닛 하강");
    }

}
