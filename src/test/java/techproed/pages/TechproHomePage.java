package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechproHomePage {

    public TechproHomePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//div[@class='alert alert-success alert-dismissible fade show']")
    public WebElement homeHeader;

    @FindBy(xpath = "//i[@class='fa fa-sign-out-alt']")
    public WebElement homeLogoutButton;


}
