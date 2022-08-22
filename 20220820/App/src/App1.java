import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String binaryNum = Integer.toBinaryString(num);

        System.out.println(binaryNum);
    }
}
