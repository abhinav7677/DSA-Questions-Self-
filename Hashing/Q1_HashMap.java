import java.util.*;
public class Q1_HashMap{
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Abhinav",10058);
        hm.put("Aryan",10040);
        hm.put("Arpit",10083);
        hm.put("Aniwesh",10958);
        System.out.println(hm);
        hm.remove("Aryan");
        System.out.println(hm);
        int roll=hm.get("Abhinav");
        System.out.println("Abhinav Roll No.= "+roll);
        System.out.println(hm.containsKey("Abhinav"));
        System.out.println(hm.containsKey("abhinav"));  //case sesitive
        System.out.println(hm.containsKey("Aryan")); //removed element

        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        System.out.println(hm);
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println(hm);
    }
}