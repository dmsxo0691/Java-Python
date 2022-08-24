public class Example2 {
    interface Math {

        int sum(int n1, int n2);

    }

    static int doSomething(Math math) {
        return math.sum(10, 20);
    }

    public static void main(String[] args) {
        int result = doSomething((n1, n2) -> n1 + n2);
        // int result = doSomething(new Math() { // Anonymous funtion

        // @Override
        // public int sum(int n1, int n2) {
        // return n1 + n2;
        // }

        // });
        System.out.println(result);
    }
}
