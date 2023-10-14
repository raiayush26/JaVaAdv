import java.util.*;
public  class stringBuilder{
public static void main(String[] args) {
     StringBuilder sp  = new StringBuilder("Tony");
    String a = sp.toString();
    for (int i = 0; i < sp.length(); i++) {
        int font =1;
        int back = sp.length() - 1 - i;
        char fontChar=sp.charAt(font);
        char backChar=sp.charAt(back);
        sp.setCharAt(font, backChar);
        sp.setCharAt(back, fontChar);
        
    }
    System.out.println("The original string is "+a+" reveved string is "+sp);
   


}


}