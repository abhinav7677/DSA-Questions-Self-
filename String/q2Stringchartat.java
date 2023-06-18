import java.util.Scanner;
public class q2Stringchartat {
public static void main(String[] args){
    String s="Abhinav";
    System.out.println("The predefined string for experiment is "+s);
    char ch=s.charAt(0); //Storing charater in char ch and putting index number in function of char at
    System.out.println("The character at entered index is "+ch);

    //taking user input for char at(n)

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter you number of index to find charAt()");
    int n=sc.nextInt();
    char ch2=s.charAt(n);
    System.out.println("The character at your entered index is "+ch2);
    
}    
}
