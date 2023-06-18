import java.util.Stack;

public class Q1StackBasics{
    public static void main(String[] args){
        Stack<Integer> st= new Stack<>();
        System.out.println(st); // printing stack
        st.push(10);
        System.out.println("Element on top is " +st.peek()+" Element of stacks are "+st); //printing and peeking
        st.push(20);
        st.push(30);
        System.out.println("Element on top is "+st.peek()+" Element of stacks are "+st);
        st.pop(); //removing top element
        System.out.println("Element on top is "+st.peek()+" Element of stacks are "+st);
    }
}