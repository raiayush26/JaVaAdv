
import java.time.LocalDate;
public class Demo28 {
    public static void main(String[] args) {
        LocalDate todayDate=LocalDate.now();
        System.out.println("Today Date is : "+todayDate);
        System.out.println(todayDate.isLeapYear());
    }

    
}