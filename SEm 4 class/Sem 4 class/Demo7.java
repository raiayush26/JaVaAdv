interface A{
    void mymethod1(); 
}      
/*}
class B implements A{
    public void mymethod1()
    {
        System.out.println("I am inn mymethod 1");
    }
}*/
public class Demo7 {
    public static void main(String [] args) {
        A obj1 = new A()//B is refrecence of class A
        //obj1.mymethod1();
        {
            public void mymethod1() 
            {
                System.out.println("I am in mymethod");   
            }
        };
        obj1.mymethod1();
    }
}