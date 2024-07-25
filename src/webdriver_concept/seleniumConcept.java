package webdriver_concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumConcept {
    public static void main(String[] args) {
         WebDriver dr = new ChromeDriver();
         dr.get("https://www.selenium.dev/downloads/");
         dr.close();
    }
}
