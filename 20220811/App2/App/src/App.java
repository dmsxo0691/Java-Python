import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = Arrays.copyOf(arr1, 3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int[] arr3 = Arrays.copyOf(arr1, 10);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);

        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
        System.out.println();

        int[] arr9 = new int[10];
        Arrays.fill(arr9, 7);
        for (int i = 0; i < arr9.length; i++) {
            System.out.print(arr9[i] + " ");
        }
        // 전달받은 모든 요소를 특정값으로 초기화
        System.out.println();

        int[] arr10 = { 5, 3, 4, 1, 2 };

        Arrays.sort(arr10);
        for (int i = 0; i < arr10.length; i++) {
            System.out.print(arr10[i] + " ");
        }
    }
}
