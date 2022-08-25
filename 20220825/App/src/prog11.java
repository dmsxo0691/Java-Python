import java.util.Arrays;
import java.util.stream.Stream;

public class prog11 {
    public static void main(String[] args) {
        String[] arr = { "I study hard", "You study JAVA", "I am hungry" };

        Stream<String> stream = Arrays.stream(arr);
        stream.flatMap(s -> Stream.of(s.split(" +"))).forEach(System.out::println);
    }
}
