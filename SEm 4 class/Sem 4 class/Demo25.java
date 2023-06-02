public class Demo25 {
    static void blocka(){
        try{
        System.out.println("Inside blocka");
        int a;
        a = 5/0;
        
       // }finally{
         System.out.println("End of block a");
        //}
    }
    public static void main(String[] args) {
        try {
            blocka();
           
            System.out.println("Inside th block");
            }
            catch (Exception e) {
            System.out.println("Exception found");
        }
        System.out.println("After catch block");
    }
}
    

