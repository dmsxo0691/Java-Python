public class Tank extends Unit {

    public Tank() {
    }

    @Override
    public void move(int x, int y) {
        // TODO Auto-generated method stub
        System.out.println("탱크의 위치 : " + x + ", " + y + "로 이동함.");
    }

    public void sizeMode() {
        System.out.println("공격모드: 시즈모드로 변환");
    }

}
