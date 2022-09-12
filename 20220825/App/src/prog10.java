import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class prog10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Melon", "Grape", "Strawberry"));

        System.out.println(list);
        System.out.println(list.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(" ")));

        System.out.println(list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList())); // [APPLE, BANANA,
                                                                                                  // MELON, GRAPE,
                                                                                                  // STRAWBERRY]
        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList())); // [APPLE, BANANA,
                                                                                                 // MELON, GRAPE,
                                                                                                 // STRAWBERRY]

        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}