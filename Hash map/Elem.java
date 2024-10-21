import java.util.*;
public class Elem {
    public static List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();

        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        System.out.println("duefd "+map);
        
            // Set<Integer> keyset =map.keySet();
            // for(Integer key: map.keySet()){
                
            //         al.add(key);
                
            // }
        
        return al;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
        System.out.println(majorityElement(nums));
    }
}