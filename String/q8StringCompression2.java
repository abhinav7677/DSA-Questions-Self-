import java.util.Scanner;
public class q8StringCompression2 {

    public static String compression(String s){
        String s2=s.substring(0,1);
        int count=1;
        for(int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            if(curr==prev){
                count++;
            }
            else{
                if(count>1){
                    s2=s2+count;
                    count=1; //resseting count to 1
                }

                s2=s2+curr;

            }
        }
                if(count>1){
                s2=s2+count;
                //count=1;
                }
        return s2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Your String Before Compression "+s);
        System.out.println("Your String after compression "+compression(s));
    }    
}   
