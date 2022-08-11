import java.util.Scanner;

public class Que {
    public static void main(String[] args) {
        // int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // for (int i = 0; i < n.length; i++) {
        // for (int j = 1; j < n.length + 1; j++) {
        // int num = n[i] * j;
        // System.out.println(n[i] + " X " + j + " = " + num);
        // }
        // }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < 10; i++) {
            int num = n * i;
            System.out.println(n + " X " + i + " = " + num);
        }
    }
}
