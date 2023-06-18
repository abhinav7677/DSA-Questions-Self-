import java.util.Scanner;
public class arrayreversal {

    static void reversearray(int[] arr){
        int i,j,k;
        i=0;
        j=arr.length-1;
        while(i<j){
            k=arr[i];
            arr[i]=arr[j];
            arr[j]=arr[k];

            i++;
            j--;
        
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Lemgth of array");
        int n=sc.nextInt();
        System.out.println("Enter the values");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before reversal");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Array after reversal");
        reversearray(arr);
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
}
