public class extand {
    // person이라는 부모를 정함
    // 이름 나이 키 몸무게
    static class person {
        protected String name;
        protected int age;
        protected int height;
        protected int weight;

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
        private int classNum;
        private int classGrade;
        private Double classPoint;

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

        public int getClassNum() {
            return classNum;
        }

        public void setClassNum(int classNum) {
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
            System.out.println("학점:" + this.getClassNum());
        }

    }

    public static void main(String[] args) {
        student person = new student("홍길동", 20, 175, 80, 20170101, 1, 4.5);
        student person1 = new student("이순신", 20, 175, 80, 20170101, 1, 4.0);
        person.sout();
        person1.sout();
    }
}
