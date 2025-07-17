import java.util.*;
public class CircularLinkedList {
    class Node
    {
        int data;
        Node next;
        public Node(int t)
        {
            data=t;
            next=null;
        }
    }
    Node last=null;

    void insertFirst(int t)
    {
        Node New=new Node(t);
        if(New==null) System.out.println("Overflow");
        else if(last==null)
        {
            last=New;
            last.next=last;
        }
        else
        {
            New.next=last.next;
            last.next=New;
        }
    }

    void insertLast(int t)
    {
        Node New=new Node(t);
        if(New==null) System.out.println("Overflow");
        else if(last==null)
        {
            last=New;
            last.next=last;
        }
        else
        {
            New.next=last.next;
            last.next=New;
            last=New;
        }
    }

    void insertPos(int t,int pos)
    {
        Node New=new Node(t);
        if(New==null) System.out.println("Overflow");
        else if(pos==1)
        {
            if(last==null)
            {
                 last=New;
                 last.next=last;
            }
            else
            {
                New.next=last.next;
                last.next=New;
            }
        }
        else
        {
            Node temp=last.next;
            for (int i =1 ; i <=pos-2; i++) {
                temp = temp.next;
                if (temp == last.next) {
                    System.out.println("List is small");
                    return;
                }
            }
            New.next=temp.next;
            temp.next=New;
            if(temp==last) last=New;
        }
    }

    void display()
    {
        if(last==null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node current =last.next;
            while(current!=last)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
            System.out.print(current.data+" ");
            System.out.println();
        }
    }

    void deleteFirst()
    {
        if(last==null) System.out.println("Underflow");
        else {
            System.out.println(last.next.data+" deleted");
            if(last.next==last) last=null;
            else last.next=last.next.next;
        }
    }

    void deleteLast()
    {
        if(last==null) System.out.println("Underflow");
        else
        {
            System.out.println(last.data+" deleted");
            if(last==last.next) last=null;
            else
            {
                Node temp=last.next;
                while(temp.next!=last)
                {
                    temp=temp.next;
                    temp.next=last.next;
                    last=temp;
                }
            }
        }
    }

    void deletePos(int pos)
    {
        if(last==null) System.out.println("Underflow");
        else if(pos==1)
        {
            System.out.println(last.next.data+" deleted");
            if(last.next==last) last=null;
            else last.next=last.next.next;
        }
        else
        {
            Node temp=last.next;
            Node loc=temp.next;
            for (int i = 1; i <=pos-2 ; i++) {
                temp=temp.next;
                loc=loc.next;
                if(loc==last.next)
                {
                    System.out.println("List is small");
                    return;
                }
            }
            System.out.println(loc.data+" deleted");
            temp.next=loc.next;
            if(loc==last) last=temp;
        }
    }
}
class CMain
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CircularLinkedList l1=new CircularLinkedList();
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
