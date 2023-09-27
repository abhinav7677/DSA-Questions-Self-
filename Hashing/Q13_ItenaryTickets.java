import java.util.*;
public class Q13_ItenaryTickets {

    public static String getstartingpoint(HashMap<String,String> map){
        HashMap<String,String> revmap=new HashMap<>();
        Set<String> Keys=map.keySet();

        for(String k:Keys){
            revmap.put(map.get(k),k);
        }
        for(String k:Keys){
            if(!revmap.containsKey(k)){
                return k;
            }
            
        }
        return null; //to tackle syntax error if tickets are not given properly in question;
    }
    public static void main(String[] args){
        // Itenary --> Chennai to bangalore
        // Itenary --> Mumbai to Delhi
        // Itenary --> Goa to Chennai
        // Itenary --> Delhi to Goa

        HashMap<String,String> map=new HashMap<>();
        map.put("Chennai","Bangalore");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        String startingpoint=getstartingpoint(map);
        System.out.print(startingpoint);

        Set<String> Keys=map.keySet();
        for(String k: Keys){
            System.out.print( "--> "+ map.get(startingpoint));
            startingpoint=map.get(startingpoint);
        }

    }
}
