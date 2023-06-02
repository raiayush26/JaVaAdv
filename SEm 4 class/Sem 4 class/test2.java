class Vehile{
    int passengengers;
    int fuelcap;
    int milage;
    void range(){
        System.out.println("The range of minivan is" +fuelcap*milage); 
    }
}
public class test2 {
    public static  void main (String args[]){
        Vehile minivan=new Vehile();     
        minivan.passengengers=8;
        minivan.fuelcap=28;
        minivan.milage=50;  
        
        Vehile sportcar=new Vehile();      
        sportcar.passengengers=8;
        sportcar.fuelcap=28;
        sportcar.milage=50;  
       
    }
    
}
