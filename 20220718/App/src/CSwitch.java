import java.util.Scanner;

public class CSwitch {
    public static void main(String[] args) {

        // int num, result = 0;

        // final int ONE = 1;

        // switch (result) {
        // case 'A': //문자 리터럴 ok
        // break;

        // case ONE: //ok
        // break;

        // case num: //에러 변수불가
        // break;

        // case 1.0; //에러 실수불가

        // default:
        // break;
        // }

        int score = 0;
        char grade = ' ';

        System.out.println("점수 입력");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';

                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'D';
                break;
        }
        System.out.println("내 학점은" + grade + "입니다.");
    }
}
