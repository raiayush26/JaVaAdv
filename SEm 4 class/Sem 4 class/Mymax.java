public class Mymax {
    public static void main(String[] args){
        int i=15;
        int j=21;
       
       
        int k1=mymethod(i,j);        
        System.out.println("Max. value = "+k1);
        float f1=5.4f;
        float f2=3.5f;
        float k2=mymethod(f1, f2);
        System.out.println("Max. value = "+k2);
    }
    public static int mymethod(int n1,int n2) { // this method is called overloading method
        int k;
        if (n1>n2)
            k=n1;
        else
            k=n2;
        return k;        
    }
    public static float mymethod(float n1,float n2) {
        float k;
        if (n1>n2)
            k=n1;
        else
            k=n2;
        return k;        
    }    
}