import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 배열 2
        // 1차원 배열
        // int[] arr = new int[5];

        // 2차원 배열
        // 타입[][] 변수이름 = int[][]score;
        // 타입 변수이름 [][] = int score[][];
        // 타입[] 변수이름[] = int[] score[];

        // 4행 3열의 2차원 배열을 생성
        // int[][] score = new int[4][3];

        /////////////////////

        // 2차원 배열은 행과 열로 구성되어 있기 때문에 idx도 행과 열에 각각 하나씩 존재한다.

        // 초기화
        // int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
        // int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } }; // 생략가능
        // int[][] arr2 = new int[][] {
        // { 1, 2, 3 },
        // { 4, 5, 6 } };

        int[][] arr3 = {
                { 100, 100, 100 },
                { 20, 20, 20 },
                { 30, 30, 30 },
                { 40, 40, 40 },
                { 50, 50, 50 } };

        System.out.println(Arrays.toString(arr3[0]));
        System.out.println(Arrays.toString(arr3[1]));
        System.out.println(Arrays.toString(arr3[2]));
        System.out.println(Arrays.toString(arr3[3]));
        System.out.println(Arrays.toString(arr3[4]));

        int sum = 0;
        for (int[] temp : arr3) {// [] 없을 경우 에러 2차원 배열의 score의 각 요소는 1차원 배열이기 때문
            // score의 각 요소 (1차원의 배열 주소)를 temp에 저장
            for (int i : temp) { // temp 1차원 배열을 가리키는 참조변수
                sum += i;
            }
        }
        System.out.println(sum);

        // int[][] arr3 = {
        // 국어 수학 영어
        // { 100, 100, 100 },
        // { 20, 20, 20 },
        // { 30, 30, 30 },
        // { 40, 40, 40 },
        // { 50, 50, 50 } };
        // 1. 2차원 배열을 이용한다
        // 2. 5명 학생의 3과목을 더해서 각 학생의 총점과 평균을 계산하고
        // 3. 과목별 총점을 계산해서 출력해보기

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
