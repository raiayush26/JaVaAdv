// import java.util.*; 
public class string {
    public static void main(String[] args) {
    // Declaring and initializing a string
    String str =
      "Using Using the split() method to convert a string to array in Java";
    
    // Declaring an empty string array
    String[] arr = null;
    // Scanner sc= new Scanner(System.in);
    String a= "Using";  
    
    arr = str.split(" ");
        int count =0;
    // Printing the converted string array
    for (int i = 0; i < arr.length; i++) {
    
      if(arr[i]==a){
        count=count+1; 
        System.out.println(count);

        

      }

      
    }
   
    System.out.println(arr[0]);
    System.out.println(a);
  }
}
