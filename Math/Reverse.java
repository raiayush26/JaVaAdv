public class Reverse {
    public static void print(String [] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
   
    public static void swap2(String [] arr){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            arr[start]=arr[start]+arr[end];
            arr[end]= arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        
        String arr2 []={"h","e","l","l","o"};
        
        System.out.println("Swapping from Second swap------------->");
        swap2(arr2);
        print(arr2);

    }
}
