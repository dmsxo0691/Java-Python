import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        int M = 0;
        int H = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("알람이 울릴 시간 - 시");
        int AlretH = scanner.nextInt();
        System.out.println("알람이 울릴 시간 - 분");
        int AlretM = scanner.nextInt();

        if (AlretM < 45) {
            M = 60 + (AlretM - 45);
            H = AlretH - 1;
        }
        if (AlretH < 1 && AlretM < 45) {
            M = 60 + (AlretM - 45);
            H = 23;
        }
        System.out.println("알람이 울릴 시간 : " + H + ":" + M);
    }
}
