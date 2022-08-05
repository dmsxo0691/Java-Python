import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // 3개의 문자열을 담을 수 있는 배열을 생성
        String[] name = new String[3];

        name[0] = "우영우";
        name[1] = "동그라미";
        name[2] = "변호사";

        String[] name1 = { "우영우", "동그라미", "변호사" };
        String[] name2 = new String[] { "1", "2", "3" };

        for (String string : name2) {
            System.out.println(string);
        }

        /*
         * charAt(int index) : 문자열에서 해당 위치(index)에 있는 문자를 반환한다.
         * Substring(int from, int to) : 문자열에서 해당 범위에 있는 문자열을 반환한다.
         * equals(Object obj) : 문자열의 내용이 obj와 같냐? 같으면 true, 다르면 false
         * char[] toCharArray() : 문자열을 문자 배열(char[])로 변환해서 반환한다.
         */
        String str = "ABCDE";
        // 문자열 str의 4번째 문자인 D를 ah에 저장
        char ah = str.charAt(3);
        System.out.println(ah);

        String str1 = "012345";
        String temp = str.substring(1, 4);
        System.out.println(temp);

        String str2 = "ABC";
        if (str2.equals("ABC")) {
            // 블라블라
        }

        // char배열과 String 클래스의 변환
        char[] chArr = { 'a', 'b', 'c' };
        String StArr = new String(chArr); // char -> String
        char[] ChArr = StArr.toCharArray(); // String -> char
        System.out.println(chArr);
        System.out.println(StArr);
        System.out.println(ChArr);
    }
}
