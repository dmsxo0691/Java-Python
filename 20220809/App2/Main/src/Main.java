public class Main implements Dog, Cat {
    public static void main(String[] args) {
        Main main = new Main();
        main.crying();
        main.one();
        main.two();
    }

    @Override
    public void crying() {
        // TODO Auto-generated method stub
        System.out.println("월월");
    }

    @Override
    public void one() {
        // TODO Auto-generated method stub
        System.out.println("one");
    }

    @Override
    public void two() {
        // TODO Auto-generated method stub
        System.out.println("two");
    }

}
