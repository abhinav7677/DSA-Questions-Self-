public class Q3SumofN {
    public static int sumN(int n){
        if(n==1){
            return 1;
        }
        int sumNm1=sumN(n-1);
        int sum=n+sumNm1;
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumN(5));
    }
}
