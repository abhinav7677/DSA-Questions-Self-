import java.util.*;
public class Q6_Anagram {
    public static boolean Anagram(String s,String t){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(int i=0;i<=t.length()-1;i++){
            char ch=t.charAt(i);

            // if(hm.containsKey(ch)){
            //     hm.put(ch,hm.get(ch)-1);
            // }
            // else{
            //     return false;
            // }

            if(hm.get(ch)!=null){
                if(hm.get(ch)==1){
                    hm.remove(ch);
                }
                else{
                    hm.put(ch,hm.get(ch)-1);
                }
            }
            else{
                return false;
            }
            
        }
        return hm.isEmpty();
    }
    public static void main(String[] args){
        String s="race";
        String t="care";
        System.out.println(Anagram(s, t));
    }
}
