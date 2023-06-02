import java.util.ArrayList;
import java.util.List;

public class Demo17 {
     public static void main(String[] args) {
         List <String> name=new ArrayList <String>();
         name.add("suresh");
         name.add("Mahesh");
         name.add("Rakesh");
        name.forEach(n-> System.out.println(n));
    
        
    }
    
}