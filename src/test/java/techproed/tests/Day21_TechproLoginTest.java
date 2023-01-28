package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TechproHomePage;
import techproed.pages.TechproLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_TechproLoginTest {

    @Test
    public void loginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("techpro_test_url"));

        TechproLoginPage techproLoginPage = new TechproLoginPage();

        techproLoginPage.userName.sendKeys(ConfigReader.getProperty("techpro_test_username"));
        techproLoginPage.password.sendKeys(ConfigReader.getProperty("techpro_test_password"));
        techproLoginPage.submitButton.click();

        TechproHomePage techproHomePage=new TechproHomePage();

        Assert.assertTrue(techproHomePage.homeHeader.isDisplayed());
        techproHomePage.homeLogoutButton.click();

        Driver.closeDriver();



    }

}
