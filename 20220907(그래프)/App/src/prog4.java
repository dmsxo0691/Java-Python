public class prog4 {

    // . 이 포함된 URL
    private static String URL = "www.tistory.co.kr";

    public static void main(String[] args) {

        System.out.println("\".\" 로 분리");
        String[] ParsedURL = URL.split(".");
        System.out.println("배열 길이 : " + ParsedURL.length);
        printarr(ParsedURL);

        System.out.println("\"[.]\" 로 분리");
        ParsedURL = URL.split("[.]");
        printarr(ParsedURL);

        System.out.println("\"\\\\.\" 로 분리");
        ParsedURL = URL.split("\\.");
        printarr(ParsedURL);
    }

    private static void printarr(String[] parsedURL) {
    }
}