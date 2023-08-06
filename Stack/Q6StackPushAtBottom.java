import java.util.*;
public class Q6StackPushAtBottom {
    public static void pushatbottom(Stack<Integer> S,int N){
        Stack<Integer> temp=new Stack<>();

        while(!S.empty()){
            temp.push(S.peek());
            S.pop();
        }
        S.push(N);
        while(!temp.empty()){
            S.push(temp.peek());
            temp.pop();
        }

    }

     public static void main(String[] args){
            Stack<Integer> S=new Stack<>();
            S.push(1);
            S.push(2);
            S.push(3);
            S.push(4);
            S.push(5);
            pushatbottom(S, 0);
            while (!S.empty()){
            System.out.println(S.peek() + " ");
            S.pop();
         }

    }
}
