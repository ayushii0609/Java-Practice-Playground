
class OddEvenLL{

    public static  void oddEvenLinkedList(Node head){
        Node temp=head;
        Node odd=new Node(-1);
        Node t1=odd;
        Node even=new Node(0);
        Node t2=even;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<count;i++){
            if(i%2!=0){
                t1.next=temp;
                t1=t1.next;
            }
            else{
                t2.next=temp;
                t2=t2.next;
            }
            temp=temp.next;
        }
        odd=odd.next;
        even=even.next;
        t2.next=null;   //to avoid case of cycle...
        t1.next=even;
        display(odd);
    //    return odd.data;
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
        oddEvenLinkedList(a);

    }
}