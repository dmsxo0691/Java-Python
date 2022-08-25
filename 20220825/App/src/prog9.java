import java.util.stream.Stream;

public class prog9 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");

        stream.map(s -> s.length()).forEach(System.out::println);
    }
}
