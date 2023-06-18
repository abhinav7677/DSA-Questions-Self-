import java.util.Scanner;
public class Q3ToggleCase {

    public static String Solution(String str){
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            char ch=sb.charAt(i);
                if(ch>='a' && ch<='z'){
                    char lwctoupc= (char)('A'+ ch-'a');
                    sb.setCharAt(i,lwctoupc);
                }
                else if(ch>='A' && ch<='Z'){
                    char upctolwc=(char)('a'+ ch -'A');
                    sb.setCharAt(i,upctolwc);
                }
        }

        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String abc = Solution(str);
        System.out.println(abc);
    }
}
