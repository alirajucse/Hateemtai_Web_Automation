package Base;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SignupPage signupPage;
    protected CheckoutPage checkoutPage;
    protected CategoryPage categoryPage;
    protected FBMessengerPage fbMessengerPage;
    protected MyAccountPage myAccountPage;
    public String baseUrl = "https://www.hateemtai.com/";

@BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get(baseUrl);
        Thread.sleep(10000);
        //1 - Maximize the window
        driver.manage().window().maximize();
        loginPage=new LoginPage(driver);
        signupPage=new SignupPage(driver);
        checkoutPage=new CheckoutPage(driver);
        categoryPage=new CategoryPage(driver);
        fbMessengerPage=new FBMessengerPage(driver);
        myAccountPage=new MyAccountPage(driver);
        //2 - Fullscreen mode
        //driver.manage().window().fullscreen();

        //3 - Specific width (iPhoneX)
        //driver.manage().window().setSize(new Dimension(375, 812));

        //System.out.println(driver.getTitle());
        //driver.quit();
    }
@AfterClass
    public void tearDown(){
    driver.close();
    }

}
