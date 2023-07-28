import java.util.*;                                                //other operations in linkedlist 2
public class LinkedList2 {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }

        public static node head;
        public static node tail;
        public static int size;

        public void addfirst(int data){
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
                newnode.next=head;
                head=newnode;
        }

        public node findmid(node head){
            node slow=head;
            node fast=head;

            while(fast != null || fast.next!= null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        public boolean pallindrome(){
            if(head==null || head.next==null){
                return true;
            }
            node midnode=findmid(head);

            node curr=midnode;
            node prev=null;
            node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }

            node left=head;
            node right=prev;

            while(right != null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;  
            }
            return true;
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

        public static void main(String[] args){
            LinkedList ll2=new LinkedList();
            ll2.addfirst(10);
            ll2.addfirst(10);
            ll2.addfirst(10);
            ll2.addfirst(10);
            ll2.print();
            System.out.println(ll2.pallindrome());
        }

    }    
}
