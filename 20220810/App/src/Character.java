public class Character {
    String name;
    int str;
    int hp;
    int mp;

    public void show() {
        System.out.println("이름 : " + name);
        System.out.println("공격력 : " + str);
        System.out.println("체력 : " + hp);
        System.out.println("마력 : " + mp);
    }
}
