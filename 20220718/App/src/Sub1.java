import java.util.Scanner;

public class Sub1 {
    public static void main(String[] args) {
        // 사용자로부터 입력을 받는다. 이 숫자와 각 자리의 합을 구하는 식
        // 12345 = 15

        int num = 0;
        int sum = 0;
        System.out.println("숫자를 입력해라");
        Scanner scanner = new Scanner(System.in);

        String temp = scanner.nextLine();
        num = Integer.parseInt(temp);

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
            continue;
        }
        System.out.printf("합계 : " + sum);
    }
}
