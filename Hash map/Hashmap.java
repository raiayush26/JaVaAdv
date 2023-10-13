import java.util.HashMap;

public class Hashmap {

 // Leetcode 2053. Kth Distinct String in an Array
      public static String kthDistinct(String[] arr, int k) {
       HashMap<String,Integer> map= new HashMap<>();
       for (String s: arr){
           map.put(s,map.getOrDefault(s,0)+1);
       }
       int count =0;
    
       for(int i =0;i<arr.length;i++){
          if(map.get(arr[i])==1){
               count++;
               if(count==k){
                   return arr[i];
               }
           }
       }
       return  "";
    }
    public static void main(String[] args) {
        String []arr={"d","b","c","b","c","a"};
        int k=2;
        System.out.println(kthDistinct(arr, k));
    }
}
