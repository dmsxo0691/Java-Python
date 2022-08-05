
class TV {

    // 멤버 변수
    String color; // 색상
    boolean power; // 전원
    int channel; // 채널

    // 기능
    void power() {
        power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}

public class OneClass {
    public static void main(String[] args) {
        // 객체지향
        // 1. 코드의 재사용성이 높다: 새로운 코드를 작성할 때 기존의 코드를 이용해 쉽게 작성할 수 있다.
        // 2. 코드의 관리가 용이하다. 코드 간의 관계를 이용해서 적은 노력으로 쉽게 코드를 변경할 수 있다.
        // 3. 신뢰성이 높은 프로그래밍을 가능하게 한다: 제어, 메서드 등을 이용해서 데이터를 보호하고 올바른 값을 유지하도록 한다.
        // 코드의 중복을 제거하고 코드의 불일치로 인한 오작동을 방지할 수 있다.

        // class와 object
        // 클래스란? 객체를 정의해 놓은 것. 객체의 설계도, 틀
        // 클래스의 용도: 객체를 생성하는 용도

        // 객체(opject): 사전적 의미로는 실제로 존재하는 것.

        // 객체와 인스턴스 :
        // 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화 라고 한다.
        // 어떤 클래스로부터 만들어진 객체를 해당 클래스의 인스턴스라고 부른다.

        // 객체의 구성
        // 속성, 기능

        ////////////////

        // 클래스명 변수명; 클래스의 객체를 참조하기 위한 참조변수 선언
        // 변수명 = new 클래스명(); 클래스의 객체를 생성한 후 객체의 주소를 참조변수에 저장

        // TV t; // TV 클래스 타입의 참조변수 t를 선언
        // t = new TV(); // TV인스턴스를 생성한 다음 TV인스턴스의 주소를 t에 대입

        // t.channel = 7; // TV 인스턴스의 멤버 변수 channel의 값을 7로 설정
        // t.channelDown(); // Tv 인스턴스의 메서드 channelDown을 호출

        // System.out.println("현재 내가 보고 싶은 채널 : " + t.channel + "이다.");

        ///////////////////////

        TV t1 = new TV();
        TV t2 = new TV();

        System.out.println("t1의 채널 : " + t1.channel + "이다.");
        System.out.println("t2의 채널 : " + t2.channel + "이다.");

        // t1이 가지고 있는 값(주소)
        // t2에 저장(t1이 참조하고 있는 인스턴스를 같이 참조하게 된다. t2가 참조하고 있던 인스턴스는 더이상 사용할 수 없다.)
        t2 = t1;
        t1.channel = 10;
        System.out.println();
        System.out.println("t1의 채널 : " + t1.channel + "이다.");
        System.out.println("t2의 채널 : " + t2.channel + "이다.");

        // TV tv1,tv2,tv3...

        // 객체를 생성해서 배열의 각 요소에 저장
        // tvArr[0] = new TV();
        // tvArr[1] = new TV();
        // tvArr[2] = new TV();

        // // 배열의 초기화 블럭을 사용하여 한 줄로 처리
        // TV[] tvArr1 = { new TV(), new TV(), new TV() };

        // // for문 이용
        // TV[] tvArr2 = new TV[100];

        // for (int i = 0; i < tvArr2.length; i++) {
        // tvArr2[i] = new TV();
        // }

        TV[] tvArr = new TV[3];
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new TV();
            tvArr[i].channel = i + 10; // tvArr[i]의 channel에 i+10 저장
        }
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);

            // 출력 결과
            /*
             * tvArr[0].channel = 11
             * tvArr[1].channel = 12
             * tvArr[2].channel = 13
             */

            // 오늘의 숙제

        }
    }
}
