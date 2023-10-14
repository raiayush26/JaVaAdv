import java.util.*;;
public class Kthmain {
          static void printArray(int arr[],int size)
          {
                    for (int i = 0; i < size; i++)
                              System.out.print(arr[i] + " ");
                              System.out.println();
          }
          static void userArray(int arr[],int n)
          {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the elements of the array: ");  
                    for(int i=0; i<n; i++){
                              arr[i]=sc.nextInt();  
                    }  
                    for (int j=0; j<n; j++){  
                               System.out.print(arr[j]);  
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
                    System.out.println("minimum "+min);
          }

          public static void main(String[] args) {
                    int n,k;  
                    Scanner sc=new Scanner(System.in);
                    System.out.print("Enter the number of elements you want to store: ");  
                   
                    n=sc.nextInt();  
                    System.out.print("Enter the number of: ");  
                    k=sc.nextInt();  
                    //creates an array in the memory of length 10  
                    int[] arr= new int[10];  
                    userArray(arr,n);

                    int start =arr[0];
                    int min=0;
                    
                    System.out.println("value of k is:  "+k);
                    System.out.println("value of k is:  "+start);
                   
                    checkMin(arr,k);
                   


                    }
}
