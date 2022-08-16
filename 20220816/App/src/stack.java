
import java.util.*;

public class stack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<Integer>(); // 스택의 생성
        // Deque<Integer> st = new ArrayDeque<Integer>();
        // LIFO - 라스트 인 퍼스트 아웃

        // push() 메소들르 이용한 요소의 저장
        st.push(4);
        st.push(2);
        st.push(3);
        st.push(1);

        // peek() 메소드를 이용한 요소의 반환
        System.out.println(st.peek());
        // 제일 마지막으로 저장된 요소 반환(제일 상단)
        System.out.println(st);

        System.out.println(st.pop());
        // 제일 마지막으로 저장된 요소 삭제(제일 상단)
        System.out.println(st);

    }
}