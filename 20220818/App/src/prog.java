import java.util.HashSet;
import java.util.Iterator;

public class prog {
    public static void main(String[] args) {
        HashSet<String> hs01 = new HashSet<String>();
        HashSet<String> hs02 = new HashSet<String>();

        hs01.add("홍길동");
        hs01.add("이순신");
        System.out.println(hs01.add("임꺽정"));
        System.out.println(hs01.add("임꺽정"));

        for (String e : hs01) {
            System.out.print(e + " ");
        }

        hs02.add("홍길동");
        hs02.add("이순신");
        hs02.add("임꺽정");

        // iterator() 메소드를 이용한 요소출력
        Iterator<String> iter02 = hs02.iterator();
        while (iter02.hasNext()) {
            System.out.println(iter02.next() + " ");
        }

        // size() 메소드를 이용한 요소의 총 개수

        System.out.println("집합의 크기 : " + hs02.size());
    }
}
// set 컬렉션
// 1. 저장 순서를 유지하지 않습니다.
// 2. 같은 요소의 중복 저장을 허용하지 않습니다.

// 1. HashSet<E>
// 2. TreeSet<E>
