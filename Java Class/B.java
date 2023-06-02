// Interhetient
class Book{

    String Title ;
    String author;
    public void display(){
        System.out.println("Display Book");
    }
    //  Contrustot
    Book( String a,String b){
        this.Title =a;
        this.author =b;
    }

}
class Stundent {
    String name;
    String  email;
    public void  Readdata(){
        System.out.println("read  books");
    }
    Stundent(String c, String d){
        this.name= c;
        this.email =d;
    }
    Book b = new Book("Math","Rs Argwal");//  instrace of Book object 
    public void display2(){
        System.out.println(this.name+" read "+b.author);
    }
}
 class EngStundent extends Stundent{
    String Branch;
    public void display3(){
        System.out.println("branch name");
    }
    EngStundent(String a, String b, String c){
        super(a, b);
        this.Branch =c;
    }
    
 }
 class ArtsStundend extends Stundent{
    String subject;
    public void display4(){
        System.out.println("Art Student");
    }
    ArtsStundend(String a, String b ,String c){
        super(a, b);
        this.subject = c;
    }
 }
 


class B {
    public static void main(String[] args) {
        Stundent a = new Stundent("AYush", "books");
        a.display2();
        EngStundent b = new EngStundent("Ayush","rai","ravi");
        b.display3();
        ArtsStundend c = new ArtsStundend("Ayush","rai","ravi");
        c.display4();
    }
}
