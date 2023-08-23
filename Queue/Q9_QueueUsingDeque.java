import java.util.*;
public class Q9_QueueUsingDeque {
    static class Queue{
        Deque<Integer> dq=new LinkedList<>(); 
        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }
    }
public static void main(String[] args){ //Basic implemention
    Queue q=new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println(q.peek());
    System.out.println(q.remove());
    System.out.println(q.peek());
    q.add(10);
    System.out.println(q.peek());
    }
}

