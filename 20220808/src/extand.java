public class extand {
    // person이라는 부모를 정함
    // 이름 나이 키 몸무게
    static class person {
        String name;
        int age;
        int height;
        int weight;
    }

    // student 학생이 person에게 상속받아서
    // 학번 학년 학점
    static class student extends person {
        int classNum;
        int classGrade;
        Double classPoint;

        student(String name, int age, int height, int weight, int classNum, int classGrade, Double classPoint) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.classNum = classNum;
            this.classGrade = classGrade;
            this.classPoint = classPoint;
        }

        public student() {
        }
    }

    public static void main(String[] args) {
        student person = new student("홍길동", 20, 175, 80, 20170101, 1, 4.5);
        student person1 = new student("이순신", 20, 175, 80, 20170101, 1, 4.0);
        System.out.println("==================");
        System.out.println("학생 이름 : " + person.name);
        System.out.println("학생 나이 : " + person.age);
        System.out.println("학생 키 : " + person.height);
        System.out.println("학생 몸무게 : " + person.weight);
        System.out.println("학번 : " + person.classNum);
        System.out.println("학년 : " + person.classGrade);
        System.out.println("학점 : " + person.classPoint);
        System.out.println("==================");
        System.out.println("학생 이름 : " + person1.name);
        System.out.println("학생 나이 : " + person1.age);
        System.out.println("학생 키 : " + person1.height);
        System.out.println("학생 몸무게 : " + person1.weight);
        System.out.println("학번 : " + person1.classNum);
        System.out.println("학년 : " + person1.classGrade);
        System.out.println("학점 : " + person1.classPoint);
    }
}
