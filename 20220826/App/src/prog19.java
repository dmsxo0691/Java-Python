import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prog19 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "PHP");

        Map<Boolean, List<String>> patition = stream.collect(Collectors.partitioningBy(s -> (s.length() % 2) == 0));

        List<String> dooLengthList = patition.get(false);
        System.out.println(dooLengthList);

        List<String> evenLengthList = patition.get(true);
        System.out.println(evenLengthList);
    }
}
