public class Node {
    // 외부에서 변경하지 못하도록 private로 지정
    private int x;
    private int y;

    // public 을 통해 외부에서도 사용 가능하게 한다.
    // get은 값을 호출할 때
    // set은 값을 지정할 때

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Node getCenter(Node other) {
        return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
    }
}
