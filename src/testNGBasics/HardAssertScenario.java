package testNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertScenario {

    @Test(priority = 1)
    public void write()
    {
        System.out.println("You can write");
        Assert.assertEquals(true,false);
        System.out.println("You can write 2");

    }
    @Test(priority = 2)
    public void read()
    {
        System.out.println("You can read");
        Assert.assertEquals(true,false);
        System.out.println("You can read 2");
        Assert.assertEquals(true,false);
    }
    @Test(priority = 3)
    public void sleep()
    {
        System.out.println("You can sleep");
        Assert.assertEquals(true,false);
        Assert.assertEquals(true,false);
        System.out.println("You can sleep 2");
    }

}
