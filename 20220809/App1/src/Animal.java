abstract class Animal {
    abstract void crying();

    // 추상 클래스에서 완전 메서드를 기재하여 오류 발생
    void crying() {
        System.out.println("오류");
    }

}
