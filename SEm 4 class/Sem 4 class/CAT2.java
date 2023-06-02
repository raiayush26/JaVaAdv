//Name:-Ayush
//Reg:-20BCE10938
interface GCD{
    void WinterSemGCD(); 
}      

public class CAT2 {
    public static void main(String [] args) {
        GCD obj1 = new GCD()//B is refrecence of class A
        //obj1.WinterSemGCD();
        {
            public void WinterSemGCD() 
            {
                int x = 12, y = 8, gcd = 1;  
                 
                for(int i = 1; i <= x && i <= y; i++)  
                {  
                
                if(x%i==0 && y%i==0)  
                
                gcd = i;  
                }  
               
                System.out.printf("GCD of %d and %d is: %d", x, y, gcd);   
            }
        };
        obj1.WinterSemGCD();
    }
}