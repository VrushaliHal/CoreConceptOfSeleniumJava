package testNGBasics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;

public class Base  {
     public static WebDriver driver;

    public static void initialization(){
        driver = new ChromeDriver();
        driver.get("https://www.qtpselenium.com/login");
    }

    public void failed(String TestMethodName){
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(scrFile,new File("D://Download Automation Softwares//takeScreenShot//"+TestMethodName));

        }
        catch(IOException ex){
              ex.printStackTrace();
        }
    }



}
