public class Q4Fact {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int factNm1=fact(n-1);
        int sum=n*factNm1;
        return sum;
    }
    public static void main(String[] args){
        System.out.println(fact(5));
    }
}
