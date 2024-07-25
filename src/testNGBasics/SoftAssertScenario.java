package testNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertScenario {

    SoftAssert sft =new SoftAssert();
    @Test(priority = 1)
    public void write()
    {
        System.out.println("You can write");
        sft.assertEquals(true,false);
        System.out.println("You can write 2");
        sft.assertAll();

    }
    @Test(priority = 2)
    public void read()
    {
        System.out.println("You can read");
        sft.assertEquals(true,false);
        System.out.println("You can read 2");
        sft.assertEquals(true,false);
        sft.assertAll();
    }
    @Test(priority = 3)
    public void sleep()
    {
        System.out.println("You can sleep");
        sft.assertEquals(true,false);
        sft.assertEquals(true,false);
        System.out.println("You can sleep 2");
        sft.assertAll();

    }



}
