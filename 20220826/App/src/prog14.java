import java.util.OptionalInt;
import java.util.stream.*;

public class prog14 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
        IntStream stream2 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

        OptionalInt result1 = stream1.sorted().findFirst();
        System.out.println(result1.getAsInt());
        // OptionalInt 값이 있으면 값을 반환하고 그렇지 않으면
        // NoshchElementException 을 throw 합니다 - getAsInt

        OptionalInt result2 = stream2.sorted().findFirst();
        System.out.println(result2.getAsInt());
        // findFirst()와 findAny() 메소드는 해당 스트림에서 첫번째 요소를 참조하는 Optional 객체를 반환 }
    }
}