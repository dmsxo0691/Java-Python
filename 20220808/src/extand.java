import java.util.Scanner;

public class extand {
    // person이라는 부모를 정함
    // 이름 나이 키 몸무게
    static class person {
        private String name;
        private int age;
        private int height;
        private int weight;

        public person(String name, int age, int height, int weight) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    // student 학생이 person에게 상속받아서
    // 학번 학년 학점
    static class student extends person {
        private String classNum;
        private int classGrade;
        private Double classPoint;

        public student(String name, int age, int height, int weight, String studentID, int classGrade,
                Double classPoint) {
            super(name, age, height, weight);
            this.classNum = studentID;
            this.classGrade = classGrade;
            this.classPoint = classPoint;
        }

        public String getClassNum() {
            return classNum;
        }

        public void setClassNum(String classNum) {
            this.classNum = classNum;
        }

        public int getClassGrade() {
            return classGrade;
        }

        public void setClassGrade(int classGrade) {
            this.classGrade = classGrade;
        }

        public Double getClassPoint() {
            return classPoint;
        }

        public void setClassPoint(Double classPoint) {
            this.classPoint = classPoint;
        }

        void sout() {
            System.out.println("====================");
            System.out.println("이름:" + this.getName());
            System.out.println("나이:" + this.getAge());
            System.out.println("키:" + this.getHeight());
            System.out.println("몸무게:" + this.getWeight());
            System.out.println("학번:" + this.getClassNum());
            System.out.println("학년:" + this.getClassGrade());
            System.out.println("학점:" + this.getClassPoint());
        }

    }

    static class teacher extends person {
        private int Num;
        private int Pay;
        private int Year;

        public teacher(String name, int age, int height, int weight, int num, int pay, int year) {
            super(name, age, height, weight);
            this.Num = num;
            this.Pay = pay;
            this.Year = year;
        }

        public int getNum() {
            return Num;
        }

        public void setNum(int num) {
            Num = num;
        }

        public int getPay() {
            return Pay;
        }

        public void setPay(int pay) {
            Pay = pay;
        }

        public int getYear() {
            return Year;
        }

        public void setYear(int year) {
            this.Year = year;
        }

        void sout() {
            System.out.println("====================");
            System.out.println("이름:" + this.getName());
            System.out.println("나이:" + this.getAge());
            System.out.println("키:" + this.getHeight());
            System.out.println("몸무게:" + this.getWeight());
            System.out.println("학번:" + this.getNum());
            System.out.println("학년:" + this.getPay());
            System.out.println("학점:" + this.getYear());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("총 몇명의 학생이 있습니까?");
        int number = scanner.nextInt();
        student[] student = new student[number];
        for (int i = 0; i < number; i++) {
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            Double gpa;

            System.out.print("학생의 이름을 입력하세요 : ");
            name = scanner.next();
            System.out.print("학생의 나이를 입력하세요 : ");
            age = scanner.nextInt();
            System.out.print("학생의 키를 입력하세요 : ");
            height = scanner.nextInt();
            System.out.print("학생의 몸무게를 입력하세요 : ");
            weight = scanner.nextInt();
            System.out.print("학생의 학번을 입력하세요 : ");
            studentID = scanner.next();
            System.out.print("학생의 학년을 입력하세요 : ");
            grade = scanner.nextInt();
            System.out.print("학생의 학점을 입력하세요 : ");
            gpa = scanner.nextDouble();

            student[i] = new student(name, age, height, weight, studentID, grade, gpa);
        }

        for (int i = 0; i < number; i++) {
            student[i].sout();
        }
    }
}
