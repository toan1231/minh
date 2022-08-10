package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrlandoHealthLoginPage  {
    WebDriver driver;
    public OrlandoHealthLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@class='header-bar header-bar-desktop']/div[2]/a")
    public List<WebElement> mainMenu;
    @FindBy(xpath = "//*[@class='btn header-primary-btn ohcontact']")
    public WebElement contactMenuItem;
    @FindBy (xpath ="//*[@class='header-bar header-bar--main']/div[2]/a/img")
    public List<WebElement>OrlandoHealthLogo;
    @FindBy(css = ".header-bar.header-bar--main>div:nth-child(3)>a")
    public List<WebElement>subMenu;
    @FindBy(css = "[style='opacity: 1; width: 4767px; transform: translate3d(-1135px, 0px, 0px);']>div:nth-child(6)>a")
    public WebElement baconAwardPic;
    @FindBy(css = "[style='opacity: 1; width: 4767px; transform: translate3d(-1135px, 0px, 0px);']>div:nth-child(7)>a")
    public WebElement bestChildrenHospital;
    @FindBy(css = "[style='opacity: 1; width: 4767px; transform: translate3d(-1135px, 0px, 0px);']>div:nth-child(8)>a")
    public WebElement bestRegionalHospital;
    public void logIn(String username,String password){

    }

}
