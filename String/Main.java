public class Main{
    public static void word(String word){
        int count=0;
        for(int i = 0;i<word.length();i++){
                count++;
        }
        System.out.println(count);
    }
    
     public static void main(String[] args) {
        String str ="aAAbbbb";
        word(str);
     } 
}