package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    WebDriver driver;

    @Test
    @Parameters({ "url","email", "password"})
    public void loginSiteTest(String url , String email, String password){
        driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='eMailAddress']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).submit();

    }

}
