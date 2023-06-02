import java.util.*;
 public class  Demo{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder str = new StringBuilder(sc.nextLine());
            str.append( sc.nextLine());
            System.out.println(str);
            int a;
            a =sc.nextInt();
            System.out.println(a);
        }
    }
 }