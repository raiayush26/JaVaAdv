// Print all subSequence of a string
public class Recu7 {
  public  static void subSequence(String str, int idx , String  newString){
    if (idx == str.length()) {
        System.out.println(newString);
        return ;
        
    }
     char currChar =  str.charAt(idx);
    //  to be
    subSequence(str, idx+1, newString+currChar);
    //  or not be
    subSequence(str, idx+1, newString);

  }
    public static void main(String[] args) {
         String str ="abc";
         subSequence(str, 0, "");
    }
    
}
 