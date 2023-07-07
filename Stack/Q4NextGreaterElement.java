import java.util.*;
public class Q4NextGreaterElement {

public static int[] NextGreaterElement(int[] arr){
int[] nge= new int[arr.length];
Stack<Integer> st=new Stack<>();
st.push(arr[arr.length-1]);
nge[arr.length-1]=-1;
for(int i=arr.length-2;i>=0;i--){
while(st.size()>0 && arr[i]>=st.peek()){
st.pop();
}
    if(st.size()==0){
        nge[i]=-1;
    }
    else{
        nge[i]=st.peek();
}
st.push(arr[i]);
}
return nge;
}
    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];

    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }

    int[] answer=NextGreaterElement(a);
    for(int i=0;i<answer.length;i++){
        System.out.print(" "+answer[i]);
    }
}
}

