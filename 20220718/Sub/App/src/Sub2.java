public class Sub2 {
    public static void main(String[] args) {
        // 숙제 숫자중에 3의 배수(3,6,9)가 포함되어 있으면 포함된 개수만큼 박수를 친다.
        // 1~100까지 출력
        int num;
        int num2;
        for (int i = 1; i <= 100; i++) {
            System.out.println();
            num = i % 10;
            num2 = i / 10;
            if (i == 3 || i == 6 || i == 9) {
                System.out.print("짝");
            } else if (num == 3 || num == 6 || num == 9) {
                System.out.print("짝");
                if (num2 == 3 || num2 == 6 || num2 == 9) {
                    System.out.print("짝");
                }
            } else if (num2 == 3 || num2 == 6 || num2 == 9) {
                System.out.print("짝");
            } else {
                System.out.print(i);
            }

        }
    }
    
}
