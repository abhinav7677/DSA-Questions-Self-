public class Q2_CircularQueueusingarray {
    public static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            front=-1;
            rear=-1;
        }
        public static boolean isEmpty(){
            if(front==-1 && rear== -1){
                return true;
            }
            else{
                return false;
            }
        }
        public static boolean isfull(){
            if((rear+1)%size==front){
                return true;
            }
            else{
                return false;
            }

        }
        public static void add(int n){
            if(isfull()){
                System.out.println("Circular Queue is Full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=n;
        }

          public static int remove(){
            if(isEmpty()){
                System.out.println("Circular Queue is already empty");
                return -1;
            }

            int removedelement=arr[front];

            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            
            return removedelement;

        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }

        // public static void print(){
        //     for(int i=0;i<=rear;i++){
        //         System.out.print(" " + arr[i]);
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[] args){
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
    while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
     }
}
