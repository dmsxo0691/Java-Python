public class App {
    public static void main(String[] args) {
        // 함수 오버로딩
        // 클래스 내에서 같은 이름의 메서드를 여러개 정의한다.

        // 오버로딩의 조건
        // 1. 메서드 이름이 같아야 함
        // 2. 매개변수 개수 or 타입이 달라야 함
        // 메서드 이름이 같더라도 매개변수가 다르면 서로 구별되기 때문에 오버로딩이 가능하다.
        // 1,2 번 조건을 만족시키지 못하면 메서드는 중복 정의로 간주되기 때문에 컴파일 시 에러가 발생한다.
        // 오버로딩된 메서드들은 매개변수에 의해서만 구분되기 대문에 반환 타입은 오버로딩을 구현함에 있어 아무런 영향을 주지 못한다.

        App app = new App();

        int res = app.sum(1, 2);
        int res1 = app.sum(1, 2, 3);
        long res2 = app.sum(3L, 5L);
        int[] arrRes = { 1, 2, 3, 4, 5 };
        int res3 = app.sum(arrRes);

        System.out.println("res : " + res);
        System.out.println("res1 : " + res1);
        System.out.println("res2 : " + res2);
        System.out.println("res3 : " + res3);
    }

    // 아래 두 함수는 매개변수의 이름만 다를 뿐 타입이 동일하다.
    // 오버로딩 조건을 성립하지 않는다
    // int sum(int a, int b) { //error
    // return a + b;
    // }

    // int sum(int x, int y) { //error
    // return x + y;
    // }

    // 아래 두 함수는 반환타입만 다르기 때문에 error
    // int sum(int a, int b) {
    // return a + b;
    // }

    // long sum(int x, int y) {
    // return (long) x + y;
    // }

    //////////////////////////////////////////////////////////

    // int, long 하나씩 선언되어 있다.
    // 순서가 다르기에 호출 시 매개변수 값에 의해 호출된 메서드가 구분되기 때문에 중복된 정의가 아니라 오버로딩으로 간주
    // long sum(int a, long b) {
    // return a + b;
    // }

    // long sum(long a, int b) {
    // return a + b;
    // }

    int sum(int a, int b) {
        return a + b;
    }

    long sum(long a, long b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }

    // 위 sum이라는 4개의 함수들은 오버로딩되어 있다.
    // 더한다는 같은 역할을 수행하나 매개변수가 달라야 할 경우

}
