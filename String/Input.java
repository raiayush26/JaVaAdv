import java.util.*; 
public class Input {
    public static void main(String[] args)  
{  
    int n;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the number of elements you want to store: ");  
        //reading the number of elements from the that we want to enter  
        n=sc.nextInt();  
        //creates an array in the memory of length 10  
        String[] array = new String[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        array[i]=sc.next();  
        }  
        System.out.println("Array elements are: ");  
        // accessing array elements using the for loop  
        for (int i=0; i<n; i++)   
        {  
        System.out.println(array[i]);            
}
    }  
}
}

