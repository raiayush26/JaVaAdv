interface Test{
    public void m1();
}
public class Demo18 {
    public static void m2() {
        System.out.println("hello Vit");
    }
    public static void main(String[] args) {//refrecers to m2 method 
        Test obj=Demo18::m2;
        obj.m1(); //this object is calling the m2 methosd

    }
}