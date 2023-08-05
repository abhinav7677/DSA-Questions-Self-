public class Q8XpowN {
    public static int XpowerN(int x,int n){
        if(n==0){
            return 1;
        }
        int nm1= XpowerN(x, n-1);
        int res=x*nm1;
        return res;
    }
    public static void main(String[] args){
        System.out.println(XpowerN(2,4));
        
    }
}
