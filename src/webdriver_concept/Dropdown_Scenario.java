package webdriver_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdown_Scenario {

    public static WebDriver driver;

    @Test
    public void registerTest()
    {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        Select drpCountry = new Select(driver.findElement(By.name("country")));
      //   drpCountry.selectByVisibleText("ANTARCTICA");
        //drpCountry.selectByIndex(2);
        //drpCountry.selectByValue("ANTARCTICA");

        List<WebElement> ele =  drpCountry.getOptions();
         System.out.println(ele.size());

        for (int j = 0; j < ele.size(); j++) {
            System.out.println(ele.get(j).getText());

        }

    }

}
