import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        str.add("Apple");
        str.add("grapes");
        str.add("Watermelon");
        str.add("Sapota");
        str.forEach(fruits -> System.out.println(fruits));
    }
}
