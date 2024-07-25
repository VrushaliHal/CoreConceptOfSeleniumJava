package abstractionconcept;

public  abstract class Shape extends Animal  {
    protected static  int color =10;
    static String shade = "blue";
    Shape(){
        System.out.println("Shape class constructor");
    }


    public abstract void draw();
    public abstract void sketch();
    public void fill()
    {
        System.out.println("Fill---------");
    }

    public static void paint() {
        System.out.println("paint---------");
    }

    public final void spray()
        {
            System.out.println("spray............final");
        }

}
