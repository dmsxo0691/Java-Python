
//스캐너 클래스를 사용하기위해 사용한다.
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 화면에서 입력받기 Scanner

        @SuppressWarnings("resource") // 해당 경고를 무시하려면 이녀석 추가
        Scanner scanner = new Scanner(System.in); // 스캐너 클래스 생성
        // 입력받은 내용을input에 저장
        // 입력을 하고 엔터를 누르면 입력한 내용이 문자열로 반환
        String input = scanner.nextLine();

        // 입력받은 내용(string)을 int 타입변환
        int num = Integer.parseInt(input);

        System.out.println("입력받은 숫자 : " + num);

        int num1 = scanner.nextInt();
        System.out.println("입력한 두번째 숫자 : " + num1);

        // scanner.close();

    }
}