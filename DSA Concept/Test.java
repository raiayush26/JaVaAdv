class Bank{
    int getRateOfInterset(){return 0;}
}
class SBI extends Bank{
    int getRateOfInterset(){
        return 8;
    }
}
class IDBI extends Bank{
    int getRateOfInterset(){
        return 6;
    }
}
class AXIS extends Bank{
    int getRateOfInterset(){
         return 5;
    }
}
class Test{
public static void main(String[] args) {
    SBI  s =new SBI();
    IDBI i = new IDBI();
    AXIS a = new AXIS();
    System.out.println(s.getRateOfInterset());
    System.out.println(i.getRateOfInterset());
    System.out.println(a.getRateOfInterset());

}
}
