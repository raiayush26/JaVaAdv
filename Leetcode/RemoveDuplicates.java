import java.util.ArrayList;
public class RemoveDuplicates {
    public static void finalValueAfterOperations(int [] nums) {
       
 
      
      
    }
    public  static int  removeDuplicates(int[] nums) {
        int index = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!= nums[i-1]){
                nums[index]= nums[i];
                index++;
            }
        }
        return index;
   }
    public static void main(String[] args) {
        int []operations = {0,0,1,1,1,2,2,3,3,4};
        // finalValueAfterOperations(operations);
        removeDuplicates(operations);
    }
}
