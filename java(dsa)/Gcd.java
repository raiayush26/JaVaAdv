import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int a= sc.nextInt(); 
        int b= sc.nextInt();
        int oringalnumber=a;
        int oringalnumber2=b;
    
        if (a>b) {
            
            while (b>0){
                int q=a/b;
                int r=a%b;
                a=b;
                b=r;   
            }
            System.out.println("GCF of two Number "+oringalnumber+" and "+oringalnumber2+"is "+a);
        }else{
            while (a>0){
            int q=b/a;
            int r=b%a;
            b=a;
            a=r;

           
            }  
            System.out.println("GCF of two Number "+oringalnumber+" and "+oringalnumber2+"is  "+a);  
        }

        

            
      
    }
}
