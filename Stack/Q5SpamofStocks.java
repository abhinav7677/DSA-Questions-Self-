import java.util.*; //check
public class Q5SpamofStocks {

    public static int[] solve(int[] arr){
        int[] span=new int[arr.length];
        Stack<Integer> st=new Stack<>();

        span[0]=1;
        for(int i=0;i<arr.length;i++){
            st.push(0);
            span[0]=1;
            while(st.size()>0 && arr[i]>st.peek()){
                st.pop();
                if(st.size()==0){
                    span[i]=i+1;
                }
                else{
                    span[i]=i-st.peek();
                }

                st.push(i);
        }  

        }
        return span;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int[] answer=solve(arr);

        System.out.println(answer);
    }
}
