public class Main {
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println("원본 문자열 : " + str);
        System.out.println("문자열 : " + str.charAt(1));

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println("\n charAt() 메소드 호출 후 원본 문자열: " + str);
    }
}
