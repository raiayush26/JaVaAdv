public class LinkestList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next =null;

        }
    }

    public static Node head;
    public static Node  tail;
    public void addFirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newnode= new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next =newnode;
        tail=newnode;
    }
    public void addMiddle(int idx,int data){
        Node newNode= new Node(data);
        Node temp =head;
        int i=0;
        while(i<idx){
            temp=temp.next;
            i++;
        }
        newNode.next =temp.next;
        temp.next= newNode;
    }
    public void  printLL(){
        Node temp =head;
        while(temp!= null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    
    public static void main(String[] args) {
        LinkestList ll = new LinkestList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.printLL();
    }


}
