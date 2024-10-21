/**
 * Short
 */
public class Short {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 10;
        
         int c= a++;
         int d= ++a;
         a= 10;
         int g= +a;
         int h = +b;
        
            int e= a--;
            int f= --a;
        System.out.println("a = "+a);
        System.out.println("a++ = "+c);
        System.out.println("a+ = "+g);
        System.out.println("b+ = "+h);
        System.out.println("++a = "+d); 
        System.out.println("a-- = "+e);
        System.out.println("--a = "+f);

    }
}