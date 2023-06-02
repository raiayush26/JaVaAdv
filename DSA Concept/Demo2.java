class A{
public void show(){
    System.out.println("In A show");
}
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}
class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}
public class Demo2 {
    public static void main(String[] args) {
    //     IDBI a = new IDBI();
    //    System.out.println( a.getRateOfInterset());
        A obj  = new A();
        obj.show();

        obj = new B();
        obj.show();
    }
}
