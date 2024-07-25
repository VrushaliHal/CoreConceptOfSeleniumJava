package abstractionconcept;

public class TestShape  extends Shape{
    TestShape(){
        System.out.println(" TestShape Constructor..........");
    }


    @Override
    public void draw() {
        System.out.println("draw-----");
    }

    @Override
    public void sketch() {
        System.out.println("sketch-----");
    }


    public static void main(String[] args) {
        paint();
        Shape p = new TestShape();
        p.draw();
        p.sketch();
        p.fill();
        p.spray();
        System.out.println(color);
        System.out.println(shade);

    }


    @Override
    public void eat() {

    }
}
