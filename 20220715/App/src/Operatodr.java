public class Operatodr {
    public static void main(String[] args) {
        /*
         * 산술 연산자: +,-,*,/,%,<<,>>(쉬프트 연산)
         * 비교 연산자: <,>,==,<=,>=,!=
         * 논리 연산자: &&, ||, &, |, ^, ~
         * 대입 연산자: =
         * 기타 : 형변환, 삼항, instanceof
         */

        int num1 = 8;
        int num2 = 4;
        System.out.println("더하기 :" + (num1 + num2));
        System.out.println("빼기 :" + (num1 - num2));
        System.out.println("곱하기 :" + (num1 * num2));
        System.out.println("나누기 :" + (num1 / num2));
        System.out.println("나머지 :" + (num1 % num2));

        // 증감연산자
        // ++(피연산자의 값을 1 증가),--(피연산자의 값을 1 감소),+=,-=

        int result, result2;
        result = --num1 + 4;
        result2 = num2-- + 4;
        System.out.println("전위 감소 연산자 : " + result + ", 변수값: " + num1);
        System.out.println("후위 감소 연산자 : " + result2 + ", 변수값: " + num2);

        int x = 10;
        int y = x-- + 5 + --x;

        System.out.println("x: " + x + ", y: " + y);

        char c1 = 'a'; // 97
        char c2 = c1;
        char c3 = ' ';
        c2++;
        System.out.println(c2);

        c3 = (char) (c1 + 1);

        int i = c1 + 1;
        System.out.println(i);

        System.out.printf("10==10.0f: \t%b%n", 10 == 10.0f);
        System.out.printf("'0'==0: \t%b%n", '0' == 0);// 48 == 0
        System.out.printf("'A' > 'B': \t%b%n", 'A' > 'B');
        System.out.printf("'A' == 65: \t%b%n", 'A' == 65);
        System.out.printf("'A'+1 != 'B': \t%b%n", 'A' + 1 != 'B');

        // 숙제
        // 1. 연산자 우선순위 정리
        // 2. 연산자 결합방향 정리
        // 3. 기본적인 타입과 변수를 이용해서 자기 프로필 만들기
        // 이름, 학번, 키, 성별()
        // 4. 음식 3개의 가격을 입력받아서 합계를 구하고 1/n 가격 구하기
        // 5. 시급을 입력받는다.(하루 일하는 시간은 8시간)
        // 한 달 근무 시(20일) 총 급여 출력하기

    }

}
