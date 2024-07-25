package constructorConcept;

public class Vehicle {

     int speed ;
     static int  wheels ;
     static int seat  ;
     String fuel;

       public  Vehicle(){
           System.out.println("Default constructor");
       }
       public Vehicle(int s , int w, int  se )
    {
        speed =s;
        wheels = w;
        seat =se;

    }
    public Vehicle(int s , String f, int  se )
    {
        speed =s;
        fuel = f;
        seat =se;

    }
    void drive(){
          System.out.println(speed+ ": "+ wheels+": "+seat);
    }
    void fuel(){
        System.out.println(speed+ ": "+ fuel+": "+seat);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(15, 4, 6) ;
        v1.drive();
        new Vehicle() ;
        Vehicle v3 = new Vehicle(15, "10L", 6) ;
        v3.fuel();


    }
}
