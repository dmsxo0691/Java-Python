public class Example2 {
    public static abstract class MyAbstractClass {
        public abstract void dosomething();
    }

    public static void main(String[] args) {
        MyAbstractClass myClass = new MyAbstractClass() {

            @Override
            public void dosomething() {
                System.out.println("do something");
            }
        };
        myClass.dosomething();
    }
}
