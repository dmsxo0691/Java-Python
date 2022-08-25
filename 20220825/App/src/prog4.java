import java.util.stream.IntStream;

public class prog4 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.range(1, 4);
        stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();
        // range() 메소드는 명시된 시작 정수를 포함하지만 마지막 정수는 포함하지 않는 스트림 생성

        IntStream stream2 = IntStream.rangeClosed(1, 4);
        stream2.forEach(e -> System.out.print(e + " "));
        // rangeClosed() 메소드는 명시된 시작 정수와 명시된 마지막 정수를 포함한 스트림 생성

    }
}
