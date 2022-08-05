import java.util.Scanner;

public class Iterator {
    public static void main(String[] args) {

        // for(int i = 0; i<5; i++){
        // System.out.println(i);
        // }
        // for(int i = 0; i<5; i++){
        // System.out.print(i);
        // }

        // int sum = 0;
        // for(int i = 1; i<=100; i++){
        // sum += i;
        // }

        // 지금 해볼 것
        // 입력받은 수만큼 별찍기

        // System.out.println("별 갯수 입력");
        // Scanner scanner = new Scanner(System.in);

        // int num = scanner.nextInt();

        // for (int i = 0; i < num; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 지금 해볼 것. i == j일 때만 출력하고 나머지는 공백으로 출력

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // if (i == j) {
        // System.out.printf("[%d,%d]", i, j);
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // jdk 1.5부터 배열과 컬렉션에 저장된 요소에 접근할 때 기존보다 편리한 방법으로 처리할 수 있다
        // for(타입 변수명:배열 or 컬렉션){
        // //반복해라
        // }

        // int[] arr = { 10, 20, 30, 40, 50 };

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        // System.out.println("=====================");

        // for (int i : arr) {
        // System.out.println(i);
        // }

        // int res = 0;

        // for (int i : arr) {
        // res += i;
        // }
        // System.out.println(res);
        // }
        /////////////////////////////////////////////

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        // int i = 1;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;
        // }

        // 사용자로부터 입력을 받는다. 이 숫자와 각 자리의 합을 구하는 식
        // 12345 = 15

        // int num = 0;
        // int sum = 0;
        // System.out.println("숫자를 입력해라");
        // Scanner scanner = new Scanner(System.in);

        // String temp = scanner.nextLine();
        // num = Integer.parseInt(temp);

        // while (num != 0) {
        // sum += num % 10;
        // num = num / 10;
        // continue;
        // }
        // System.out.printf("합계 : " + sum);

        /////////////////////////////////////////////////////////////

        // int sum = 0;
        // int num;
        // boolean flag = true;

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("합계를 구할 숫자를 입력해라. 끝내려면 0을 눌러라");

        // while (flag) {
        // System.out.print(">>>");
        // String temp = scanner.nextLine();
        // num = Integer.parseInt(temp);

        // if (num != 0) {
        // sum += num;
        // } else {
        // flag = false;
        // }

        // }
        // System.out.println("합계 : " + sum);

        // do-while
        /*
         * 기본적인 구조는 while과 같지만 조건식과 중괄호의 순서를 바꿔놓은 것
         * 그래서 while과 반대로 블럭을 먼저 수행한 후에 조건식을 감지
         * do-while은 최소한 한번은 수행될 것을 보장한다.
         */

        int input = 0;
        int answer = 0;

        answer = (int) (Math.random() * 100) + 1; // 1~100사이의 임의의 수를 answer에 저장

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력해라");
            input = scanner.nextInt();
            if (input > answer) {
                System.out.println("더 작은 수를 입력해라");
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력해라");
            }
        } while (input != answer);
        System.out.println("정답이다");
    }

    // 숙제 숫자중에 3의 배수(3,6,9)가 포함되어 있으면 포함된 개수만큼 박수를 친다.
    // 1~100까지 출력
    // 가위바위보

}
