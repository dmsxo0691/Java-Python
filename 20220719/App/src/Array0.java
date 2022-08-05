import java.util.Arrays;

public class Array0 {
    public static void main(String[] args) {
        // //배열 복사
        // //for문을 이용한 방법
        // int []arr = new int[5];
        // //기존 배열 길이의 두 배인 배열 생성
        // int []temp = new int[arr.length*2];
        // for (int i = 0; i < arr.length; i++) {
        // temp[i] = arr[i]; //arr[i]값을 temp[i]에 저장
        // }
        // arr = temp; //참조변수 arr 새로운 배열을 가리키게 한다.

        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = i + 1;
        // }
        // System.out.println("[변경전]");
        // System.out.println("arr의 길이 : " + arr.length);

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("arr[" + i + "]:" + arr[i]);
        // }

        // int[] temp = new int[arr.length * 2];

        // // 배열 arr에 저장된 값들을 배열 temp에 복사한다.
        // for (int i = 0; i < arr.length; i++) {
        // temp[i] = arr[i];
        // }
        // arr = temp;

        // System.out.println("[변경후]");
        // System.out.println("arr의 길이 : " + arr.length);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("arr[" + i + "]:" + arr[i]);
        // }

        // num num[]0에서 nuwNum numNum[0]으로 num.length 개의 데이터 복사
        // System.arraycopy(src, srcPos, dest, destPos, length);
        // System.arraycopy(): 간단하고 빠르다.

        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        System.out.println(abc);
        System.out.println(num);

        // 배열 abc와 num을 붙여서 하나의 배열로 만듦.
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        // 셔플
        int[] numArr = new int[10];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
            System.out.println(i);
        }
        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10);
            int temp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = temp;
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }

        // 지금 해볼 것

        // 2. 로또 번호 만들기

        int[] lotto = new int[7];
        for (int i = 0; i < lotto.length; i++) {
            int lottoNum = (int) (Math.random() * 45) + 1;
            if (lottoNum == 0) {
                continue;
            }
            for (int j = 0; j < lotto.length; j++) {
                if (lottoNum == lotto[i]) {
                    continue;
                }
            }
            lotto[i] = lottoNum;
        }
        System.out.print(Arrays.toString(lotto));
        // 1. 배열의 모든 요소를 더해서 총합과 평균 구하기

        int sum = 0;
        int ave = 0;
        for (int i = 0; i < lotto.length; i++) {
            sum += lotto[i];
        }
        ave = sum / lotto.length;
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + ave);
    }
}
