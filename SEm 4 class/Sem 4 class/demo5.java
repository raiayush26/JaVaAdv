interface A1{ // Inecapculatuion
    void mymethod();
   void yourmethod();
}//Abstract methods do not specify a body
class B1 implements A1{
    public void mymethod(){
        System.out.println("In Mymethod of b1");
    }

    public void yourmethod(){
        System.out.println("In yourmethod of b1");
    }    
}
public class demo5{
    public static void main(String args[]) {
        B1 obj =new B1();
        obj.mymethod();
        
    }

    public void mymethod() {
        System.out.println("in mymethod of N2 ");
    }
}