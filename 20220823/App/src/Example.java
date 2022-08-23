public class Example {

    interface MyInterface {
        void dosomething();
    }

    public static void main(String[] args) {
        MyInterface myClass = new MyInterface() {

            @Override
            public void dosomething() {
                System.out.println("do something");
            }
        };
        myClass.dosomething();
    }
}
