package Tests;

import Base.TestBase;
import Pages.CountrySwitchPage;
import Pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class CountrySwitchTest extends TestBase {
    private WebDriver driver;
    private CountrySwitchPage countrySwitchPage;
    private HomePage homePage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = getDriver();
        countrySwitchPage=new CountrySwitchPage(driver);
    }

    @Test(priority = 1,groups = { "Country Switch" })
    public void switchToUSAViewTest() throws InterruptedException {
        homePage=new HomePage(driver);
        countrySwitchPage.switchToUSAViewMethod();
    }
    @Test(priority = 2,groups = { "Country Switch" })
    public void switchToBDViewTest() throws InterruptedException {
        countrySwitchPage=new CountrySwitchPage(driver);
        countrySwitchPage.switchToUSAViewMethod();
        countrySwitchPage.switchToBDViewMethod();
    }
}
