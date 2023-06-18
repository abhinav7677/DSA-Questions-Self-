import java.util.Scanner;
public class q7StringCompression {

    public static String compression(String s){
        String s2=s.substring(0,1);
        
        for(int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
        if( curr!= prev){
            s2=s2+curr;
        }
        }
        return s2;
 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); //Enter input like AAAABBBCDDDCCCDC
        System.out.println("Your String before Compression "+ s);
        System.out.println("Your String after compression "+compression(s));
       }
}
