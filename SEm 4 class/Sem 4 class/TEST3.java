class  Vehile{
    int passengengers;
    int fuelcap;
    int milage; 

Vehile(){
    passengengers=8;
    fuelcap=28;
    milage=50;   
}
}
class TEST3{
 public static  void main (String args[]){ 
    Vehile minivan=new Vehile();
    Vehile sportcar=new Vehile();
    
    System.out.println("Fule capcity of minivan is" +minivan.milage); 
    System.out.println("Fule capcity of sportcar is" +sportcar.milage); 
 }
}