import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        System.out.println("입력된 정수는 " + value + "입니다.");

        int[] Array = new int[] { 345, 567, 789 };
        int value1 = 0;
        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] < Array[i + 1]) {
                value1 = Array[i + 1];
            }
        }
        System.out.println(value1);
        scanner.close();
    }
}
