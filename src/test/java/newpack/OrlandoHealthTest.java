package newpack;

import base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.OrlandoHealthLoginPage;

public class OrlandoHealthTest extends Base {
    OrlandoHealthLoginPage orlandoHealthLoginPage=new OrlandoHealthLoginPage(driver);
    @BeforeClass
    public void start(){
        System.out.println("Orlando Health functionalities  verification start");

    }
    @AfterClass
    public void end(){
        System.out.println("Orlando Health functionalities verification finished");
       driver.quit();
    }
    @BeforeMethod
    public void setup(){
        System.out.println("Test is being executed");

     driver.get("https://www.orlandohealth.com/");

    }
    @AfterMethod
    public void teardown() throws InterruptedException {
        System.out.println("Test executed");
        Thread.sleep(2000);

    }
    @Test(priority = 1)
    public void orlandoHealth(){

        for(int a=0;a<orlandoHealthLoginPage.mainMenu.size();a++){
            String actualMenuItem= orlandoHealthLoginPage.mainMenu.get(a).getText();
            System.out.println(actualMenuItem);
            String[]expected={"HOME","FIND A PHYSICIAN","CONTENT HUB","BROWSE LOCATIONS","ONLINE BILL PAY","PATIENT PORTAL","CAREERS","DONATE ONLINE"};
            Assert.assertEquals(actualMenuItem,expected[a]);
        }
    }
@Test(priority = 2)
    public void contactMenu()throws ArithmeticException{
        String actualText=orlandoHealthLoginPage.contactMenuItem.getText();
        String expectedText="CONTACT US";
    Assert.assertEquals(actualText,expectedText,"CONTACT US not found");

}
@Test(priority = 3)
    public void OrlandoLogo() {
       boolean logoIsDisplayed= orlandoHealthLoginPage.OrlandoHealthLogo.get(0).isDisplayed();
        Assert.assertTrue(logoIsDisplayed,"Logo is not shown");

}
@Test(priority = 4)
public void subMenu() {
    for (int a = 0; a < orlandoHealthLoginPage.subMenu.size(); a++) {
        String actualSubMenu = orlandoHealthLoginPage.subMenu.get(a).getText();
        String[] subMenuItems = {"APPOINTMENTS", "MYCHART", "ER WAIT TIMES"};
        Assert.assertEquals(actualSubMenu, subMenuItems[a]);

    }

}
@Test(priority = 6)
public void dashBoardPicture(){
        boolean picDisplayed=driver.findElement(By.cssSelector(".banner-desktop")).isDisplayed();
        Assert.assertTrue(true,"picture is not displayed");
       String aa= driver.findElement(By.xpath("/html/body/div[5]/div/div[1]")).getText();
       Assert.assertEquals(aa,"Trusted. Nationally Recognized.");



}
public void baconAwardPic(){
        orlandoHealthLoginPage.baconAwardPic.click();
        driver.getTitle();
    System.out.println("djfkdjfk"+driver.getTitle());
}

}
/*
OrlandoHealth-User Story 3 - AC 2
user story 3 acceptance criteria 2


















 */
