public class Reverse {
    public static void print(int [] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
   
    public static void swap2(int [] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        
        int arr2 []={1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("Swapping from Second swap------------->");
        swap2(arr2);
        print(arr2);

    }
}
