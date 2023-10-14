// import java.sql.Array;
import java.util.Arrays;

class WordPalidrone{
    static boolean wordpalindrone(String x){
         int start=0;
         int end =x.length()-1;
         while (start<= end) {
            if ( x.charAt(start)== x.charAt(end)) {
                return true;
                
            } else 
                return false;
         }
         return false;
    }
    public static void main ( String [] args){
        String name= "ayuya";
        System.out.println(wordpalindrone(name));
      
        

       
      
        
        
    }
}