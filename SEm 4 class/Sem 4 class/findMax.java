public class findMax {
    public static void main(String[] arg){
        int i=5;
        int j=10;
        int k=mymax(i,j);
        System.out.println("The maximux value is "+ k);
    }
    


public static int mymax(int n1 , int n2 ) {
    int result;
    if (n1>n2){
        result=n1;}
        
    else{
        result=n2;
        
    }
    return result;     
    
    
    }
}