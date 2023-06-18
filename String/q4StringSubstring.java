import java.util.Scanner;
public class q4StringSubstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String more than 6 charachers");
        String s=sc.nextLine();
        System.out.println(s.substring(0,2)+"  From 0 to 2");
        System.out.println(s.substring(1,1)+"  From 1 to 1");
        System.out.println(s.substring(1,2)+"  From 1 to 2");
        System.out.println(s.substring(2,5)+"  From 2 to 5");
        System.out.println(s.substring(3)+"  From 3 only"); // prints till last character
    }
}
