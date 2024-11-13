import java.awt.datatransfer.StringSelection;
import java.util.*;

public class StreamApi {
    public static void main(String[] args) {
        List<String> values = new ArrayList<>();
        values.add("apple");
        values.add("banana");
        values.add("custard apple");
        values.add("pine apple");
        Optional<String> longestString= values
                .stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longestString);


    }
}

