package testNGBasics;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(customListener.class)
public class ScreenshotScenario extends Base {

    @BeforeMethod
    public void setUP(){
        initialization();

    }

    @AfterMethod
    public void TearDown(){
      driver.quit();
    }
    @Test
    public void test_case_001(){
        driver.findElement(By.xpath("//input[@id='eMailAddress']")).sendKeys("vrushisa36.13@gmail.com");
        driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("tesdfg");
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Assert.assertEquals(false,true);
    }



    }

