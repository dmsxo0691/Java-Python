import java.util.Arrays;

public class sub {
    public static void main(String[] args) {
        int[] lotto = new int[7];
        int lottoNum;
        for (int i = 0; i < lotto.length; i++) {
            lottoNum = (int) (Math.random() * 45) + 1;
            if (lottoNum == 0) {
                continue;
            }
            for (int j = 0; j < 7; j++) {
                if (lottoNum == lotto[i]) {
                    continue;
                }
            }
            lotto[i] = lottoNum;
        }
        for (int k = 0; k < 7; k++) {
            System.out.printf("%d ", lotto[k]);
        }

        ///////////////////////////

        int sum = 0;
        int ave = 0;
        for (int i = 0; i < lotto.length; i++) {
            sum += lotto[i];
        }
        ave = sum / lotto.length;
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + ave);

        System.out.println();
        System.out.println();
        System.out.println();

        // 배열에 어떤 값이 몇개 저장되어 있는지 세어서 보여주자

        int[] numArr = new int[10];
        int[] numArr2 = new int[10];
        boolean[] checked = new boolean[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
        }

        for (int j = 0; j < numArr.length; j++) {

            int temp = numArr[j];
            if (!checked[temp]) {
                for (int k = 0; k < numArr.length; k++) {
                    if (numArr[k] == numArr[j])
                        numArr2[j] += 1;
                }
            }
            checked[temp] = true;
        }

        System.out.println(Arrays.toString(numArr));
        System.out.println(Arrays.toString(numArr2));

    }
}
