//final class A{ 
 class A{ 
  //final  void mymethod(){// using word "final" we prevent the method overriding
  void mymethod(){
        System.out.println(" In method of class A");
    }
}
class B extends A{ //The type B cannot subclass the final class A thus we can prevent the Inheritance
    void mymethod(){
        System.out.println(" In method of class B");
    }
}

public class demo4 {
    public static void main (String args[]){
    A obj1=new A();
        obj1.mymethod();
}
}