public class Fac {
    static int math(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number * math(number - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(math(10));
    }
}
