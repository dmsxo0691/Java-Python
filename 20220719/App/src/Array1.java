public class Array1 {
    public static void main(String[] args) {

        // 최대값 최소값 구하기
        int[] score = { 79, 88, 91, 33, 10, 55, 95 };

        int max = score[0];
        int min = score[0];

        // 반복문을 돌면서
        for (int i = 0; i < score.length; i++) {
            // 만약 배열에 담긴 max의 값보다 크면
            if (score[i] > max) {
                // 이 값을 max에 저장
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
