public abstract class Unit {
    // 필드
    int x;
    int y;
    String str;

    // 추상 메서드 선언(구현부 없음)
    // 모든 유닛은 움직여야 하므로 move()를 추상 메서드로 선언
    public abstract void move(int x, int y);

    public void stop(String str, int x, int y) {
        this.x = x;
        this.y = y;
        this.str = str;
        System.out.println("현재 위치 : " + this.x + ", " + this.y + this.str + "가/이 멈춥니다.");
    }
}
