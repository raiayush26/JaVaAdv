// Check if an array is sorted (String Increasing)
public class Recu4 {
    public static boolean isSorted(int arr[], int idx){
        if (idx == arr.length-1){
            return true;
        }
        if (arr[idx]>=arr[idx+1]){
            // array is unsorted till now
            return false;
        }
            return  isSorted(arr, idx+1);
        
    }
   
    public static void main(String[] args) {
         int arr[]={1,3,3};
         System.out.println(isSorted(arr, 0));

    }
}
