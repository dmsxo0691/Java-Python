public class typeCasting {
    public static void main(String[] args) {
        // 형변환
        // 형변환 하고자 하는 변수나 리터럴의 앞에 변환하고자 하는 타입을 괄호와 함께 붙여주면 된다.
        // 형변환은 해당 리터럴을 형변환 후 반환하는 것이지, 할당된 데이터를 변형하는 것이 아니다.

        double d = 12.3;
        int score = (int) d;
        System.out.println(score);
        System.out.println(d);

        // 기본형 타입에서 boolean을 제외한 나머지 타입들은 서로 형변환이 가능
        // 참고로 기본형과 참조형 간의 형변환은 불가능하다.

        /*
         * int -> char | (char)65 | 'A'
         * char -> int | (int)'A' | 65
         * float -> int | (int)1.4f | 1(반올림이 아닌 버림으로 처리)
         * int -> float | (float)int | 10.0f
         */

        int charTypeCasting = 65;
        System.out.println((char) charTypeCasting); // A

        char intTypeCasting = 'A';
        System.out.println((int) intTypeCasting); // 65

        float floatToint = 3.6f;
        System.out.println((int) floatToint); // 3

        int intToFloat = 10;
        System.out.println((float) intToFloat); // 10.0f

        // 자동 형변환

        float f = 1234; // float f = (float)1234;
        System.out.println(f);
    }
}
