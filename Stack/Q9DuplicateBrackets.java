import java.util.*;
public class Q9DuplicateBrackets {

    public static boolean checkduplicate(String s){
        Stack<Character> st=new Stack<>();
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch==')'||ch=='}'|| ch==']'){
                if(st.isEmpty()){
                    return false;
                }
                else{
                    int count=0;
                    while(!st.isEmpty() && (ch==')'&& st.peek()!='(' || ch=='}' && st.peek()!= '{' || ch==']' && st.peek() != '[')){
                    st.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    st.pop();
                }
            }
            }
            else{
                st.push(ch);
            }

        }
        return false;
        
    }
    public static void main(String[] args){
        String s="((a+b)+(a+b))";
        System.out.println(checkduplicate(s));
    }
}

