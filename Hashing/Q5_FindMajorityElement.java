import java.util.*;
public class Q5_FindMajorityElement {
    public static void main(String[] args){
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){

            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        int n=arr.length;
        Set<Integer> Keys= hm.keySet();

        for(Integer k:Keys){
            if(hm.get(k)>=n/3){
                System.out.println(k);
            }
        }
        
    }
}
