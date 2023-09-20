import java.util.*;
public class Q10_TreeSet {
    public static void main(String[] args){
        TreeSet<String> city=new TreeSet<>();
        city.add("Patna");
        city.add("Ranchi");
        city.add("Delhi");
        city.add("Bangalore");
        System.out.println(city); // Sorted output
        city.add("bangalore"); // Sorted According to ascii value. since Capital B has smaller ascii value and Small b has higher ascii value
        city.add("patna");
        System.out.println(city); //output including case sesitive characters
        
    }
}
