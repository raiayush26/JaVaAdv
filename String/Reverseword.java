public class Reverseword {
    public static String RevesWord(String s){
        String[] words = s.split(" ");
       
        StringBuilder ans = new  StringBuilder();
      // StringBuilder as = new  StringBuilder();
        for (String word : words) {
            ans.append(word).reverse();

            
        
       
        
        
        }
        return ans.toString();
    }
    public static void main(String[] args) {
       String s = "Let's take LeetCode contest";
        System.out.println(RevesWord(s));
    }
}
