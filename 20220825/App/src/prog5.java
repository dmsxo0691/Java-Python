import java.util.Random;
import java.util.stream.IntStream;

import javax.sound.sampled.SourceDataLine;

public class prog5 {
    public static void main(String[] args) {
        // 특정 타입 난수로 이루어진 스트림 생성
        IntStream stream = new Random().ints(4);
        stream.forEach(System.out::println);
    }
}
