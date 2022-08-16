
import java.util.*;

public class stack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<Integer>(); // 스택의 생성
        // Deque<Integer> st = new ArrayDeque<Integer>();

        // push() 메소들르 이용한 요소의 저장
        st.push(4);
        st.push(2);
        st.push(3);
        st.push(1);

        // peek() 메소드를 이용한 요소의 반환
        System.out.println(st.peek());
        System.out.println(st);
    }
}