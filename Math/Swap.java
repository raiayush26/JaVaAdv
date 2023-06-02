public  class Swap{
    public static void main(String[] args) {
        int a= 'A';
        int b='B' ;
        a=a+b;// 65+66= 131
        b=a-b;//65-66= -1
        a=a-b;// 131-
        System.out.println("a="+(char) a  );
        System.out.println("b="+(char)b);
    }

}