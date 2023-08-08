import java.util.*;
public class Q8EqualBracketspactice {
    public static boolean checkbracket(String s){
        Stack<Character> st=new Stack<>();
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(ch==')' && st.peek()=='(' || ch== '}' && st.peek()=='{' || ch==']' && st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        String s=")(){}[]";
        System.out.println(checkbracket(s));
    }
}
