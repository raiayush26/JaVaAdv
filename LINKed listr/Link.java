class Link{
    static class  Node{
        String data;
        Node  next;
        
        Node( String data){
            this.data =data;
            this.next = null;
        }
    }
    Node head = null;
     
    public void Inserstfirst(String data){
        
        Node  newnode = new Node(data);
       
        if (head== null) {
            head = newnode;            
        }else{
            newnode.next =head;
            head = newnode;
        }
    }
    public void printArray(){
        Node temp = head;
         while(temp!= null){
            System.out.println(temp.data);
            temp=temp.next;
         }
    }
    public static void main(String[] args) {
        Link  a =  new Link();
        a.Inserstfirst("6");
        a.Inserstfirst("7");
        a.printArray();
    }
}