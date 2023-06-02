public class demo10 {
    public static void mymethod(String [] s) {
        for (int i = 0; i<s.length;i++) 
            System.out.println(s[i]);            
        }
        public static void main(String [] args) {
            demo10 obj1= new demo10();
            String [] capital = {"Bhopal","Bhubneswar","Kolkata"};
            obj1.mymethod(capital);
            // Integer [] numbers={10,20,30,40};
            // obj1.mymethod(numbers);
        
    }
}
