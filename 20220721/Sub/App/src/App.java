
class STUDENT {
    String name;
    int age;
    int height;
    int weight;
}

public class App {
    public static void main(String[] args) {
        // 오늘의 숙제
        // 클래스(student)를 이용 학생은 20명 출석부 만들기
        // 키 몸무게 나이 이름 출력하기
        // Ex)
        System.out.println("번호" + "\t" + "이름" + "\t" + "나이" + "\t" + "키" + "\t" + "체중");
        STUDENT[] studentArr = new STUDENT[20];
        for (int i = 0; i < studentArr.length; i++) {
            studentArr[i] = new STUDENT();
            studentArr[i].name = "aaa";
            studentArr[i].age = (int) ((Math.random() * 3) + 18);
            studentArr[i].height = (int) ((Math.random() * 35) + 150);
            studentArr[i].weight = (int) ((studentArr[i].height - 100) * ((Math.random() * 10) + 5) / 10);

            System.out.println(
                    (i + 1) + "\t" + studentArr[i].name
                            + "\t" + studentArr[i].age + "세"
                            + "\t" + studentArr[i].height + "cm"
                            + "\t" + studentArr[i].weight + "kg");
        }

    }
}
