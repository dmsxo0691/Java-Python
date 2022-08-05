import java.util.Scanner;

public class Sub3 {
    public static void main(String[] args) {
        int num;
        String Com;
        num = (int) (Math.random() * 10) + 1;
        if (num <= 3) {
            Com = "Scissors";
        } else if (num <= 6) {
            Com = "Rock";
        } else {
            Com = "Paper";
        }

        System.out.println("Scissors, Rock, Paper 중에 하나를 고르시오");
        Scanner scanner = new Scanner(System.in);
        String custumer = scanner.nextLine();

        if (custumer == "Scissors") {
            if (Com == "Scissors") {
                System.out.println("Draw : 컴퓨터는" + Com + "입니다.");
            } else if (Com == "Rock") {
                System.out.println("Lose : 컴퓨터는" + Com + "입니다.");
            } else {
                System.out.println("Win : 컴퓨터는" + Com + "입니다.");
            }
        } else if (custumer == "Rock") {
            if (Com == "Rock") {
                System.out.println("Draw : 컴퓨터는" + Com + "입니다.");
            } else if (Com == "Paper") {
                System.out.println("Lose : 컴퓨터는" + Com + "입니다.");
            } else {
                System.out.println("Win : 컴퓨터는" + Com + "입니다.");
            }
        } else {
            if (Com == "Paper") {
                System.out.println("Draw : 컴퓨터는" + Com + "입니다.");
            } else if (Com == "Scissors") {
                System.out.println("Lose : 컴퓨터는" + Com + "입니다.");
            } else {
                System.out.println("Win : 컴퓨터는" + Com + "입니다.");
            }
        }

    }
}
