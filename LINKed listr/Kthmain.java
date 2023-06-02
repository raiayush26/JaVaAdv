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
                    System.out.print("Enter the elements of the array: ");  
                    for(int i=0; i<n; i++){
                              arr[i]=sc.nextInt();  
                    }  
                    for (int j=0; j<n; j++){  
                               System.out.print(arr[j]+" ");  
                    } 
          }
          static void checkMin(int arr[],int k ){
            
                    int start =arr[0];
                    int min=0;
                    int max = 0;
                    for (int i = 0; i < k+1; i++){
                        if(arr[i]>arr[i+1]){
                                  max=arr[i];
                        }else
                              max= arr[i+1];
                        if(arr[i]>arr[i+1]){
                                  min=arr[i+1];
                        }else
                         min =arr[i];
              }
                    
                System.out.println(" The Minimun is "+ min +" the maximum is "+ max);
                    
          }


          public static void main(String[] args) {
                    int n,k;  
                    Scanner sc=new Scanner(System.in);
                    System.out.print(" Enter the number of elements you want to store: ");  
                   
                    n=sc.nextInt();  
                    
                    //creates an array in the memory of length 10  
                    int[] arr= new int[10];  
                    userArray(arr,n);
                    System.out.print(" \nEnter the no where you have to find the minimum value: "); 
                    
                    k=sc.nextInt(); 
                    if (k==arr.length) {
                        System.out.println("Invaild input");
                    } else {
                        
                    }  

                   

                   
                    checkMin(arr,k);
                   


                    }
}
