import java.util.Scanner;
public class Q1StringBuildersBasics{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your string for String builder");
    String s=sc.nextLine();
    StringBuilder sb=new StringBuilder(s); //Declaring String Builder
    System.out.println("Your StringBuilder is "+s);
    
    //getting characters
    char ch=sb.charAt(0);
    System.out.println("Your character at index 0 is "+ch);

    //Setting characters
    sb.setCharAt(0,'X'); //always write in single inverted comma
    System.out.println("Your stringbuilder after setting X at 0 Index is "+sb);

    //inserting character
    sb.insert(1,'Y'); //always write in single inverted comma
    System.out.println("Your stringbuilder after inserting character at 1 index "+sb);

    //Deleting Character
    sb.deleteCharAt(1);
    System.out.println("Your Substring after delteing the inserted character "+sb);

    //Appending characters
    sb.append('Z');
    System.out.println("Your stringbuilder after appending Z "+sb);

    //Length at the end
    System.out.println("Your length of the updated stringbuilder is "+sb.length());
 }
}