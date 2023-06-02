interface Test{
    public void m1();
}
public class demo19 {
   public static void main(String[] args) {
       Test obj = () ->{
        System.out.println("hello Vit");
       };
       obj.m1();
   }
        
    }