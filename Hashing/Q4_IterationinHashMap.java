import java.util.*;
public class Q4_IterationinHashMap {
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Abhinav",210);
        hm.put("Abhishek",210);
        hm.put("Khush",210);
        hm.put("Aryan",203);
        hm.put("Aniwesh",203);
        System.out.println(hm);
        // for(String names : hm){
        //     System.out.print(names);
        // }
        Set<String> Keys= hm.keySet();
        System.out.println(Keys);

        for(String K: Keys){
            if(K=="Abhinav"){
                System.out.println(K);
            }
            
        }
    }
}
