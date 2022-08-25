import java.util.Arrays;
import java.util.stream.Stream;

public class prog2 {
    public static void main(String[] args) {
        String[] arr = new String[] { "둘", "넷", "하나", "셋" };

        // 배열에서 스트림 생성
        Stream<String> straem1 = Arrays.stream(arr);
        straem1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        // 배열의 특정 부분만을 이용한 스트림 생성
        Stream<String> straem2 = Arrays.stream(arr, 1, 3);
        straem2.forEach(e -> System.out.print(e + " "));

    }
}
