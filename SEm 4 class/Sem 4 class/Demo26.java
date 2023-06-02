/**
 * Demo26
 */
class MyExeption extends Exception{
    private int datails;
    MyExeption(int a){
        datails =a;
    }
    public String toString() {
        return "MyExeption [ "+ datails+ "]";
        
    }
}
public class Demo26 {
    static void compute(int a) throws MyExeption{
     System.out.println(a);
     if (a>10)
         throw new MyExeption(a);
         System.out.println("normal Exit");
     
    }
    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);

        }catch(MyExeption ex){
            System.out.println("caught My exception ");
        }
        
    }

    
}