
class Sub {
    int[] subArr = new int[9];

    // {5,8,9,10} 5
    int[] divisible(int[] arr, int divisor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                subArr[i] = arr[i];
            }
        }
        return subArr;
    }
}

public class sub {
    public static void main(String[] args) {

        // 가운데 글자만 리턴하기
        // Ex) input Java = av
        // power = w

        int[] Num = new int[9];
        for (int i = 0; i < Num.length; i++) {
            Num[i] = (int) (Math.random() * 10);
        }

        Sub sub1 = new Sub();
        sub1.divisible(Num, 3);
        System.out.println(sub1.subArr);
    }

}
