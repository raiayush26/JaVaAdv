import java.util.Scanner;
public class DisplayCaelsius{
    public static void main (String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        Double F= sc.nextDouble();
        Double C = (F - 32) *(5/9);
        System.out.println("The Celcus  in Fahrenheit is "+ C + "°C");
    }    
    }
}
