class Calc {
    public Calc()
    {
        System.out.println("calcs");
    }
    public Calc(int i){
        System.out.println("In Calcs Parametere");
    }
}
class Caladv extends Calc{
    public Caladv()
    {
        System.out.println("in ccaladv");
    }
    public Caladv(int i){
       // super(i);//by super (i) it will call the paramteritize of super class
        System.out.println("In Calad Parametere");
    }
}


public class Demo1 {
    public static void main(String args[]) {
        Caladv obj1=new Caladv(5);//by default the 0    
    }
}
