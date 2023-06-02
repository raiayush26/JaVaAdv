class  Engine{
    public void works(){
        System.out.println("Engine is s started ");

    }
}

class Car{
    private final Engine engine;

    Car(Engine engine){
        this.engine =engine;
    }
    Car(){
        System.out.println("car is not started");
    }
    public void works(){
        if(engine != null){
            System.out.println("Engine is startes ");
        }
        else {
            System.out.println("Car is not started");


        }
    }

   
}

public class Demo2 {
    Engine k = null;
    Engine s = new Engine();
    Car m = new Car(k);
}
