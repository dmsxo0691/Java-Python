import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("바나나: 1 , 복숭아: 2");

        int input = scanner.nextInt();
        Fruit fruit;
        Character character;

        if (input == 1) {
            fruit = new Banana();
            fruit.show();
        } else if (input == 2) {
            fruit = new Peach();
            fruit.show();
        } else if (input == 3) {
            character = new War();
            character.show();
        } else if (input == 4) {
            character = new Mag();
            character.show();3
        } else if (input == 5) {
            character = new Thi();
            character.show();
        }

    }
}
