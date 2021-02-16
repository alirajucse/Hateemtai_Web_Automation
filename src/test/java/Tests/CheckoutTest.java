package Tests;
import Base.TestBase;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.SignupPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckoutTest extends TestBase{
    private WebDriver driver;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;
    private SignupPage signupPage;

    @BeforeClass
    public void setUp() {
        driver = getDriver();
        loginPage=new LoginPage(driver);
        checkoutPage=new CheckoutPage(driver);

    }
    @Test(priority = 1,groups = { "Checkout" })
    public void checkOutTestWithExistingUser() throws InterruptedException {
        loginPage.clickLoginText();
        loginPage.credentialsInput("raju82@ht.com","pP@01921666");
        loginPage.clickLoginButton();
        checkoutPage.productAddtoCart();
        checkoutPage.checkoutMethod();
    }
    @Test(priority = 2,groups = { "Checkout" })
    public void checkoutWithAddProductFromQuickView() throws InterruptedException {
        loginPage.clickLoginText();
        loginPage.LoginCredentialInput("raju82@ht.com","pP@01921666");
        loginPage.clickLoginButton();
        checkoutPage.productAddToCartFromQuickView();
        checkoutPage.checkoutMethod();
    }
    @Test(priority = 3,groups = { "Checkout" })
    public void popUPCheckoutTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        loginPage.popUpLogin("raju82@ht.com","pP@01921666");
        checkoutPage.checkoutMethod();
    }
    @Test(priority = 4,groups = { "Checkout" })
    public void popUPFBCheckoutTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        checkoutPage.fbPopUpCheckout();
        loginPage.popUpFbLogin("alirajujnubd@gmail.com","pP@01921666");
        checkoutPage.checkoutMethod();
    }
    @Test(priority = 5,groups = { "Checkout" })
    public void popUpGmailCheckoutTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        loginPage.popUPGmailLogin();
        loginPage.gmailCredentials("alirajujnu1@gmail.com","pP@01921666");
        checkoutPage.checkoutMethod();
   }
   @Test(priority = 6,groups = { "Checkout" })
   public void popUPSignUPCheckoutTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        signupPage.clickPopUPSignupButton();
        signupPage.popUPSignUPCredentials("Raju","raju102@ht.com","01747358547","pP@01921666");
        checkoutPage.popUPSignUPCheckoutShippingAddress("Raju","Pilkhana,Dhaka","01747359862","1205");
        checkoutPage.checkoutMethod();
   }
}
