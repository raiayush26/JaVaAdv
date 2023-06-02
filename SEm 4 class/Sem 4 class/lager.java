import java.util.Scanner;
public class lager {
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)) {
            Double No1= input.nextDouble();
            Double No2= input.nextDouble();
            if (No1>No2){
                System.out.println("No1 is greter than No2");
            }else{
                System.out.println("No2 is getear than No1");
            }
           
        }
    }   
}
