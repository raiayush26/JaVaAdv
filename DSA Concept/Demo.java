//  this is Construstion
class Calculator{
    int c;
    public Calculator (int a,int b) {
        c = a+b;        
    }   
    public Calculator (int a,int b, int d) {
        c = a+b+d;        
    } 

} 

public class Demo{
    public static void main(String[] args) {
        int num =  1;
        int num2 = 2;
        int num3 = 5;
        Calculator ad = new Calculator(num, num2);
        Calculator ad2 = new Calculator(num, num2,num3);
       
        System.out.println( ad.c);
        System.out.println(":-"+ ad2.c);

}

}