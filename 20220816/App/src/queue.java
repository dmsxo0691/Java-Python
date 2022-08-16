import java.util.LinkedList;

public class queue {
    public static void main(String[] args) {
        LinkedList<String> qu = new LinkedList<String>(); // 큐의 생성
        // add() 메소드를 이용한 요소의 저장
        qu.add("넷");
        qu.add("둘");
        qu.add("셋");
        qu.add("하나");

        // peek() 메소드를 이용한 요소의 반환
        System.out.println(qu.peek());
        System.out.println(qu);

        // poll() 메소드를 이용한 요소의 반환 및 제거

        // FIOF 퍼스트 인 퍼스트 아웃
        System.out.println(qu.poll());
        System.out.println(qu);

        // remobe() 메소드를 이용한 요소 제거
        qu.remove("하나");
        System.out.println(qu);
    }
}
