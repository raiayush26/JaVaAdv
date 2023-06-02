public class Largest {
          public static void main(String[] args) {
                    int arr[] ={1,2,3,4};
                    int sum =0;
                    for(int i=0; i<arr.length-1;i++){
                             sum= arr[i]+arr[i+1];
                             sum=sum+sum;

                    }
                    System.out.println(sum+1);
          }
}
