class MyThread extends Thread{
    public void main() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
                System.out.println("Ther current tread name is : "+Thread.currentThread());
                
            } catch (Exception e) {}
                  System.out.println(i); 
        }
    }
}

public class example {

    public static void main(String[] args) {
        MyThread th0=new MyThread();
        MyThread th1=new MyThread();
        MyThread th2=new MyThread();
        th0.start();
        th1.start();
        th2.start();

    }
}