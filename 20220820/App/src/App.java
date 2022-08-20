import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] inputNum = new int[1000];
        for (int i = 0; i < inputNum.length; i++) {
            inputNum[i] = (int) (Math.random() * 100);
        }

        int[] check = new int[1000];
        for (int i = 0; i < check.length; i++) {
            check[inputNum[i]]++;
        }

        int checkNum = 0;
        int checkCount = 0;
        for (int i = 0; i < inputNum.length; i++) {
            if (checkCount < check[i]) {
                checkCount = check[i];
                checkNum = i;
            }
        }

        System.out.println("최빈수: " + checkNum + "빈도수: " + checkCount);
    }
}
