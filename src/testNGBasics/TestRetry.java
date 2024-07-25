package testNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetry {

//   @Test(retryAnalyzer = MyRetry.class)
   @Test
    public void drive(){
        Assert.assertEquals(false,true);
    }
   // @Test(retryAnalyzer = MyRetry.class)
   @Test
    public void ride(){
        Assert.assertEquals(false,true);
    }
  // @Test(retryAnalyzer = MyRetry.class)
    @Test
    public void swim(){
        Assert.assertEquals(false,true);
    }
    @Test
    public void walk(){
        Assert.assertEquals(true,true);
    }
}
