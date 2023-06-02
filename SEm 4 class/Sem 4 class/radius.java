import java.util.Scanner;
public class radius {
     public static void main (String[] args){
    try (Scanner input = new Scanner(System.in)) {
        Double r= input.nextDouble();
        if (r<0) {
            System.out.println("Area cannot be negative");
            } else {
            double Area =3.14*r*r;
            System.out.println(Area);

            
        }
    }
     
}

    
    
}
