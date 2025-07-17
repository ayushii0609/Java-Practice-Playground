
class OddEvenDigitsLL{

    public static  void oddEvenLL(Node head){
        Node temp=head;
        while(temp!=null){
            if(temp.data%2!=0){
                Node odd=temp;
            }
            else{
                Node even=temp;
            }

        }
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

    public static class Node{
        int data;
        Node next;
        Node(int t){
            data=t;
            next=null;
        }
    }

    public static void main(String[] args){
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(2);
        Node d=new Node(1);
        Node e=new Node(9);
        Node f=new Node(15);
        Node g=new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        oddEvenLL(a);

    }
}
