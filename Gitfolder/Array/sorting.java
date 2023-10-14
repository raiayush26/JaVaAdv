import java.util.Arrays;
  
public class sorting {
       static int BinarySearh (int[] arr){
              int  target = 34;
              int high=arr.length-1;
              int low =0;
              int mid;
              // System.out.println(high);
              // System.out.println(low);
              while (low<=high){
                     mid=(low+high)/2;
                     if (target == arr[mid]) 
                            return mid;
                     else if (arr[mid]<target) 
                            low = mid+1;                                                              
                     else 
                            low = mid-1;                            
                           
              }   
              
              return -1;

             
       }
          public static void main(String[] args) {
                 int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65}; 
                 int[] newarray = new int[12];
                    System.out.println("old array"+Arrays.toString(arr)); 
                   
                    int temp;
                    for (int i = 0; i < arr.length; i++) {
                           for (int j = i+1; j < arr.length; j++) {
                                        if(arr[i]>arr[j]){
                                                  temp=arr[i];
                                                  arr[i] = arr[j];  
                                                  arr[j] = temp; 
                                        };
                           }
                     //  System.out.print(arr[i]);
                      int j =0;
                           for(int k = 0; k < newarray.length; k++){
                                   newarray[k] = arr[j] ;
                                   j++;
                           }
                    }
                    System.out.println(Arrays.toString(newarray));
                    System.out.println(BinarySearh(newarray));
                  
          }
}