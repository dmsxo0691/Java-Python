import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        long depoist = 0;

        while (true) {
            System.out.println("<< ATM >>");
            System.out.println("1.   입금");
            System.out.println("2.   출금");
            System.out.println("3.   조회");
            System.out.println("4.   종료");
            System.out.print(">>");

            Scanner s = new Scanner(System.in);

            int select = s.nextInt();

            switch (select) {
                case 1:
                    while (true) {
                        System.out.print("\n입금할 금액을 입력하세요 : ");
                        long currentDeposit = s.nextLong();

                        if (currentDeposit >= 1) {
                            depoist += currentDeposit;
                            break;
                        } else {
                            System.out.println("(경고) 1원 이상의 금액을 입력하세요. \n");
                        }
                    }
                    System.out.println("입금이 완료되었습니다.");

                    // 현재의 잔액 표시
                    System.out.println("\n현재 잔액 : " + depoist + "원 \n");
                    break;

                case 2:
                    System.out.println("\n현재 잔액 : " + depoist + "원 \n");

                    // 잔액이 없을 시
                    if (depoist == 0) {
                        System.out.println("(경고) 잔액이 없습니다. \n");
                    } else {
                        while (true) {
                            System.out.println("\n출금할 금액을 입력하세요(0:빠져나가기) : ");
                            long currentDeposit = s.nextLong();

                            if (currentDeposit < 0) {
                                System.out.println("(경고) 마이너스 단위는 출금할 수 없습니다.");
                            } else if (currentDeposit == 0) {
                                System.out.println("(경고) 출금 절차를 종료합니다. \n");
                                break;
                            } else {
                                depoist -= currentDeposit;
                                System.out.println("출금이 완료되었습니다.");
                                System.out.println("\n현재 잔액: " + depoist + "원 \n");
                                break;
                            }
                        } // while 끝
                    }
                    break;

                case 3:
                    System.out.println("\n현재 잔액: " + depoist + "원 \n");
                    break;

                case 4:
                    System.out.println("절차를 종료합니다. \n");
                    System.exit(0);
                    break;

                default:
                    System.out.println("올바른 번호를 선택하세요 (1~4)");

            }
        }
    }
}