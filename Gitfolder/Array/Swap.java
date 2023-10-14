import java.util.*;

public class Swap {
          public static List<Object> rev(int x, int y) { // with arguments
                    int temp=0;
                    temp=x;//temp=4
                    x=y;//n1=5
                    y=temp;//n2=4
                    return Arrays.asList(x,y);
          }
          public static List<Object> rev2(int x, int y) { // with arguments
                    // without using 3 variable with bitwise operator
                    x=x^y;
                    y=x^y;
                    x=x^y;

                    return Arrays.asList(x,y);
          }
          public static List<Object> rev3(int x, int y) { // with arguments
                    // without using 3 variable with bitwise operator
                    x=x+y;
                    y=x-y;
                    x=x-y;

                    return Arrays.asList(x,y);
          }
         public static void main(String[] args) {
          int n1,n2;
          // n1=4;
          // n2=5;
          System.out.print("Enter two number:-  ");
          try (Scanner sc = new Scanner(System.in)) {
            n1=sc.nextInt(); 
              n2=sc.nextInt();
        }

          List <Object> rev =rev(n1,n2);
          List <Object> rev2 =rev2(n1,n2);
          List <Object> rev3 =rev3(n1,n2);
          System.out.println("[n1,n2] with 3 variable:- "+rev);
          System.out.println("[n1,n2] with bitwise operator:- "+rev2);
          System.out.println("[n1,n2] with subtration:- "+rev3);




         } 
}
