public class Sum {
    public static int getSumUsingResucion(int []arr, int n){
        // base case
        if(n==0){return 0;}
        if(n==1){return arr[0];}
        int sum = arr[0]+ getSumUsingResucion(arr, n+1);      
        return sum;
    }
       
    public static int getSumUsingIration(int [] arr,int n){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];            
        }
        return sum;
    }
    public static void getSumby(int []array){
       // int[] array = {1, 2, 3, 4, 5};
        int sum = 0;  // Initialize the sum to 0.

        // Iterate through the array and add each element to the sum.
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("The sum of the elements in the array is: " + sum);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,9,9,9,9};
        System.out.println("The sum of the elements in the array by iration is: "+getSumUsingIration(arr,arr.length));
       System.out.println("The sum of the elements in the array by Resucion is: "+getSumUsingResucion(arr,0));
        getSumby(arr);
    }
}
