// Print all unquie subSequence of a string

import java.util.HashSet;

public class Recu8 {
  public  static void subSequence(String str, int idx , String newString,HashSet <String> set){
    if (idx == str.length()) {
        if(set.contains(newString)){
            return;
        }else{
            
            set.add(newString);
            return ;

        }
        
    }
     char currChar =  str.charAt(idx);
    //  to be
    subSequence(str, idx+1, newString+currChar ,set);
    //  or not be
    subSequence(str, idx+1, newString,set);

  }
    public static void main(String[] args) {
         String str ="abcabcbb";
         HashSet <String> set = new HashSet<>();
         subSequence(str, 0, "",set);
    }
    
}
