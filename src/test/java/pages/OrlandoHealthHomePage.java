package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrlandoHealthHomePage extends Base {
    public OrlandoHealthHomePage (WebDriver driver){

        PageFactory.initElements(driver,this);

    }

}
