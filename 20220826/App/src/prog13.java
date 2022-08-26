import java.util.Optional;
import java.util.stream.Stream;

//reduct() 메소드는 첫번째와 두번째 요소를 가지고 연산을 수행한 뒤, 그 결과와 세번째 요소를 가지고
//또다시 연산을 수행한다. 이런 식으로 해당 스트림의 모든 요 소를 소모하여 연산을 수행하고
//그 결과를 반환한다.

public class prog13 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");

        Optional<String> result1 = stream1.reduce((s1, s2) -> s1 + "++" + s2);
        result1.ifPresent(System.out::println);

        String result2 = stream2.reduce("시작", (s1, s2) -> s1 + "++" + s2);
        System.out.println(result2);
    }
}
