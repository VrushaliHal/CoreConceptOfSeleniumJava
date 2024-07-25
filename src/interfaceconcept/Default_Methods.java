package interfaceconcept;


interface camera {
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Greeting ....");
    }
     default void record4KVideo()

    {
        System.out.println("Recording 4K Video");
    }
}

interface  wifi{

    String[] getnetworks();
    void connectToNetwork(String networks);
}

class MyCellPhone {
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting ....");
    }
}
class MySmartPhone extends MyCellPhone implements wifi,camera {

    @Override
    public void takeSnap() {

    }

    @Override
    public void recordVideo() {

    }

    @Override
    public String[] getnetworks() {
        String[] networkList  = {"Harry" , "Prashant","Anjali"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String networks) {

    }
    @Override
    public void record4KVideo()

    {

        System.out.println("Overriden Recording 4K Video");
    }
}

public class Default_Methods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getnetworks();
        ms.record4KVideo();
        for(String sr : ar)
        {
            System.out.println(sr);
        }
    }
}
