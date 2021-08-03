package Tests;
import Base.TestBase;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignupPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckoutTest extends TestBase{
    private WebDriver driver;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;
    private SignupPage signupPage;
    private HomePage homePage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = getDriver();
        loginPage=new LoginPage(driver);
        checkoutPage=new CheckoutPage(driver);
        homePage=new HomePage(driver);
    }
    @Parameters({ "email", "password" })
    @Test(priority = 1,groups = { "smoke" })
    public void checkOutTestWithExistingUser(String email,String pass) throws InterruptedException {
        loginPage.clickLoginText();
        loginPage.LoginCredentialInput(email,pass);
        loginPage.clickLoginButton();
        checkoutPage.productAddtoCart();
        //checkoutPage.checkoutViaCartDetails();
        checkoutPage.checkoutMethod();
        loginPage.logout();
    }
    @Test(priority = 2,groups = { "smoke" })
    public void checkoutWithAddProductFromQuickView() throws InterruptedException {
        homePage.homeScreen();
        loginPage.clickLoginText();
        loginPage.LoginCredentialInput("raju82@ht.com","pP@01921666");
        loginPage.clickLoginButton();
        checkoutPage.productAddToCartFromQuickView();
        checkoutPage.checkoutMethod();
        loginPage.logout();
    }
    @Test(priority = 3,groups = { "smoke" })
    public void popUPCheckoutTest() throws InterruptedException {
        homePage.homeScreen();
        checkoutPage.productAddtoCart();
        loginPage.popUpLogin("raju82@ht.com","pP@01921666");
        loginPage.clickLoginButton();
        checkoutPage.checkoutMethod();
        loginPage.logout();
    }
    @Test(priority = 4,groups = { "smoke" })
    public void popUPFBCheckoutTest() throws InterruptedException {
        homePage.homeScreen();
        checkoutPage.checkoutViaCartDetails();
        checkoutPage.fbPopUpCheckout();
        loginPage.popUpFbLogin("alirajujnubd@gmail.com","pP@01921666");
        checkoutPage.checkoutMethod();
        loginPage.logout();
    }
    @Test(priority = 5,groups = { "smoke" })
    public void popUpGmailCheckoutTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        loginPage.popUPGmailLogin();
        loginPage.gmailCredentials("alirajujnu1@gmail.com","pP@01921666");
        checkoutPage.checkoutMethod();
   }
   @Test(priority = 6,groups = { "smoke" })
   public void popUPSignUPCheckoutTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        signupPage.clickPopUPSignupButton();
        signupPage.popUPSignUPCredentials("Raju","raju102@ht.com","01747358547","pP@01921666");
        checkoutPage.popUPSignUPCheckoutShippingAddress("Raju","Pilkhana,Dhaka","01747359862","1205");
        checkoutPage.checkoutMethod();
   }
}
