interface A{
    void mymethod1();
    void mymethod2();    
}
interface B extends A{
    void mymethod3();
}
class Myclassimplenents B {
    public void mymethod3(){
        System.out.println("I am in method3");
    }
    public void mymethod1(){
        System.out.println("I am in method 2");
        System.out.println("I am in method 2");
    }
}
