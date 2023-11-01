public  class Swap2{
    public static void Swap(int a, int b){
        a=a+b;// 65+66= 131
        b=a-b;//65-66= -1
        a=a-b;// 131-
    }
    public static void Swap3(int x, int y){
         
         int temp = x;
         x = y;
         y = temp;
        System.out.println(x);
        System.out.println(y);
    }
    
    public static void main(String[] args) {
        int a= 15;
        int b= 4 ;
      //  Swap3(a, b);
        Swap(a, b);
        // System.out.println("a="+(char) a  );
        // System.out.println("b="+(char)b);
        System.out.println("a= "+a  );
        System.out.println("b= "+b);
    }

}