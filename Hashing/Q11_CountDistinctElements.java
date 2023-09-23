import java.util.*;
public class Q11_CountDistinctElements {
    public static int Distinct(int[] arr){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,1,2,3,4};
        System.out.print(Distinct(arr));
    }
}
