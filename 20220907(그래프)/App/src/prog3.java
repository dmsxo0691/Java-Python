public class prog3 {

    // 공백 있는 문자열
    private static String Space = "게임 하고싶다.";

    public static void main(String[] args) {

        System.out.println("\" \" 로 분리");
        String[] ParsedSpace = Space.split(" ");
        printarr(ParsedSpace);

        System.out.println("\\\\s 로 분리");
        ParsedSpace = Space.split("\\s");
        printarr(ParsedSpace);
    }

    private static void printarr(String[] parsedSpace) {
    }
}
