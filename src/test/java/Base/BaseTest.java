package Base;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;
    public String baseUrl = "https://www.hateemtai.com/";

@BeforeClass
    public void setUp(){
        System.setProperty("webdriver.edge.driver", "resource/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.get(baseUrl);
        //1 - Maximize the window
        driver.manage().window().maximize();
        loginPage=new LoginPage(driver);
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
