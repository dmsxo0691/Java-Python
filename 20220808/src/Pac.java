public class Pac {
    static int math(int a) {
        int result = 1;
        for (int i = a; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(math(10));
    }
}
