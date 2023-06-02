interface A{
    void mymethod1(int a);
}
public class demo8 {
    public static void main(String [] args) {
        A obj1;
        obj1= (i) ->System.out.println("I am in mymethod1: "+ i );
        
        obj1.mymethod1(6);
    }
}  