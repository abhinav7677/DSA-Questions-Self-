import java .util.Scanner;
import java.util.Stack;
public class Q2DuplicateBrackers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println("Dulicates Present");
                    return;
                }
                else{
                    while( st.peek()!='('){
                        st.pop(); //To remove element
                    }
                st.pop(); // To remove the closing bracket
                }
            }
            else{
                st.push(ch);
            }
            
            
        }
        
        System.out.println("Duplicates Absent");
    
    }
}
