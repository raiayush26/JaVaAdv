class Cirular {
        class Node{
            String data;
            Node next;
            Node prev;
        Node(String data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }   
            
    }
    static Node head;
public void  InsertAtFirst(String Data){
    Node  newNode = new Node(Data);
    if (head != null) {
        head.prev = newNode;
    }
    newNode.next = head;
    newNode.prev = null;
    
    head = newNode;

}
public void display(){
    Node node = head;
    while (node != null){
        System.out.println(node.data);
       node=node.next; 

    }


}    
public static void main(String[] args) {
    Cirular  ll = new Cirular();
    ll.InsertAtFirst("a");
    ll.InsertAtFirst("a");
    ll.display();
}
    
}
