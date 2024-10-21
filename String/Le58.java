// https://leetcode.com/problems/length-of-last-word/description
// 58. Length of Last Word
public class Le58 {
    public static void main(String[]args) {
        String str = "  Hello World ";
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        System.out.println(s);
        s = s.trim();
        System.out.println(s.trim());
        int l = s.length();
        for(int i= l-1;i>=0;i--){
            if(s.charAt(i)!= ' '){
                count++;
            }else{break;} 
         }
        return count;
    }
}
