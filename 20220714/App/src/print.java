import java.text.FieldPosition;

public class print {
    public static void main(String[] args) {

        // int age = 10;
        // int num = 20;
        // System.out.println("age "+age);

        // System.out.printf("age : %d",age); // %d: 10진수 정수 형식으로 출력함
        // System.out.printf("age : %d, num : %d", age, num);

        /*
         * %b : 불리언 형식으로 출력
         * %d : 10진수 정수의 형식으로 출력
         * %o : 8진수 정수의 형식으로 출력
         * %x : 16진수 정수의 형식으로 출력
         * %f : 부동소수점 형식으로 출력
         * %e : 지수 표현식의 형식으로 출력
         * %c : 문자로 출력
         * %s : 문자열로 출력
         */
        byte b = 1;
        short s = 2;
        char c = 'A';
        int num = 10;
        long bigNum = 100_000_000_000L; // 100000000000L 와 같음
        long hexNum = 0xFFFF_FFFF_FFFF_FFFFL;
        int octNum = 010;
        int hexNum1 = 0x10;
        int binNum = 0b010;
        System.out.printf("b = %d%n", b);
        System.out.printf("s = %d%n", s);
        // c에서는 char타입의 값을 %d로 출력이 가능하다
        // 그러나 java에서는 허용되지 않기 때문에 형변환이 필요
        System.out.printf("c = %c,%d%n", c, (int) c);
        System.out.printf("num=[%5d]%n", num); // 출력된 값이 차지할 공간을 숫자로 지정할 수 있다.
        System.out.printf("num=[%-5d]%n", num);
        System.out.printf("num=[%05d]%n", num);
        System.out.printf("bigNum=%d%n", bigNum);
        System.out.printf("hexNum=%#x%n", hexNum);// #은 접두사임 16지수 0x
        System.out.printf("octNum=%o,%d%n", octNum, octNum);
        System.out.printf("hexNum1=%x,%d%n", hexNum1, hexNum1);
        // 10진수는 2진수로 출력해주는 지시자가 없다.
        // 정수를 2진 문자열로 변환해주는 Integer.toBinaryString를 사용
        // 정수를 2진수로 변환해서 문자열로 반환하기 때문에 %s 사용
        System.out.printf("binNum=%s,%d%n", Integer.toBinaryString(binNum), binNum);

        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.123456789;
        System.out.printf("f1 = %f,%e,%g%n", f1, f1, f1);
        System.out.printf("f2 = %f,%e,%g%n", f2, f2, f2);
        System.out.printf("f3 = %f,%e,%g%n", f3, f3, f3);
        System.out.printf("d = %f%n", d);
        System.out.printf("d = %14.10f%n", d); //전체 14자리 중 소수점 10자리까지 출력해라
    }
}
