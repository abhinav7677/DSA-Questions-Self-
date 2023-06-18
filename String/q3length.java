import java.util.Scanner;
public class q3length {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String s=sc.nextLine();
        System.out.println("The length of the string is "+s.length() ); // s.length also counts space as 1 character
    }
}
