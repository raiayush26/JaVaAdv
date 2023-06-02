import java.util.Scanner;
public class DisplayTime {
    public static void main (String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Second");
            int sec= input.nextInt();
            int minutes = sec / 60;
            int remsec = sec% 60;
            System.out.println("the minutes is "+ minutes+" the Second is "+remsec);
        }
           }
    
}
