package testNGBasics;

import org.testng.annotations.Test;

public class TestNGFeatures {

    @Test(invocationCount = 5)
    public void loginTest(){
        System.out.println("Login Test");
       // int i=9/0;
    }
    @Test(dependsOnMethods = "loginTest")
    public void HomePageTest(){
        System.out.println("Home Test");

    }
    @Test(dependsOnMethods = "HomePageTest")
    public void SearchPageTest(){
        System.out.println("Search Page Test");

    }

}
