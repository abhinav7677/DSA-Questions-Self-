import java.util.*;
public class Q2_LinkedHashMap {
    public static void main(String[] args){
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("Abhinav",10058);
        lhm.put("Aryan",10040);
        lhm.put("Arpit",10083);
        lhm.put("Aniwesh",10958);
        System.out.println(lhm); //All elements are printed in the input order
        System.out.println(lhm.size());
        lhm.remove("Aryan");
        System.out.println(lhm); // even after removing the order is maintained for other elements.
        System.out.println(lhm.size());

    }
}
