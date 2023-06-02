// REmove duplicate in string
public class Recu6 {
    // time complexity is O(n)
    public static boolean[] map = new boolean[26];

    public static void removeDeplicati(String str ,int idx ,String newString){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar- 'a'] == true){
            removeDeplicati(str, idx+1,newString);
        }else {
            newString+= currChar;
            map[currChar-'a'] = true;
            removeDeplicati(str, idx+1, newString);
        }
    }

     public static void main(String[] args) {
         String str="abbccdd";
         removeDeplicati(str, 0, "");

    }
    
}
