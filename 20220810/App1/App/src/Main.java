public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Java 만세!!");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.insert(4, "Script"));
        System.out.println(str);

    }
}
