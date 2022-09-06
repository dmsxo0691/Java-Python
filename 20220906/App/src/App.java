import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        FileInputStream input = null;
        try {
            // 화면에 표시하고자하는 파일을 선택
            File file = new File("c:\\java\\java8.bat");

            // FileInputStream 은 File object를 생성자 인수로 받을 수 있다.
            input = new FileInputStream(file);
            int i = 0;
            while ((i = input.read()) != -1) {
                System.out.write(i);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                // 생성된 InputStreamObject를 닫아준다
                input.close();
            } catch (IOException io) {
            }
        }
    }
}
