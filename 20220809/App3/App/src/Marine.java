public class Marine extends Unit {

    @Override
    public void move(int x, int y) {
        // TODO Auto-generated method stub
        System.out.println("마린의 위치 : " + x + ", " + y + "로 이동함.");
    }

    public void stimPack() {
        System.out.println("공격모드: 스팀팩 장전");
    }

}
