import java.util.*;
public class ReturnTypeTest2 {
   public int add(int x, int y) { // with arguments
      int z = x+y;
      return z;
   }
   public static void main(String args[]) {
      try (Scanner sc = new Scanner(System.in)) {
         int x,y;
         System.out.println("Enter the  2 Number "); 
         x=sc.nextInt();  
         y=sc.nextInt();  
         ReturnTypeTest2 test = new ReturnTypeTest2();
         int add = test.add(x, y);
         System.out.println("The sum of x and y is: " + add);
      }
   }
}