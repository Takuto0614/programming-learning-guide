import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}