class Book{
     private String title;
    int price;
     Book(String title, int price){
        this.title=title;
        this.price=price;
     }
    public void setTitle(String title){
            this.title =title;
    }
    public String getTitle(){
        return this.title;
    }
    void showBook(){
        System.out.println("this book");
    }


}
class Main{
public static void main(String[] args) {
    Book Newbook = new Book("math",176);
    
   System.out.println( Newbook.getTitle());
    Newbook.showBook();
}
}