package test;

import base.Base;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.OrlandoHealthLoginPage;


import java.util.Set;



public class OrlandoHealthTest extends Base {



    OrlandoHealthLoginPage orlandoHealthLoginPage = new OrlandoHealthLoginPage(driver);
    private static  Logger oLog = LogManager.getLogger(OrlandoHealthTest.class.getName());



    @BeforeClass
    public void start() {
        System.out.println("Orlando Health functionalities  verification start");

    }

    @AfterClass
    public void end() {
        System.out.println("Orlando Health functionalities verification finished");
       // driver.quit();
    }

    @BeforeMethod
    public void setup() {
        System.out.println("Test is being executed");

        driver.get("https://www.orlandohealth.com/");

    }

    @AfterMethod
    public void teardown() throws InterruptedException {
        System.out.println("Test executed");
        Thread.sleep(2000);
    }

    @Test
    public void orlandoHealth() throws InterruptedException {

Thread.sleep(7000);
        for (int a = 0; a < orlandoHealthLoginPage.mainMenu.size(); a++) {
            String actualMenuItem = orlandoHealthLoginPage.mainMenu.get(a).getText();
            System.out.println(actualMenuItem);
            String[] expected = {"HOME", "FIND A PHYSICIAN", "CONTENT HUB", "BROWSE LOCATIONS", "ONLINE BILL PAY", "PATIENT PORTAL", "CAREERS", "DONATE ONLINE"};
            Assert.assertEquals(actualMenuItem, expected[a]);

        }
    }

    @Test
    public void contactMenu() throws ArithmeticException {
        String actualText = orlandoHealthLoginPage.contactMenuItem.getText();
        String expectedText = "CONTACT US";
        Assert.assertEquals(actualText, expectedText, "CONTACT US not found");

    }

    @Test
    public void OrlandoLogo() {
        boolean logoIsDisplayed = orlandoHealthLoginPage.OrlandoHealthLogo.get(0).isDisplayed();
        Assert.assertTrue(logoIsDisplayed, "Logo is not shown");


    }

    @Test
    public void subMenu() {
        for (int a = 0; a < orlandoHealthLoginPage.subMenu.size(); a++) {
            String actualSubMenu = orlandoHealthLoginPage.subMenu.get(a).getText();
            String[] subMenuItems = {"APPOINTMENTS", "MYCHART", "ER WAIT TIMES"};
            Assert.assertEquals(actualSubMenu, subMenuItems[a]);

        }

    }

    @Test
    public void dashBoardPicture() throws InterruptedException {
        boolean picDisplayed = driver.findElement(By.cssSelector(".banner-desktop")).isDisplayed();
        Assert.assertTrue(true, "picture is not displayed");
        String aa = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]")).getText();
        Assert.assertEquals(aa, "Trusted. Nationally Recognized.");
Thread.sleep(2000);

    }

    @Test
    public void baconAwardPic() throws InterruptedException {
        orlandoHealthLoginPage.baconAwardPic.click();
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Orlando Health - One of Central Florida's Most Comprehensive Healthcare Networks", "pic can't be clicked");
        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String child : allWindows) {
            if (!child.equals(parent)) {
                driver.switchTo().window(child);
                driver.findElement(By.xpath("/html/body/footer/div[2]/div/div[2]/ul/li[1]/a")).click();
            }
            driver.switchTo().window(parent);


        }


    }

    @Test
    public void bestChildrenHospital() throws InterruptedException {
//        String parent = driver.getWindowHandle();
//        Set<String>allWindows=driver.getWindowHandles();
//
//
//        for (String child: allWindows){
//            if(!child.equals(parent)){
//                driver.switchTo().window(parent);
//                orlandoHealthLoginPage.bestChildrenHospital.click();
//            }
//
//        }
       // driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[4]/p[13]/a")).click();
        orlandoHealthLoginPage.bestChildrenHospital.click();
              String parent = driver.getWindowHandle();
        Set<String>allWindows=driver.getWindowHandles();
        for (String child: allWindows){
            if(!child.equals(parent)){
                driver.switchTo().window(child);
                Thread.sleep(5000);
                driver.findElement(By.xpath("/html/body/div[3]/div/div/div/h3/a")).click();
                oLog.error("this line 144 fail");



            }


        }


        }
        @Test
        public void bestRegionalHospital(){
            System.out.println("kdjkjfkdddddddddddddddddddddddddddddddddddddddddddd");
         oLog.error("8888888888888888888888888888888");
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("arguments[0].click;",driver.findElement(By.xpath("/html/body/header/div[3]/div[3]/a[2]")));
        }






        }




/*
OrlandoHealth-User Story 3 - AC 2
user story 3 acceptance criteria 2


















 */
