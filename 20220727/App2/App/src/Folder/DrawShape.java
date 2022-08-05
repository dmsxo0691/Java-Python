package Folder;

public class DrawShape {
    public static void main(String[] args) {
        Point[] p = { new Point(100, 100), new Point(200, 200), new Point(300, 300) };

        Triangle tri = new Triangle(p);
        Circle cir = new Circle(new Point(100, 100), 50);

        tri.render();
        cir.render();

    }
}

// 숙제
// 1. 나누어 떨어지는 숫자 배열
// 2.
