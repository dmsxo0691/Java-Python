import java.util.Arrays;
import java.util.Scanner;

class Sub {

    int[] subArr = new int[9];

    int[] newArr = new int[subArr.length + 1];

    int[] divisible(int[] arr, int divisor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                subArr[i] = arr[i];
                for (int j = 0; j < subArr.length; j++) {
                    newArr[j] = subArr[j];
                    newArr[subArr.length] = subArr[i];
                }
            }
        }
        return subArr;
    }

}

public class App {
    public static void main(String[] args) {

        int[] Num = new int[9];
        for (int i = 0; i < Num.length; i++) {
            Num[i] = (int) (Math.random() * 10);
        }

        Sub sub1 = new Sub();
        sub1.divisible(Num, 3);
        System.out.println(Arrays.toString(sub1.newArr));

        // 가운데 글자만 리턴하기
        // Ex) input Java = av
        // power = w

        Scanner scanner = new Scanner(System.in);
        String Ex = scanner.nextLine();
        char[] input = Ex.toCharArray();

        if (input.length % 2 == 0) {
            System.out.print(input[(input.length / 2) - 1]);
            System.out.print(input[input.length / 2]);
        } else if (input.length % 2 == 1) {
            System.out.print(input[input.length / 2]);
        }
    }

}