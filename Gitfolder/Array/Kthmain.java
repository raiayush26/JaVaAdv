import java.util.*;;
public class Kthmain {
          
          static void userArray(int arr[],int n)
          {
                    try (Scanner sc = new Scanner(System.in)) {
                        System.out.println("Enter the elements of the array: ");  
                        for(int i=0; i<n; i++){
                                  arr[i]=sc.nextInt();  
                        }  
                        // for (int j=0; j<n; j++){  
                        //         //    System.out.print(arr[j]);  
                        // } 
                    }
          }
          static void checkMin(int arr[],int k ){
                    int start =arr[0];
                    int min=0;
                    for(int i=0;i<k;i++){
                              if(start>arr[i]){
                                        min=arr[i];
                              }else{
                                        min=start;
                              }
                             
                    }
                    System.out.println("The minimum value of array in  "+ k +"rd  place is :- "+min);
          }

          public static void main(String[] args) {
                    int n,k;  
                    try (Scanner sc = new Scanner(System.in)) {
                        System.out.print("Enter the no of element in array ");  
                         //    n is storing the no of element in array
                        n=sc.nextInt(); 

                        //creates an array in the memory of length 10  
                        int[] arr= new int[10]; 
                        // calling the function userArray
                        userArray(arr,n);
                        System.out.println("Enter the element where minimum element is present in kth main");

                        k=sc.nextInt();   
                        
                        checkMin(arr,k);
                    }
                   


                    }
}
