import java.util.*;
public class LinkedList {   //always make the class name LinkedList in order to create object in the main
    public static class node{
        int data;
        node next;

        public node(int data){ //constructor for the node class
            this.data=data;
            this.next=null; 
        }
    }
    public static node head; //creating head
    public static node tail; //creating tail
    public static int size;

    public void addfirst(int data){  //adding first data
        node newnode= new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;  //java me values right se assign hota h
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){  //adding last data
       node newnode= new node(data);
        size++;
       if(head==null){
        newnode=head=tail;
       }
       tail.next=newnode;
       tail=newnode;
    }
    public void print(){  //Printing values
        if(head==null){
            System.out.print("LinkedList is empty"); //exception case for null handling
        }
        node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.println();
    }
    public void addmiddle(int index,int data){
        node newnode= new node(data);
        node temp=head;
        size++;
        int i=0;
        while(i != index-1){   //since we need break the link before the index.
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
        public void removefirst(){  //Code for removing the first node
            if(size==0){
                System.out.println("Linked List is Empty");
            }
            else if(size==1){
                head=tail=null;
                size=0;
            }
            else{
            head=head.next;
            size--;
            }
            
        }
        public void removelast(){ // code for removing the last node
             if(size==0){
                System.out.println("Linked List is Empty");
            }
            else if(size==1){
                head=tail=null;
                size=0;
            }
            else{ 
            int i=0;
            node temp=head;
            while(i<size-2){
                temp=temp.next;
                i++;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
        }

        public static int find(int data){
            node temp=head;
            int i=0;
            while(temp != null){
                if(temp.data==data){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }
        public void reverse(){    //For reversing Linked List
            node prev=null;;
            node curr=tail=head;
            node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        public void deletenodefromend(int num){
            node temp=head;
            int sz=0;
            while(temp!=null){
                temp=temp.next;
                sz++;
            }
            if(num==sz){
                head=head.next;
                return;
            }
            node prev=head;
            int i=1;
            while(i<sz-num){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;
        }
    public static void main (String[] args){   //main operations
        LinkedList ll=new LinkedList();
        node newnode=new node(3); 
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addlast(3);
        ll.print();
        ll.addlast(4);
        ll.print();
        ll.addlast(5);
        ll.print();
        System.out.println(ll.size);
        // ll.removefirst();
        // ll.print();
        // System.out.println(ll.size);
        // ll.removelast();
        // ll.print();
        // System.out.println(ll.size);
        System.out.println(ll.find(3));
        System.out.println(ll.find(10));
        ll.reverse();
        ll.print();
        ll.deletenodefromend(1);
        ll.print();

    }
}
