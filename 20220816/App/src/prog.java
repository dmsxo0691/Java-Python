import java.util.ArrayList;

public class prog {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>();

        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);

        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i) + " ");
        }
        System.out.println();

    }
}