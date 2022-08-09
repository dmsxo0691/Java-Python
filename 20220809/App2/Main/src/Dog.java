public interface Dog {
    // 인터페이스는 미리 완성 메서드를 작성하면 오류가 발생
    // (추상화 정도가 높다)
    // abstract는 public을 빼주면 완전 메서드 사용 가능

    abstract void crying();

    public void show();
    // 인터페이스에서는 이렇게 어떤 함수가 존재한다는 것만 알려줘야 한다
    // 추상 클래스와 매우 흡사하나 인터페이스는 다중 상속을 구현할 수 있다
}
