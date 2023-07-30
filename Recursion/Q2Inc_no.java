public class Q2Inc_no {
    public static void increasing(int n){
        if(n==0){
            System.out.println(0);
            return;
        }
            increasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        increasing(6);
    }
}
