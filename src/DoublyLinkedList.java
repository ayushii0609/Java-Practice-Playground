import java.util.*;
public class DoublyLinkedList {
    class Node{
        int data;
        Node prev;
        Node next;
        public Node(int t){
            data=t;
            prev=null;
            next=null;
        }
    }
    Node head=null;

    void insertFirst(int t){
        Node New=new Node(t);
        if(New==null) System.out.println("Overflow");
        else if (head==null) {
            head=New;
        } else{
            New.next=head;
            head.prev=New;
            head=New;
        }
    }

    void insertLast(int t){
        Node New=new Node(t);
        if(New==null) System.out.println("Overflow");
        else if (head==null) {
            head=New;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=New;
            New.prev=temp;
        }
    }

    void insertPos(int t, int pos){
        Node New=new Node(t);
        if(New==null) System.out.println("Overflow");
        else if(head==null) head=New;
        else if(pos==1){
            New.next=head;
            head.prev=New;
            head=New;
        }
        else{
            Node temp=head;
            for (int i = 1; i <= pos-2 ; i++) {
                temp=temp.next;
                if(temp==null){
                    System.out.println("not possible");
                    return;
                }
            }
            New.next=temp.next;
            temp.next.prev=New.next;
            temp.next=New;
            New.prev=temp;
        }
    }

    void deleteFirst(){
        if(head==null) System.out.println("Underflow");
        else if (head.next==null) {
            System.out.println(head.data+" deleted");
            head=null;
        }
        else{
            System.out.println(head.data+" deleted");
            head=head.next;
            head.prev=null;
        }
    }

    void deleteLast(){
        if(head==null) System.out.println("Underflow");
        else if (head.next==null) {
            System.out.println(head.data+" deleted");
            head=null;
        }
        else{
            Node temp=head;
            Node loc=head.next;
            while(loc.next!=null){
                temp=loc;
                loc=loc.next;
            }
            System.out.println(loc.data+" deleted");
            temp.next=null;
        }
    }

    void deletePos(int pos)
    {
        if(head==null) System.out.println("Underflow");
        else if(pos==1)
        {
            System.out.println(head.data+" deleted");
            head=head.next;
            if(head!=null) head.prev=null;
        }
        else
        {
            Node temp=head;
            Node loc=temp.next;
            for (int i = 1; i <=pos-2 ; i++) {
                temp=loc;
                loc=loc.next;
                if(loc==null)
                {
                    System.out.println("List is small");
                    return;
                }
            }
            System.out.println(loc.data+" deleted");
            temp.next=loc.next;
            if(loc.next!=null)
                loc.next.prev=temp.next;
        }
    }
    void display(){
        if(head==null) System.out.println("Empty");
        else{
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.println();
        }
    }
}
class DMainClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DoublyLinkedList l1=new DoublyLinkedList();
        while(true){
            System.out.println("Enter choice: 1 for insertBeg, 2 for insertLast, 3 for insertPos, 4 for deleteFirst, 5 for deleteLast, 6 for deletePos, 7 for display, 8 for Stop:");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.println("Enter value:");
                int t=sc.nextInt();
                l1.insertFirst(t);
            }
            if(ch==2){
                System.out.println("Enter value:");
                int t=sc.nextInt();
                l1.insertLast(t);
            }
            if(ch==3){
                System.out.println("Enter value and position:");
                int t=sc.nextInt();
                int pos=sc.nextInt();
                l1.insertPos(t,pos);
            }
            if(ch==4){
                l1.deleteFirst();
            }
            if(ch==5){
                l1.deleteLast();
            }
            if(ch==6){
                System.out.println("Enter position");
                int pos=sc.nextInt();
                l1.deletePos(pos);
            }
            if(ch==7){
                l1.display();
            }
            if(ch==8) break;
        }
    }
}
