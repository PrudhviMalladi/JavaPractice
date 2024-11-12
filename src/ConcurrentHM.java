import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHM {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        map.put("Prudhvi", 1);
        map.put("", null);
        map.put("Hai",6);
        System.out.println("Map Size " + map.size());
        int value =map.get("Prudhvi");
        System.out.println("value is " + value);
  map.remove("Hai");
        System.out.println("Map Size "+ map.size());
    }
}
