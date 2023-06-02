import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)) {
            Double No= input.nextDouble();
            if (No %2 ==0){
                System.out.println("the no is even");
            }else{
                System.out.println("the no is Odd");
            }
           
        }
    }
}