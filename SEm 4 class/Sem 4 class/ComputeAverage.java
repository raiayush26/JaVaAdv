import java.util.Scanner;
public class ComputeAverage{
    public static void main (String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter 3 number");
        Double n1= sc.nextDouble();
        Double n2= sc.nextDouble();
        Double n3= sc.nextDouble();
        Double avg= (n1+n2+n3)/3;
        System.out.println(avg);
    }
    }
}