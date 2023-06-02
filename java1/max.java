public class max {
          static void printArray(int arr[],int size)
          {
                    for (int i = 0; i < size; i++){
                              if (arr[i]>arr[i+1]){

                              }

                    }
                              // System.out.print(arr[i] + " ");
                              // System.out.println();
          }
          public static void main(String[] args) {
                    int arr[] = {11, 22, 33, 4, 55, 66};
                    int temp;
                    int len =arr.length;
                    int start =arr[0];
                    int next =arr[1];
                    int end =arr.length+1;
                    int max=0;
                    int min=0;
                    for (int i = 0; i < len; i++){
                              if(start<arr[i]){
                                        max=arr[i];
                              }
                              if(start>arr[i]){
                                        min=arr[i];
                              }
                    }
                    System.out.println(max);
                    System.out.println(min);
                    
          }
}
