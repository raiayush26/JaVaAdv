import java.util.HashMap;

public class SumArray {
    public static int  SubArray(int [] nums, int k){

         HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum =0;
        int ans=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            System.out.print(sum+" ");
            
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println();
        return ans;
       

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k =3;
        System.out.println(SubArray(arr, k));
    }
}
