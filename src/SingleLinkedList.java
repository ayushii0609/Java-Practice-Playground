import java.util.*;
public class SingleLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int t) {
            data = t;
            next = null;
        }
    }

    Node head = null;

    void insertFirst(int t) {
        Node New = new Node(t);
        if (New == null) System.out.println("Overflow");
        else {
            New.next = head;
            head = New;
        }
    }

    void insertLast(int t) {
        Node New = new Node(t);
        if (New == null) System.out.println("Overflow");
        else if (head == null) head = New;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = New;
        }
    }

    void insertPos(int t, int pos) {
        Node New = new Node(t);
        if (New == null) System.out.println("Overflow");
        else if (pos == 1) {
            New.next = head;
            head = New;
        } else {
            Node temp = head;
            for (int i = 1; i <= pos - 2; i++) {
                temp = temp.next;
                if (temp == null) {
                    System.out.println("Not possible");
                    return;
                }
            }
            New.next = temp.next;
            temp.next = New;
        }
    }

    void display() {
        if (head == null) System.out.println("Empty");
        else {
            Node current = head;
            while (current.next != null) {
                System.out.print(current.data + "-->");
                current = current.next;
            }

            System.out.println(current.data);
        }
    }


    void deleteFirst() {
        if (head == null) System.out.println("Underflow");
        else {
            System.out.println(head.data + " deleted");
            head = head.next;
        }
    }

    void deleteLast() {
        if (head == null) System.out.println("Underflow");
        else if (head.next == null) {
            System.out.println(head.data + " deleted");
            head = head.next;
        } else {
            Node temp = head;
            Node loc = temp.next;
            while (loc.next != null) {
                temp = loc;
                loc = loc.next;
            }
            System.out.println(loc.data + " deleted");
            temp.next = null;
        }
    }

    void deletePos(int pos) {
        if (head == null) System.out.println("Underflow");
        else if (pos == 1) {
            System.out.println(head.data + " deleted");
            head = head.next;
        } else {
            Node temp = head;
            Node loc = temp.next;
            for (int i = 1; i <= pos - 2; i++) {
                temp = loc;
                loc = loc.next;
                if (loc == null) {
                    System.out.println("Not possible");
                    return;
                }
            }
            System.out.println(loc.data + " deleted");
            temp.next = loc.next;
        }
    }
}


class MainClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SingleLinkedList l1=new SingleLinkedList();
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

