package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TechproHomePage;
import techproed.pages.TechproLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_TechproLoginTest {

    @Test(groups = "regression-tests")
    public void loginTest() {
        TechproLoginPage techproLoginPage = new TechproLoginPage();
        TechproHomePage techproHomePage = new TechproHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("techpro_test_url"));

        techproLoginPage.userName.sendKeys(ConfigReader.getProperty("techpro_test_username"));
        techproLoginPage.password.sendKeys(ConfigReader.getProperty("techpro_test_password"));
        techproLoginPage.submitButton.click();


        Assert.assertTrue(techproHomePage.homeHeader.isDisplayed());
        techproHomePage.homeLogoutButton.click();

        //Cikis olduguna dair dogrulama yap
        Assert.assertTrue(techproLoginPage.submitButton.isDisplayed());

        Driver.closeDriver();



    }

}
