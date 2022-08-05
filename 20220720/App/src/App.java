import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] number = new int[25];

        int dest, sour, temp;

        int bingoCount = 0;

        int inputNum = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        for (int i = 0; i < number.length; i++) {
            dest = (int) (Math.random() * 25);
            sour = (int) (Math.random() * 25);

            temp = number[dest];
            number[dest] = number[sour];
            number[sour] = temp;
        }

        while (true) {
            System.out.println("빙고 카운트 : " + bingoCount);
            for (int i = 0; i < number.length; i++) {
                if (number[i] == 35) {
                    System.out.print((char) number[i] + "\t");
                } else {
                    System.out.print(number[i] + "\t");
                }
                if ((i + 1) % 5 == 0) {
                    System.out.printf("%n%n");
                }
            }

            System.out.print("원하는 숫자를 입력해라 : ");
            String inputStr = scanner.nextLine();
            inputNum = Integer.parseInt(inputStr);

            for (int i = 0; i < number.length; i++) {
                if (number[i] == inputNum) {
                    number[i] = 35;
                }
            }
            bingoCount = 0;
            for (int i = 0; i < 5; i++) {
                // 가로 검사
                if (number[i * 5] == 35 && number[i * 5 + 1] == 35 && number[i * 5 + 2] == 35 && number[i * 5 + 3] == 35
                        && number[i * 5 + 4] == 35) {
                    bingoCount++;
                }
                if (number[i] == 35 && number[i + 5 * 1] == 35 && number[i + 5 * 2] == 35 && number[i + 5 * 3] == 35
                        && number[i + 5 * 4] == 35) {
                    bingoCount++;
                }
            }
            if (number[0] == 35 && number[6] == 35 && number[12] == 35 && number[18] == 35 && number[24] == 35) {
                bingoCount++;
            }
            if (number[4] == 35 && number[8] == 35 && number[12] == 35 && number[16] == 35 && number[20] == 35) {
                bingoCount++;
            }
            if (bingoCount >= 3) {
                break;
            }
        }
    }
}
