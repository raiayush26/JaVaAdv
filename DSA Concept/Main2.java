
class Robot{
   static String Rname;
   static String Rcolour;
   static int Rweight;
    
     Robot(String n, String c, int w){
        this.Rname = n;
        this.Rcolour =c;
        this.Rweight =w;    
    }
    void intdroduceSelf(){
        System.out.println("My name is " + this.Rname);
    }
     void sitDown() {
        System.out.println("this is sit down");
    }
    public String getName(){
        return this.Rname;
    }
    public void SetWeight(int w){
        this.Rweight = w;
    }
    public int GetWeight(){
        return Rweight;
    }
    
}
class Person extends Robot{
    
    String name;
    String personality;
    boolean isSitting;
    Robot robotOwned;

   

    Person(String n,String p, boolean i){
        super( Rname,Rcolour,Rweight);
        this.name = n;
         this.personality = p;
         this.isSitting = i;

    }
    Robot newrobot =new Robot(name,personality, 100);
    public String nameGet(){
        return newrobot.Rcolour;
    }
    void sitDown(){
        this.isSitting =true;
    }
    void standUp(){
        this.isSitting =false;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Robot r1 = new Robot("tom", "RED", 30);
        Robot r2 = new Robot("jerry", "Blue", 20);
        System.out.println(r1.getName());
    //     r1.intdroduceSelf(); 
    //     r2.intdroduceSelf();
    //     Person p1 = new Person("Alice", "agreesive", false);
    //     Person p2 = new Person("Ayush", "normal", true);
    //    System.out.println( r1.getName());
    //     p1.standUp();
    //     System.out.println();        
       
    //     System.out.println("this is p1.r6.getName  "+  r1.getName());
    //     System.out.print("p2.robotOwned  "+p1.robotOwned.getName());
       
    //    p1.sitDown();
    //     System.out.println( p1.isSitting);
    //     p1.robotOwned.nameGet();
       

    
    }
}
