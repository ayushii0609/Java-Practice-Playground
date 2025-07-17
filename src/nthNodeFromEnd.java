
public class nthNodeFromEnd {
/*    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n + 1;
        //mth node from starting
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
*/
    //In single traversal
/*    public static Node nthNodeEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }*/


    //remove nth node from end in single traversal
    public static Node removenthNodeFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static void display(Node head) {
        if (head == null) System.out.println("Empty");
        else {
            Node current = head;
            while (current.next != null) {
                System.out.print(current.data + "-->");
                current = current.next;
            }

            System.out.println(current.data);
        }
        System.out.println();
    }


    public static class Node {
        Node next;
        int data;

        Node(int t) {
            this.data = t;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(50);
        Node c = new Node(51);
        Node d = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
    //    System.out.println(nthNode(a,3).data);
    //    System.out.println(nthNodeEnd(a,3).data);
        display(a);
        display(removenthNodeFromEnd(a,4));
    }
}
