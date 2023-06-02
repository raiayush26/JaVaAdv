import  java.util.*;

public class MyFirst {
    public static void main(String [] args){
        try (Scanner area = new Scanner(System.in)) {
            double r =area.nextInt();double Area =r *r*3.14;System.out.println("Area of circle is " + Area);
        }
        
        
    }
}