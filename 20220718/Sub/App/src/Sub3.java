import java.util.Scanner;

public class Sub3 {
    public static void main(String[] args) {
        int num;
        String Com;
        num = (int) (Math.random() * 3);
        if (num <= 0) {
            Com = "가위";
        } else if (num <= 1) {
            Com = "바위";
        } else {
            Com = "보";
        }

        System.out.println("1가위, 2바위, 3보 중에 하나를 번호로 고르시오");
        Scanner scanner = new Scanner(System.in);
        int custumer = scanner.nextInt();

        if (custumer == 0) {
            if (num == 0) {
                System.out.println("Draw : 컴퓨터는 " + Com + "입니다.");
            } else if (Com == "Rock") {
                System.out.println("Lose : 컴퓨터는 " + Com + "입니다.");
            } else {
                System.out.println("Win : 컴퓨터는 " + Com + "입니다.");
            }
        } else if (custumer == 1) {
            if (num == 1) {
                System.out.println("Draw : 컴퓨터는 " + Com + "입니다.");
            } else if (Com == "Paper") {
                System.out.println("Lose : 컴퓨터는 " + Com + "입니다.");
            } else {
                System.out.println("Win : 컴퓨터는 " + Com + "입니다.");
            }
        } else {
            if (num == 2) {
                System.out.println("Draw : 컴퓨터는 " + Com + "입니다.");
            } else if (Com == "Scissors") {
                System.out.println("Lose : 컴퓨터는 " + Com + "입니다.");
            } else {
                System.out.println("Win : 컴퓨터는 " + Com + "입니다.");
            }
        }

    }
}
