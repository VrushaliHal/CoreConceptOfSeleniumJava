package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderOTest {
    WebDriver driver;

    @Test(dataProvider  = "TestDataFeed")
    public void loginautomationTest(String username, String password){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.get("https://www.qtpselenium.com/login");
        driver.findElement(By.xpath("//input[@id='eMailAddress']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).submit();

    }
    @DataProvider
    public Object[][] TestDataFeed() {
        Object[][] loginData = new Object[2][2];
        loginData[0][0] = "Vrushisa36.13@gmail.com";
        loginData[0][1] = "Test123";
        loginData[1][0] = "Vrush.haldankar@gmail.com";
        loginData[1][1] = "Test123";
        return loginData;


    }
}
