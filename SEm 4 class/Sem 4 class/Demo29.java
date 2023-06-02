
import java.time.*;
/**
 * Demo29
 */
public class Demo29 {

    public static void main(String[] args) {
        MonthDay month =MonthDay.now();
        System.out.println(month);
        Clock c =Clock.systemDefaultZone();
        System.out.println(c.getZone());
        ZonedDateTime z=ZonedDateTime.now();
        System.out.println(z.getZone());
        Year y=Year.now();
        System.out.println(y.length());
        YearMonth ym=YearMonth.now();
        System.out.println(ym);
    }
}