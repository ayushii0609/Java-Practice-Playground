public class BAsicsLL{
    //display using recursion
    public static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }

    //dispay reverse
    public static void displayreverse(Node head)
    {
        if(head==null) return;
        displayreverse(head.next);
        System.out.print(head.data+" ");
    }

    //iterative method to find length of linkedlist
    public static int length(Node head)
    {
        int count=0;
        if(head==null) return 0;
        else {
            Node current=head;
            while(current!=null){
                count++;
                current=current.next;
            }
        }
        return count;
    }


    //getting element at any index
/**    int getElement(int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.data;

    }
}*/

    public static class Node{
        int data;
        Node next;
        Node(int t){
            this.data=t;
        }

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(50);
        Node c = new Node(51);
        Node d = new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        displayr(a);
        System.out.println();
        displayreverse(a);
        System.out.println();
        System.out.println("Length : "+length(a));
     //   System.out.println("Element : "+getElement(a));
    }
}
