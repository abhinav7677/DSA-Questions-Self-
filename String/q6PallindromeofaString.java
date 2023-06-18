import java.util.Scanner;
public class q6PallindromeofaString {

    public static boolean pallindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);

            if(ch1!=ch2){ //write flase condition first then true condtion 
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string to check pallindrome for the substring");
        String s=sc.nextLine();

        for(int i=0;i<s.length();i++){
            for(int j=i+1; j<=s.length();j++){
                String ss=s.substring(i,j);
                if(pallindrome(ss)==true){
                    System.out.println(ss);
                }
            }
        }

    }
}
