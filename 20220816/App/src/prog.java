import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class prog {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        // <Interger> 제네릭
        // add() 메소드를 이용한 요소의 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);

        // for 문과 get() 메소드를 이용한 요소의 출력
        for (int i = 0; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
        System.out.println();

        arrList.remove(1);

        for (int e : arrList) {
            System.out.print(e + " ");
            // 각각 실행
        }
        System.out.println();

        arrList.set(0, 20);

        for (int e : arrList) {
            System.out.print(e + " ");
            // 각각 실행
        }
        System.out.println();

        Collections.sort(arrList);
        // Collections 클래스일 뿐임, Collection 과 무관함 - Collection : 최상위 인터페이스니 주의 요망
        // List, Set, Map에서 배열을 정렬할 때 사용함.
        Iterator<Integer> iter = arrList.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        // Iterator 는 자바 컬렉션 프레임 워크에서 컬렉션에 저장되어 있는 요소를 읽어오는 표준 방법
        // iter.hasNext() 읽어온 요소가 남아있는지 확인하는 메소드, 있으면 true 없으면 false
        System.out.println();

        System.out.println("리스트의 크기: " + arrList.size());

    }

}
// 자바에서 제네릭이란 데이터의 타입을 일반화한다.
// 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법이다.

// 컬렉션 프레임 워크
// 컬렉션 프레임 워크: 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법
// 데이터를 저장하는 자료구조와 처리하는 알고리즘을 구조화하여 클래스로 구현해놓은 것
// 이러한 컬렉션 프레임 워크는 자바의 인터페이스를 사용하여 구현됨

// 컬렉션 프레임 워크 - 주요 인터페이스

// List 인터페이스
// - ArrayList, LinkedList, Stack, Queue, vector(예전)
// - ArrayList - 삽임, 삭제, 정렬, 변경
// Set 인터페이스
// Map 인터페이스