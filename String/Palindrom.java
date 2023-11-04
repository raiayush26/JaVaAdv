import java.util.*;

public class Palindrom {
    public static void token(String s){
        Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        scan.close();

        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split(" ");
            System.out.println(strings.length);
            for (String str : strings)
                System.out.println(str);
        }
    }
    public static void main(String[] args) {
       // String str="madam";
        String token= "He is a very very good boy, isn't he?";
        // String rev="";
        // StringBuilder sb = new StringBuilder(str);
        // String newStr =sb.reverse().toString();
        // System.out.println(newStr);
       // System.out.println("rev"+rev);
          token(token);
    }
}
