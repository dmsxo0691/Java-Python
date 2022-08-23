public class Example {

    interface MyInterface {
        void dosomething();
    }

    public static void main(String[] args) {
        MyInterface myClass = new MyInterface() {

            @Override
            public void dosomething() {
                System.out.println("do something");
            }
        };
        myClass.dosomething();
    }
}
// 익명 클래스
// 익명 클래스란 다른 내부 클래스와는 달리 이름을 가지지 않는 클래스
// 클래스의 선언과 동시에 객체를 생성하므로, 단하나의 객체만을 생성하는 일회용 클래스
// 생성자를 선언할 수도 없으며, 오로지 단 하나의 클래스나 인터페이스를 상속받거나 구현한다
// 클래스이름 참조변수이름 = new 클래스이름(){
// 메소드의 선언
// }