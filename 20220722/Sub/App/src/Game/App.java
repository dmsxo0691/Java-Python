package Game;

import java.util.Scanner;

import Game.Player;

public class App {
    public static boolean turn;

    // 대전게임
    // 플레이어와 몬스터가 존재함
    // 캐릭터 구성요소 (HP, MP, Atk, Dep방어력, 회피율 , Critical, Skill 3개)
    // 몬스터는 세마리
    // 몬스터 죽이면 보상금
    public static void main(String[] args) {
        Player Me = new Player();
        Monster Monster1 = new Monster();
        boolean turn = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("전투를 시작합니다.");
        System.out.println("적을 조우했습니다.");
        while (true) {
            if (turn == false) {
                System.out.println("1.공격 2.파이어볼 3.라이트닝 4.메테오 5.방어");
                System.out.println("원하는 행동을 숫자로 입력하시오.");
                int temp = scanner.nextInt();
                if (temp == 1) {
                    Me.Attack();
                    turn = true;
                }
                if (temp == 2) {
                    Me.FireBall();
                    turn = true;
                }
                if (temp == 3) {
                    Me.Lightning();
                    turn = true;
                }
                if (temp == 4) {
                    Me.Meteor();
                    turn = true;
                }
                if (temp == 5) {
                    Me.Defence();
                    turn = true;
                } else {
                    continue;
                }
            } else if (turn == true) {
                int randomNum = (int) (Math.random() * 10);
                if (randomNum > 4) {
                    Monster1.Attack();
                    turn = false;
                } else if (randomNum > 6) {
                    Monster1.Rage();
                    turn = false;
                } else if (randomNum > 7) {
                    Monster1.Smash();
                    turn = false;
                } else if (randomNum > 9) {
                    if (Monster1.HP < 5000) {
                        Monster1.Riot();
                        turn = false;
                    } else {
                        Monster1.Attack();
                        turn = false;
                    }
                }
            }
        }
    }
}
