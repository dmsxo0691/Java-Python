public class Main {
    public static void main(String[] args) {
        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        // 반환된 변수의 타입 출력
        System.out.println("a E data : " + a.get().getClass().getName());

        System.out.println();

        System.out.println("b data : " + b.get());
        // 반환된 변수의 타입 출력
        System.out.println("b E data : " + b.get().getClass().getName());
    }
}
