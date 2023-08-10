import java.util.Stack;
import java.util.Scanner;
public class Q10NextGreaterElementpracice {

 public static void nextgreater(int[] arr){
    int[] arr2=new int[arr.length];
    Stack<Integer> st=new Stack<>();

    for(int i=arr.length-1;i>=0;i--){
        while(!st.isEmpty() && arr[i]>=st.peek()){
            st.pop();
        }
        if(st.isEmpty()){
            arr2[i]=-1;
        }
        else{
            arr2[i]=st.peek();
        }
        st.push(arr[i]);
    }
    for(int i=0;i<=arr2.length-1;i++){
        System.out.print(arr2[i]);
    }
 }   

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr= new int[n];
    for(int i=0;i<=arr.length-1;i++){
        arr[i]=sc.nextInt();
    }
    nextgreater(arr);
 }
}
