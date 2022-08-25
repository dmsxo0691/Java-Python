import java.util.stream.Stream;

public class prog7 {
    public static void main(String[] args) {
        // 빈 스트림 생성
        Stream<Object> stream = Stream.empty();
        System.out.println(stream.count()); // 스트림 요소의 총 개수 출력
    }
}
// 아무 요소도 가지지 않는 빈 스트림은 Stream 클래스의 empty()메소드를 사용하여 생성할 수 있습니다.
