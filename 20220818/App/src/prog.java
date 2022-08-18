import java.util.HashSet;

public class prog {
    public static void main(String[] args) {
        HashSet<String> hs01 = new HashSet<String>();
        HashSet<String> hs02 = new HashSet<String>();

        hs01.add("홍길동");
        hs01.add("이순신");
        System.out.println(hs01.add("임꺽정"));
        System.out.println(hs01.add("임꺽정"));
    }
}
