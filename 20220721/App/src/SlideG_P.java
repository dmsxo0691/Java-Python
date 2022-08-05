import java.util.Scanner;

public class SlideG_P {
    public static void main(String[] args) {
        int[] number = new int[25];

        int dest, sour, temp;

        int key = 0;
        int save = 24; // 0의 위치
        int move; // 움직이는 변수

        Scanner scanner = new Scanner(System.in);

        for (int i = 24; i >= 0; i--) {
            number[save - i] = i;
        }

        for (int i = 0; i < 100; i++) {
            dest = (int) (Math.random() * 24);
            sour = (int) (Math.random() * 24);

            temp = number[dest];
            number[dest] = number[sour];
            number[sour] = temp;
        }
        while (true) {

            for (int i = 0; i < number.length; i++) {
                System.out.print(number[i] + "\t");

                if ((i + 1) % 5 == 0) {
                    System.out.printf("%n%n");
                }
            }
            String inputStr = scanner.nextLine();
            key = Integer.parseInt(inputStr);

            switch (key) {
                case 4:
                    if (save % 5 == 0) {
                        System.out.print("못 감");
                        break;
                    }
                    move = number[save];
                    number[save] = number[save - 1];
                    number[save - 1] = move;
                    save--;
                    break;
                case 6:
                    if ((save + 1) % 5 == 0) {
                        System.out.print("못 감");
                        break;
                    }
                    move = number[save];
                    number[save] = number[save + 1];
                    number[save + 1] = move;
                    save++;
                    break;
                case 8:
                    if (save < 5) {
                        System.out.print("못 감");
                        break;
                    }
                    move = number[save];
                    number[save] = number[save - 5];
                    number[save - 5] = move;
                    save -= 5;
                    break;
                case 2:
                    if (save >= 20) {
                        System.out.print("못 감");
                        break;
                    }
                    move = number[save];
                    number[save] = number[save + 5];
                    number[save + 5] = move;
                    save += 5;
                    break;
            }
        }
    }
}
