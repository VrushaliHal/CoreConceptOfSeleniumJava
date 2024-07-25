package testNGBasics;

import org.testng.annotations.*;

public class TestNGConcept {

    @BeforeSuite
    public void setUP(){
        System.out.println("1.@BeforeSuite: Set up");
    }
    @BeforeTest
    public void Login(){
        System.out.println("2.@BeforeTest: Login the Account");
    }
    @BeforeClass
    public void launchBrowser(){
     System.out.println("3.@BeforeClass: Launch Chrome Browser ");
    }

    @BeforeMethod
    public void enterURL(){
        System.out.println("-------------------------------");
        System.out.println("4.@BeforeMethod: Enter the URL");
    }
    @Test
    public void googleTest(){
        System.out.println("5.@Test:  Test 1 : => Google Test :");
    }
    @Test
    public void yahooTest(){
        System.out.println("5.@Test Test 2 : => Yahoo Test :");
    }
    @AfterMethod
    public void logOut(){
        System.out.println("6. @AfterMethod:  Logout from app");
        System.out.println("-------------------------------");
    }
    @AfterClass
    public void closeBrowser(){
        System.out.println("7.@AfterClass:  close the Browser");
    }
    @AfterTest
    public void deleteAllCookies(){
        System.out.println("8. @AfterTest:  Delete all Cookies");
    }

    @AfterSuite
    public void generateReport(){
        System.out.println("9. @AfterSuite:  Generate Report");
    }



}
