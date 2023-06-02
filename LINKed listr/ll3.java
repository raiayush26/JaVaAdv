class ll3{
    static Node head;
    class Node{
        String Data;
        Node  next;
        Node(String Data){
            this.Data = Data;
            this.next = null;
        }
    } 


public void addFirst( String Data){
    Node newNode = new Node(Data);   // creating  new Node  
    if(head ==null ){
          head =newNode; 
        // checkingthe head is null or not
        }
    else{
        newNode.next =head; 
        head= newNode;
    }
} 
public void addLast(String Data){
    Node newNode = new Node(Data);
    if(head ==null ){
          head =newNode;
          return ;
    }
    Node currNode = head;
    while(currNode.next!= null){
        currNode =currNode.next;
    }
}
public void printList(){
    Node temp = head ;
    while(temp!= null){
        System.out.println(temp.Data);
        temp = temp.next;
    } 
}
public  void deleteFirst(){
   
    if(head ==null ){
         System.out.println("List is emplty");
    }
    else{
       head = head.next;
    }
}
public void insertNodeBetween(Node prevNode, String Data) {
    if (prevNode == null) {
        System.out.println("Previous node cannot be null");
    }
    
    Node newNode = new Node(Data);

    newNode.next = prevNode.next;

    prevNode.next = newNode;
}
public void deleteLast(){
    if(head ==null ){
        System.out.println("List is emplty");
        return;
   }if (head.next ==null) {
        head= null;
        return;
   }
   Node secondLast = head;
   Node lastNode = head.next;
   while (lastNode.next!= null){
        lastNode =lastNode.next;
        secondLast=secondLast.next;    
}
secondLast.next =null;
}
public static void main(String[] args) {
    ll3  a =new ll3();
    a.addFirst("c");
    a.addFirst("b");
    a.addFirst("a");
    a.printList();
    System.out.println("delete the list");
    a.deleteLast();
    a.printList();
    a.addFirst("b");
    a.addLast("a");
    a.insertNodeBetween(a, "d");
}
}