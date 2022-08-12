import java.util.Arrays;
import java.util.Scanner;

public class sub {

    static int GestCount = 0;
    static int NowGest = 0;

    static void GestCount() {

        System.out.println("--------------------------------");
        if (NowGest == 0) {
            System.out.println("[회원수] : " + GestCount + "명,   [현재접속자] : 없음");
        } else {
            System.out.println("[회원수] : " + GestCount + "명,   [현재접속자] : " + NowGest);
        }
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int GestId;
        int GestPw;
        int LoginId = 0;
        int LoginPw = 0;
        boolean Login = false;

        Gest[] GestList = new Gest[5];
        main: while (true) {

            while (!Login) {
                GestCount();
                System.out.println("--------------------------------");
                System.out.println("=========== ATM MENU ===========");
                System.out.println("| 1. 회원가입   |");
                System.out.println("| 2. 로그인   |");
                System.out.println("| 3. 전체회원목록   |");
                System.out.println("| 4. 종료   |");
                System.out.println("================================");
                System.out.print("** 메뉴를 입력하세요");

                int select = s.nextInt();
                switch (select) {
                    case 1:
                        while (true) {
                            System.out.println("[입력] 신규 아이디를 입력: ");
                            GestId = s.nextInt();
                            System.out.println("[입력] 신규 비번 입력: ");
                            GestPw = s.nextInt();

                            for (int i = 0; i < GestList.length; i++) {
                                if (GestList[i] == null || GestId != GestList[i].ID) {
                                    GestList[i] = new Gest(GestId, GestPw);
                                    System.out.println("[메세지] 가입이 완료되었습니다.");
                                    break;
                                } else if (GestId == GestList[i].ID) {
                                    System.out.println("[메세지] 이미 가입된 아이디입니다.");
                                    System.out.println("다시 입력해주세요.");
                                    break;
                                }
                            }

                            for (int i = 0; i < GestList.length; i++) {
                                if (GestList[i] != null) {
                                    GestCount++;
                                }
                            }
                            continue main;
                        } // 회원가입 while 끝

                    case 2:
                        while (!Login) {
                            System.out.print("[입력]ID(계좌번호) :");
                            LoginId = s.nextInt();
                            System.out.print("[입력]비밀번호 :");
                            LoginPw = s.nextInt();

                            for (int i = 0; i < GestList.length; i++) {
                                if (GestList[i] == null) {
                                    System.out.println("[ID 오류] 없는 ID 입니다. 회원가입부터 진행바랍니다.");
                                    break;
                                }
                                if (LoginId == GestList[i].ID) {
                                    if (LoginPw != GestList[i].PW) {
                                        System.out.println("[비밀번호 오류] 다시 입력바랍니다.");
                                        LoginPw = s.nextInt();
                                        break;
                                    } else {
                                        System.out.println("[메세지] 로그인 되었습니다.");
                                        Login = true;
                                        break;
                                    }
                                }
                            }
                            continue main;
                        }

                    case 3:
                        Arrays.sort(GestList);
                        for (Gest Gest : GestList)
                            System.out.println(Gest);
                        for (int i = 0; i < GestList.length; i++) {
                            System.out.println((i + 1) + ")" + " " + GestList[i].ID + " " +
                                    GestList[i].PW + " "
                                    + GestList[i].Cash + "원");
                        }
                        continue main;
                    case 4:
                        System.out.println("절차를 종료합니다. \n");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("올바른 번호를 선택하세요 (1~4)");

                }
                continue;
            }

            while (Login) {
                System.out.println("[입력] 로그인 아이디를 입력: ");

                for (int i = 0; i < GestList.length; i++) {
                    if (LoginId == GestList[i].ID) {

                        System.out.println("=========== ATM MENU ===========");
                        System.out.println("ID(" + GestList[i].ID + ")| " + GestList[i].Cash + "원");
                        System.out.println("1. 입금 | 5. 로그아웃 |");
                        System.out.println("2. 출금 | 6. 회원수정 |");
                        System.out.println("3. 이체 | 7. 회원탈퇴 |");
                        System.out.println("4. 종료");
                        System.out.print("** 메뉴를 입력하세요");

                        int select = s.nextInt();

                        switch (select) {
                            case 1:
                                while (true) {
                                    System.out.print("\n입금할 금액을 입력하세요 : ");
                                    long currentDeposit = s.nextLong();

                                    if (currentDeposit >= 1) {
                                        GestList[i].Cash += currentDeposit;
                                        break;
                                    } else {
                                        System.out.println("(경고) 1원 이상의 금액을 입력하세요. \n");
                                    }
                                }
                                System.out.println("입금이 완료되었습니다.");

                                // 현재의 잔액 표시
                                System.out.println("\n현재 잔액 : " + GestList[i].Cash + "원 \n");
                                continue main;

                            case 2:
                                System.out.println("\n현재 잔액 : " + GestList[i].Cash + "원 \n");

                                // 잔액이 없을 시
                                if (GestList[i].Cash == 0) {
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
                                        } else if (currentDeposit > GestList[i].Cash) {
                                            System.out.println("(경고) 잔액보다 많은 금액을 출금할 수 없습니다.");
                                        } else {
                                            GestList[i].Cash -= currentDeposit;
                                            System.out.println("출금이 완료되었습니다.");
                                            System.out.println(
                                                    "\n현재 잔액: " + GestList[i].Cash + "원 \n");
                                            break;
                                        }
                                    } // while 끝
                                }
                            case 3:
                                System.out.print("[입력]이체할 ID를 선택해주세요 :");
                                int transId = s.nextInt();
                                for (int j = 0; j < GestList.length; i++) {
                                    if (transId == GestList[j].ID) {
                                        System.out.print("[입력]이체할 금액을 선택해주세요 : ");
                                        int transMoney = s.nextInt();

                                        if (transMoney > GestList[i].Cash) {
                                            System.out.println("[메세지] 금액이 부족합니다!");
                                            continue;
                                        }
                                        GestList[i].Cash -= transMoney;
                                        GestList[j].Cash += transMoney;

                                        System.out.println("[메세지]현 계좌에는 " + GestList[i].Cash + "원이 있습니다.");
                                        System.out.println("[메세지]입금된 계좌에는 " + GestList[j].Cash + "원이 있습니다.");
                                    }

                                    else if (transId != GestList[j].ID) {
                                        System.out.println("[메세지]이체할 ID를 확인해주세요.");
                                        continue;
                                    }
                                }

                            case 4:
                                System.out.println("절차를 종료합니다. \n");
                                System.exit(0);
                                break;

                            case 5:
                                Login = false;

                            case 6:
                                System.out.println("변경할 비밀번호를 입력해주세요.");
                                int newPw = s.nextInt();
                                GestList[i].PW = newPw;
                                System.out.println("고객님의 비밀번호가" + newPw + "로 변경되었습니다.");

                            case 7:
                                GestList[i] = null;
                                Login = false;
                                System.out.println("회원탈퇴가 완료되었습니다.");
                                System.out.println(GestList[i].ID);
                            default:
                                System.out.println("올바른 번호를 선택하세요 (1~7)");
                        }

                    }
                }
            }

        }
    }
}