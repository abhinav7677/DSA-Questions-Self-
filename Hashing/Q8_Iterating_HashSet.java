import java.util.*;
public class Q8_Iterating_HashSet {
    public static void main(String[] args){
        HashSet<String> city=new HashSet<>();
        city.add("Patna");
        city.add("Mumbai");
        city.add("Hyderaad");
        city.add("Chennai");
        Iterator it= city.iterator();
        while(it.hasNext()){
            System.out.print(" Using Iterator -->  "+it.next());  //initially iterator it points at null;
        }
        System.out.println();
        //WE can also use foreach loop;
        for(String cities:city){ //Since we already have a set.
            System.out.print(" Using ForEach Loop -->  "+cities); 
        }
    }
}
