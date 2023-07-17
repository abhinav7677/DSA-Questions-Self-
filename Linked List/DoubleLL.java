import java.util.*;
public class DoubleLL {
    public class node{ //creating node for double linked list.
    int data;
    node next;
    node prev;

    public node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
  
}  
public static node head;
public static node tail;
public static int size;  

public void addfirst(int data){
    node newnode=new node(data);
    size++;
    if(head==null){
        head=tail=newnode;
        return;
    }
    newnode.next=head;
    head.prev=newnode;
    head=newnode;
}
public void print(){
    node temp=head;
    while(temp!=null){
        System.out.print(" "+temp.data);
        temp=temp.next;
    }
    System.out.println();
}
public void removefirst(){
    if(head==null){
        System.out.println("DLL is empty");
    }
    else if(head==tail){
        head.next=null;
        head.prev=null;
        size--;
    }
    else{
        head=head.next;
    head.prev=null;
    size--;
    }
}
public static void main(String[] args){
    DoubleLL dll=new DoubleLL();
    dll.addfirst(10);
    dll.addfirst(20);
    dll.addfirst(30);
    dll.addfirst(40);
    dll.print();
    dll.removefirst();
    dll.print();
}

}
