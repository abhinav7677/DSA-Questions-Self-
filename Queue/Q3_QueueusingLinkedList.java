public class Q3_QueueusingLinkedList {
    public static class node{
        int n;
        node next;
        node(int n){
            this.n=n;
            this.next=null;
        }
    }
    public static class Queue{
        static node head=null;
        static node tail=null;

        public static boolean isEmpty(){
            if(head==null && tail==null){
                return true;
            }
            else{
                return false;
            }
        }

        public static void add(int n){
            node newnode=new node(n);
            if(isEmpty()){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }   
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=head.n;
            if(head==tail){
                head=tail=null;
                return front;
            }else{
                head=head.next;
            }
             return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            else{
                return head.n;
            }
        }
    }
    public static void main(String[] args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
            System.out.println(q.remove());
            // q.remove();
        }
    }
}
