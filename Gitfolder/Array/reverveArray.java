public class reverveArray {
          static void printArray(int arr[],int size)
          {
                    for (int i = 0; i < size; i++)
                              System.out.print(arr[i] + " ");
                              System.out.println();
          }
          public static void main(String[] args) {
                    int arr[] = {1, 2, 3, 4, 5, 6};
                    System.out.println( arr[0]);
                    int temp ;
                    int start= 0;
                    int len =arr.length;
                    System.out.println(len);
                    int end= 5;
                    while (start<end) {
                              temp = arr[start];
                              arr[start] = arr[end];
                              arr[end] = temp;
                              start++;
                              end--;
                              
                    }
                    printArray(arr, 6);
                    

                    
                   
                    // for (int i = 0; i < arr.length; i++) {
                              
                    // }
          }
}
