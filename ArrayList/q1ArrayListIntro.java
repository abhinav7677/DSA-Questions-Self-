import java.util.ArrayList;
import java.util.Scanner;
 public class q1ArrayListIntro{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<Integer> A1=new ArrayList<>();
        for(int i=0; i<n;i++){
            A1.add(sc.nextInt());      //Taking input in loop
        }            
        System.out.println(A1); //Printing list

        A1.add(0,0);   //Adding a value at 0 index.
        System.out.println(A1);
        System.out.println(A1.size());   //printing size of the list

        for(int i=0;i<n;i++){
            System.out.print(A1.get(i));    //Printing updating values from loop
        }
    }
 }