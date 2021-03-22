package Tests;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignupPage;
import Pages.CheckoutPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SignupTest extends TestBase {
    private WebDriver driver;
    private SignupPage signupPage;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;
    private HomePage homePage;


    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = getDriver();
        loginPage=new LoginPage(driver);
        checkoutPage=new CheckoutPage(driver);
        signupPage=new SignupPage(driver);
        homePage=new HomePage(driver);
    }
    @Parameters({ "user","email","password","phone" })
    @Test(priority = 1,groups = { "Sign up","smoke" })
    public void signUPTestWithValidInformation(String user,String email,String pass,String phone) throws InterruptedException {
        homePage.homeScreen();
        signupPage.signUpLinkClick();
        signupPage.signUPInformationInputMethod(user,email,pass,phone);
        signupPage.signUPFinalProcessMethod();
        signupPage.successfulSignUPVerify();
        loginPage.logout();
    }
    @Test(priority = 2,groups = { "Sign up" })
    public void popUPSignupTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        signupPage.clickPopUPSignupButton();
        signupPage.popUPSignUPCredentials("Raju","raju150@ht.com","01747359585","pP@01921666");
        signupPage.successfulSignUPVerify();
        loginPage.logout();
    }
    @Test(priority = 3,groups = { "Sign up" })
    public void existingUserSignUpTest() throws InterruptedException {
        homePage.homeScreen();
        signupPage.signUpLinkClick();
        signupPage.signUPInformationInputMethod("Raju","raju82@ht.com","pP@01921666","01747359873");
        signupPage.signUPFinalProcessMethod();
        signupPage.existingUserSignUpCheck();
    }
}
