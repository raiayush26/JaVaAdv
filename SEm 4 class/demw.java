class MyThread extends Thread{
    public void main() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
                System.out.println("Ther current tread name is : "+Thread.currentThread().getName());
                
            } catch (Exception e) {}
                  System.out.println(i); 
        }
    }
}
public class demw  {

    public static void main(String[] args) {
        MyThread th0=new MyThread();
        MyThread th1=new MyThread();
        MyThread th2=new MyThread();
        th0.start();
        try {th0.join(); } catch (Exception e) { }
        th1.start();
        System.out.println("Status of thtread 1 is:"+th1.isAlive());
        th2.start();

    }
}
