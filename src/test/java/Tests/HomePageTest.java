package Tests;
import Base.TestBase;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    private HomePage homePage;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        this.driver=driver;
        homePage=new HomePage(driver);
    }

    @Test
    public void verifyHomePage() {
        System.out.println("Home page test...");
        homePage=new HomePage(driver);
        Assert.assertTrue(homePage.verifyHomePageTitle(), "Home page title doesn't match");
    }

    @Test
    public void VerifyHomePageTop() {

    }

    @Test
    public void VerifyHomePageBottom() throws InterruptedException {

    }

    @Test
    public void VerifyHomePageMiddle() {

    }
}
