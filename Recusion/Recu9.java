/**
 * Resu9
 */
public class Recu9 {
    public static String[] keypard ={".","abc","def","ghi","jkl","mno","pqrs","uvw","xyz"};

    public static  void printComb (String str,int idx,String comination){
        if(idx ==str.length()){
            System.out.println(comination);
            return;
        }
         char currChar = str.charAt(idx);
         String mapping = keypard[currChar-'0'];

         for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, comination+mapping.charAt(i));
         }

    }

    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");
    }
}