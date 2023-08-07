import java.util.*;
public class Q7ReverseString {
    public static void ReverseString(Stack<Character> S){
        Stack<Character> temp=new Stack<>();

        while(!S.empty()){
            temp.push(S.peek());
            S.pop();
        }
        while(!temp.empty()){
            System.out.println(temp.peek());
            temp.pop();
        }
    }
    public static void main(String[] args){
        Stack<Character> S=new Stack<>();
        S.push('A');
        S.push('B');
        S.push('H');
        S.push('I');
        S.push('N');
        S.push('A');
        S.push('V');
        
        ReverseString(S);

        // while (!S.empty()){
        //     System.out.println(S.peek() + " ");
        //     S.pop();
        // }
        
    }
}
