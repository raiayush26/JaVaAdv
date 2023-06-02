public class max {
         
          public static void main(String[] args) {
                    int arr[] = {9,8,22,4,6};
                    int len =arr.length-1;
                    int start =arr[0];
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
