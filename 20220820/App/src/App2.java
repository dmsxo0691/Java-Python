import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        int num = 0;
        int sum = 0;

        System.out.println("숫자 입력: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("숫자의 합: " + sum);
    }
}
