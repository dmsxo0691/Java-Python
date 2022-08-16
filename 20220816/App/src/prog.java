import java.util.ArrayList;

public class prog {
    public static void main(String[] args) {

        ArrayList arrList = new ArrayList();
        // <Integer> 제네릭

        arrList.add("hello world");

        String myString = (String) arrList.get(0);
        System.out.println(myString);

    }
    // 자바에서 제네릭이란 데이터의 타입을 일반화한다.
    // 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법이다.
}