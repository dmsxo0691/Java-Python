public class Main2 {
    private static int func(int number, int k) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                k--;
                if (k == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int result = func(3050, 10);
        System.out.println(result);
    }
}
