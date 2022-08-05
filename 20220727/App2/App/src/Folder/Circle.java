package Folder;

//원은 도형이기 때문에 Shape 상속
public class Circle extends Shape {

    // 원은 점을 가지고 있기 때문에 Point 포함
    Point center; // 원의 원점 좌표
    int radius;

    Circle() {
        this(new Point(0, 0), 100);
    }

    Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // 함수 오버라이딩(부모에게 물려받은 메서드를 재정의해서 사용)
    // 이름, 매개변수, 반환타입이 모두 동일해야만 함
    void render() {
        System.out.printf("[p1=%s,p2=%s,color=%s]%n", center.x, center.y, color);
    }

}
