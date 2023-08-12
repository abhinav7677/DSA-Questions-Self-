public class Q1_Queueusingarray {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        public static boolean isEmpty(){
            if(rear==-1){
                return true;
            }
            else{
                return false;
            }
        }

        public static void add(int n){
            if(rear==size-1){
            System.out.println("Queue is Full");
            return;
            }

            rear=rear+1;
            arr[rear]=n;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            int front=arr[0];
            for(int i=0; i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[0];
        }
        public static void print(){
            for(int i=0;i<=rear;i++){
                System.out.print(" "+ arr[i]);
            }
            System.out.println();
        }
            public static void main(String[] args){
                Queue q=new Queue(5);
                q.add(1);
                q.add(2);
                q.add(3);
                print();
                q.remove();
                print();
                System.out.print(q.peek());
                

            }
    }
}
