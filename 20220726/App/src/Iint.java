public class Iint {
    // 명시적 초기화
    static int classVariable = 1;
    int instanceValue = 1;

    // 클래스 초기화 블럭
    static {
        classVariable = 2;
    }

    // 인스턴스 초기화 블럭
    {
        instanceValue = 2;
    }

    // 생성자
    Iint() {
        instanceValue = 3;
    }

    public static void main(String[] args) {
        Iint init = new Iint();

        // 클래스 변수 초기화
        // 1. classVariable 메모리에 생성되고 default value인 0이 저장됨
        // 2. 명시적 초기화에 의해 classVariable에 1이 저장됨
        // 3. 클래스 초기화 블럭에 의해 classVariable에 2가 저장됨

        // 인스턴스 변수 초기화
        // 1. Init 클래스의 인스턴스가 생성되면서 instanceValue 메모리(heap)에 생성되고 default value인 0이 저장됨
        // 2. 명시적 초기화에 의해 classVariable에 1이 저장됨
        // 3. 인스턴스 초기화 블럭에 의해 instanceValue에 2가 저장됨
        // 4. 생성자로 인해 instanceValue에 3가 저장됨
    }
}
