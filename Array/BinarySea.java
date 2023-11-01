// 852. Peak Index in a Mountain Array
public class BinarySea {
    public  static int Mountain(int[] nums) {
        int f=0,l=nums.length-1;
        System.out.println("   "+l+"  ");
        if(nums.length<3)return -1;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]){
                return mid;
            }

            else if(nums[mid]<nums[mid+1]&&nums[mid]>nums[mid-1]){
                f=mid+1;
            }
            else l=mid;
        }
        return -1;
      } 
  
    public static void main(String[] args) {
        int [] peak ={4,1,8,4};
        //System.out.println(Mountain(peak));
        peak[0] = -1;
        for (int i = 0; i < peak.length; i++) {
            System.out.print(peak[i]+" ");
        }

    }
}
