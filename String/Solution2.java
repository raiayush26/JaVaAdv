public class Solution2 {
    public static int SameString(String a,String b){
        int len1 = a.length();
        int len2 = b.length();
         for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if(a.charAt(i+j)==b.charAt(j)){
                    return  3;
                }
                else{

                    return 2;
                }
                
            }
            return 4;
            
         }
         return -1;

    }
    
    public static void main(String[] args) {
        String a ="ayush";
        String b = "yush";
        System.out.println(SameString(a,b));

    }
}
