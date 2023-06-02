/**
 * PrintPermunation
 */
public class Backtracking {
     public static void PrintPermunation( String str, String perm, int indx){
      if (str.length() ==0){
         System.out.println(perm);
         return ;
      }
      for (int i = 0; i < str.length(); i++) {
        char currChar = str.charAt(i);
         String newStr = str.substring(0, i)+ str.substring(i+1);
         
         PrintPermunation(newStr,perm+currChar, indx+1);

      }

     }
    public static void main(String[] args) {
       String str ="abc" ;
       PrintPermunation(str, "", 0);
    }
}