class Parent {

    public void show() {
        System.out.println("hi");
    }

}

public class Main2 extends Parent {

    public void show() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        Main2 main = new Main2();
        main.show();

    }

}