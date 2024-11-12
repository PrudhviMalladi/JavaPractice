import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> num =  Arrays.asList(10,15,20);
        num.stream()
                .filter(n -> n%2==0)
                .forEach(System.out::println);
    }
}
