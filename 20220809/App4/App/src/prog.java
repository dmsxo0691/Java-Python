import java.util.ArrayList;
import java.util.*;

public class prog {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // 리스트에 요소의 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
        System.out.println();

        // arrList의 1번 인덱스를 삭제
        arrList.remove(1);

        // Enhanced for 문
        // (int e : arrList) : arrList의 길이만큼 for문 실행
        for (int e : arrList) {
            System.out.print(e + " ");
        }
        System.out.println();

        arrList.set(0, 20);
        for (int e : arrList) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("리스트의 크기 : " + arrList.size());
    }
}
// 배열과의 차이점: 배열은 크기가 고정인 반면 ArrayList는 크기가 가변적으로 변함
// 내부적으로 저장이 가능한 메모리 용량이 있으며 현재 사용중인 공간의 크기(size)가 있다.
// 만약 현재 가용량 이상을 저장하려고 할 때 더 큰 공간의 메모리를 새롭게 할당
// 이러한 특성 때문에 데이터가 얼마나 추가될지 추정할 수 없는 배열에 주로 사용된다.
