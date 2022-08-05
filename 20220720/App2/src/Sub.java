public class Sub {
    public static void main(String[] args) {

        int[][] arr3 = {
                { 100, 100, 100 },
                { 20, 20, 20 },
                { 30, 30, 30 },
                { 40, 40, 40 },
                { 50, 50, 50 } };
        int studentSum = 0;
        int studentAve = 0;
        int classSum = 0;
        for (int i = 0; i < arr3.length; i++) {

            for (int j = 0; j < arr3[j].length; j++) {
                studentSum += arr3[i][j];
                studentAve = studentSum / 3;

            }
            System.out.println("학생" + (i + 1) + " 총점 : " + studentSum);
            System.out.println("학생" + (i + 1) + " 평균 : " + studentAve);
            studentSum = 0;
            studentAve = 0;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr3.length; j++) {
                classSum += arr3[j][i];
            }
            System.out.println("class" + (i + 1) + ": " + classSum);
            classSum = 0;
        }
    }
}
