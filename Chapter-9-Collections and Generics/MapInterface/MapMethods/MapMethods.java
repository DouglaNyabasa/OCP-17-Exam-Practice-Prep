import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        System.out.println(map.containsKey(1));
	map.put(1,"luffy D");
	System.out.println(map.containsKey(1));
	map.put(1,"goku");
        System.out.println(map.containsKey(1));
	map.forEach((k,v) -> System.out.println(v));
	System.out.println("================================");
	map.put(2,"midoria");
	map.put(3,"Ichigo");
	map.values().forEach(System.out::println);
	System.out.println("================================");
	map.putIfAbsent(4,"kenny kempachy");
	map.values().forEach(System.out::println);
	System.out.println("================================");
        System.out.println(map.get(1));
	System.out.println("================================");
        System.out.println(map.remove(1));
	map.replace(2,"Deku");
	map.forEach((k,v)-> System.out.println(v));
	System.out.println("================================");
        System.out.println(map.size());
	map.keySet().forEach(System.out::println);
	map.values().forEach(System.out::println);






    } 
}

