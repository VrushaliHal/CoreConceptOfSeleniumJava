package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUP(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.get("https://www.google.com/");

    }
    @Test(priority = 1, groups = "Google")
    public void googleTitleTest(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Google", "Title Not matched");
    }

    @Test(priority = 2, groups = "Google")
    public void googleLogoTest(){
        boolean b= driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
        System.out.println(b);
        Assert.assertTrue(b);
        Assert.assertEquals(b,true);
    }
    @Test(priority  =3, groups = "mail")
    public void mailLinkTest(){
        boolean c= driver.findElement(By.xpath("//a[@aria-label='Gmail ']")).isDisplayed();
        System.out.println(c);
    }
    @Test(priority  =4,groups = "Testing")
    public void Test4(){
        System.out.println("Hello");
    }
    @Test(priority  =5,groups = "Testing")
    public void Test5(){
        System.out.println("Hello Test5");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
