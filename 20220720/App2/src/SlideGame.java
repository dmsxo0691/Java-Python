import java.util.Scanner;

public class SlideGame {
    public static void main(String[] args) {
        // 숙제 슬라이드 퍼즐 만들기
        // 5*5
        int[] number = new int[25];

        int dest, sour, temp;

        int inputNum = 0;

        int emptyPlace = 24;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        for (int i = 0; i < number.length; i++) {
            dest = (int) (Math.random() * 24);
            sour = (int) (Math.random() * 24);

            temp = number[dest];
            number[dest] = number[sour];
            number[sour] = temp;
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] == 35) {
                System.out.print((char) number[i] + "\t");
            } else {
                System.out.print(number[i] + "\t");
            }
            if ((i + 1) % 5 == 0) {
                System.out.printf("%n%n");
            }
            number[24] = 35;
        }
        while (true) {

            System.out.println("방향키를 입력하세요(8 2 4 6)");
            String inputStr = scanner.nextLine();
            inputNum = Integer.parseInt(inputStr);

            if (inputNum == 5) {
                System.out.println("포기하셨군용 ㅋ");
                break;
            }
            if (inputNum == 8) {
                if (emptyPlace == 0 || emptyPlace == 1 || emptyPlace == 2 || emptyPlace == 3 || emptyPlace == 4) {
                    System.out.println("위로 이동할 수 없습니다.");
                    continue;
                }
                temp = number[emptyPlace];
                number[emptyPlace] = number[emptyPlace - 5];
                number[(emptyPlace - 5)] = temp;
                emptyPlace = emptyPlace - 5;
            } else if (inputNum == 2) {
                if (emptyPlace == 20 || emptyPlace == 21 || emptyPlace == 22 || emptyPlace == 23 || emptyPlace == 24) {
                    System.out.println("아래로 이동할 수 없습니다.");
                    continue;
                }
                temp = number[emptyPlace];
                number[emptyPlace] = number[emptyPlace + 5];
                number[(emptyPlace + 5)] = temp;
                emptyPlace = emptyPlace + 5;
            } else if (inputNum == 4) {
                if (emptyPlace == 0 || emptyPlace == 5 || emptyPlace == 10 || emptyPlace == 15 || emptyPlace == 20) {
                    System.out.println("왼쪽으로 이동할 수 없습니다.");
                    continue;
                }
                temp = number[emptyPlace];
                number[emptyPlace] = number[emptyPlace - 1];
                number[(emptyPlace - 1)] = temp;
                emptyPlace = emptyPlace - 1;
            } else if (inputNum == 6) {
                if (emptyPlace == 4 || emptyPlace == 9 || emptyPlace == 14 || emptyPlace == 19 || emptyPlace == 24) {
                    System.out.println("오른쪽으로 이동할 수 없습니다.");
                    continue;
                }
                temp = number[emptyPlace];
                number[emptyPlace] = number[emptyPlace + 1];
                number[(emptyPlace + 1)] = temp;
                emptyPlace = emptyPlace + 1;
            }
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
        }
    }
}
