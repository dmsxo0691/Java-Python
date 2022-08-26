import java.util.Arrays;

public class prog15 {
    public static void main(String[] args) {
        int[] intArr = { 2, 4, 6 };

        boolean result = Arrays.stream(intArr).allMatch(a -> a % 2 == 0);
        System.out.println("모두 2의 배수? " + result);

        result = Arrays.stream(intArr).anyMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 하나라도 있나? " + result);

        result = Arrays.stream(intArr).noneMatch(a -> a % 3 == 0);
        System.out.println("3의 배수가 없나? " + result);
    }
}
// 요소의 검사에 주로 사용

// anyMatch() : 해당 스트림의 일부 요소가 특정 조건을 만족할 경우 true 반환
// allMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족할 경우 true 반환
// noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 않을 경우 true반환