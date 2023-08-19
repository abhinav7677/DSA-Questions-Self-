import java.util.*;
public class Q7_Deque {
public static void main (String[] args){
    Deque<Integer> dq=new LinkedList<>();
    dq.addFirst(1);
    dq.addLast(2);
    System.out.println(dq);
    dq.removeLast();
    System.out.println(dq);
    dq.addFirst(0);
    dq.addLast(2);
    System.out.println(dq);
    dq.addFirst(10);
    dq.removeFirst();
    System.out.println(dq);
    System.out.println(dq.getFirst());
    System.out.println(dq.getLast());
}    
}
