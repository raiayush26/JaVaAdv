// Exception class handing

public class Demo24 {
  public static void main(String[] args) {
      try {
          int ar []=new int [3];
          ar[10]=30/0;
          try {
              int inar[]=new int[3];
              inar[1]=30/0;
          } catch(ArithmeticException ex){
            System.out.println("Arithmetic Exception occor");
          }
      } 
      catch (ArrayIndexOutOfBoundsException ex) {
          System.out.println("Arithmetic Exception Occur");
      } 
      System.out.println("Exception cout");
  }  
}
