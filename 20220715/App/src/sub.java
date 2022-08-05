import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        // 숙제
        // 1. 연산자 우선순위 정리
        // 2. 연산자 결합방향 정리
        // 3. 기본적인 타입과 변수를 이용해서 자기 프로필 만들기
        // 이름, 학번, 키, 성별()
        // 4. 음식 3개의 가격을 입력받아서 합계를 구하고 1/n 가격 구하기
        // 5. 시급을 입력받는다.(하루 일하는 시간은 8시간)
        // 한 달 근무 시(20일) 총 급여 출력하기

        String name = "박은태";
        int classNum = 1000;
        int height = 200;
        String sex = "male";

        System.out.println("이름: " + name);
        System.out.println("학번: " + classNum);
        System.out.println("키: " + height);
        System.out.println("성별: " + sex);

        //////////////////////////

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int cost1 = Integer.parseInt(input);
        int cost2 = scanner.nextInt();
        int cost3 = scanner.nextInt();

        int avergeCost = (cost1 + cost2 + cost3) / 3;
        System.out.println("평균금액: " + avergeCost);

        int hourlyWage = scanner.nextInt();

        int payWage = hourlyWage * 8 * 20;
        System.out.println("월급: " + payWage + "원");

    }
}
