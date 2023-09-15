import java.util.*;
public class Q7_HashSet {
    public static void main(String[] args){
        HashSet<String> City=new HashSet<>();
        City.add("Patna");
        City.add("Ranchi");
        City.add("Delhi");
        City.add("Pune");
        City.add("Bangalore");
        City.add("Patna");// Duplicate values are not included
        City.add("patna"); //Case Sensitive
        System.out.println(City);
        System.out.println(City.size());
        City.remove("patna");
        System.out.println(City);
        System.out.println(City.size());
        City.clear();
        System.out.println(City.isEmpty());
        System.out.println(City.size());
    }
}
