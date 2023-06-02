public class Mythread {
    public static void main(String[] args) {
        Thread t =Thread.currentThread();
        System.out.println("Current Thread is :" + t);
        t.setName("vit");
        System.out.println("After name change"+t);
    }
}
