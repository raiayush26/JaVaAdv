public class palindrone{
    static boolean Palind (int[] arr ,int end ,int start){
        while(start<=end){
            if (arr[start]==arr[end]) {
                end --;
                start ++;                
            }
            else {
                return false;
            }       
        }
    return true;        
       
 }
    public static void main (String [] agrs){
        int [] array1 = {1,2,3,54,9,2,1};
        int end = array1.length-1;
        int start = 0;
        System.out.println(Palind(array1,end,start));
        
        
    }
}