//자바에서 모든 코드는 반드시 클래스 안에 존재해야 한다.
public class App {
    //main 메서드의 선언부. 항상 동일해야 함
    public static void main(String[] args) throws Exception {
        System.out.println("ㅎㅇ");
    }
}

////////////////////////////////////////////////////

//Hello2.java 파일에 public 클래스가 있는 경우 해당 클래스명은 파일명과 동일해야 한다.
// public class Hello2{}
// class Hello3

////////////////////////////////////////////////////

// public class가 하나도 없는 경우 소스파일의 이름은 둘 다 가능하다.
// class Hello2{}
// class Hello3{}

////////////////////////////////////////////////////

// public class Hello2{}
// public class Hello3{}
// 둘 이상의 public class가 존재하면 안됨. 별도로 나누거나 둘 중 하나는 public을 빼야 함

////////////////////////////////////////////////////

/* 자바 오류 
 cannot find symbol, cannot resolve symbol
 지정된 변수 혹은 메서드를 찾을 수 없음. 확인 필요
 ';' expected : 세미콜론 확인
 Exception int thread "main" : 메인 메서드가 없는 경우
 ilegral start of ecpression : 문법적 오류
 */
