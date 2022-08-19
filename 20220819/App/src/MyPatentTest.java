import javax.sound.sampled.SourceDataLine;

class MyParent {
    private int prv; // 같은 클래스만 접근 가능
    int dft; // 같은 패키지만 접근 가능
    protected int prt; // 같은 패키지와 자손(다른 패키지의 자손까지)
    public int pub; // 접근 제한이 없음

    public void printMemembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}

public class MyPatentTest {
    public static void main(String[] args) {

        MyParent p = new MyParent();

        System.out.println(p.prv); // 에러
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);
    }
}