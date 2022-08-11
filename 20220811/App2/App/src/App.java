import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        File file = new File("test.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(file);

            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
// test.txt 파일은 반드시 프로젝트 폴더 최상위에 생성해야 함(src나 패키지 폴더 아님)
// File 클래스를 이용해 특정 파일을 읽을 수 있도록 스트림 생성
// File 객체를 Scanner 클래스의 생성자 인자로 전달
// 파일로부터 데이터가 있을때까지 읽어 출력