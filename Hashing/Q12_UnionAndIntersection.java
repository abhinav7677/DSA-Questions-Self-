import java.util.*;
public class Q12_UnionAndIntersection {
    public static void main(String[] args){
        int arr1[]={1,2,3,4,5};
        int arr2[]={4,5,6,7};
        HashSet<Integer> hs=new HashSet<>();
        // for union
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        System.out.println("Union --> " +hs.size());

        hs.clear();
        // System.out.println(hs.size());
        //For Intersection

        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        // System.out.println(hs.size());
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
            count++;
            hs.remove(arr2[i]); // So the elements dont get counted twice.
            }
        }
        System.out.println("Intersection --> "+count);
    }
}
