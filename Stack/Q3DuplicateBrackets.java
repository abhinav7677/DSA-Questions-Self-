import java.util.Scanner;
import java.util.Stack;


public class Q3DuplicateBrackets {
    public static boolean isBalanced(String expression){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == ')' || ch == '}' || ch == ']'){
                if (!stack.isEmpty()){
                    if (stack.peek() == '(' && ch == ')'){
                        stack.pop();
                    }
                    else if (stack.peek() == '{' && ch == '}'){
                        stack.pop();
                    }
                    else if (stack.peek() == '[' && ch == ']'){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            else if  (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
        }
        return stack.empty();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       String s="(a+b)+{(a+b)}";
       System.out.println(isBalanced((s)));
}
}
