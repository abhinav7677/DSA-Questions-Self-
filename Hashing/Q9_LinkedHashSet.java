import java.util.*;
public class Q9_LinkedHashSet {
    public static void main(String[] args){
        LinkedHashSet<String> city=new LinkedHashSet<>();
        city.add("Patna");
        city.add("Ranchi");
        city.add("Delhi");
        city.add("Bangalore");
        System.out.println(city); // order is preserved
    }
}
