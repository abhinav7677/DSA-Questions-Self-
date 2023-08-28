import java.util.*;
public class Q3_TreeMap {
    public static void main(String[] args){
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("Abhinav",10058);
        tm.put("Aryan",10040);
        tm.put("Arpit",10083);
        tm.put("Aniwesh",10958);
        System.out.println(tm); //Sorted in the order of key
        System.out.println(tm.size());
        tm.put("Abhishek",11028);
        System.out.println(tm);
        System.out.println(tm.size());
        tm.remove("Aryan");
        System.out.println(tm);
        System.out.println(tm.size());

    }
}
