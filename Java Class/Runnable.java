import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;;

/**
 * Runnable
 */
public class Runnable {
    ExecutorService ex = Executors.newFixedThreadPool(2);
    Runnable tasks1 = new Task("of Locking");
    Runnable tasks2 = new Task(" of Checking");

    System.out.println("Starting ");


    
}