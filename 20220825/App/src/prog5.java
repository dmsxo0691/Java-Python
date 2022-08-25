import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.sampled.SourceDataLine;

public class prog5 {
    public static void main(String[] args) {
        // 특정 타입 난수로 이루어진 스트림 생성
        IntStream stream = new Random().ints(4);
        stream.forEach(System.out::println);

        // iterate() 메소드를 이용한 무한 스트림
        // Stream<Integer> stream1 = Stream.iterate(2, n -> n + 2);
        // stream1.forEach(System.out::println);

        Stream<Integer> stream2 = Stream.iterate(100, n -> n + 10).limit(5);
        stream2.forEach(System.out::println);
    }
}
