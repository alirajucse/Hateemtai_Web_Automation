package Tests;
import Base.TestBase;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.SignupPage;
import org.testng.annotations.Test;

public class CheckoutTest extends TestBase{
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;
    private SignupPage signupPage;

    @Test(groups = { "smoke" })
    public void checkOutTestWithExistingUser() throws InterruptedException {
        loginPage.clickLoginText();
        loginPage.credentialsInput("raju82@ht.com","pP@01921666");
        loginPage.clickLoginButton();
        checkoutPage.productAddtoCart();
        checkoutPage.checkoutMethod();
    }
    @Test
    public void checkoutWithAddProductFromQuickView() throws InterruptedException {
        loginPage.clickLoginText();
        loginPage.LoginCredentialInput("raju82@ht.com","pP@01921666");
        loginPage.clickLoginButton();
        checkoutPage.productAddToCartFromQuickView();
        checkoutPage.checkoutMethod();
    }
    @Test
    public void popUPCheckoutTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        loginPage.popUpLogin("raju82@ht.com","pP@01921666");
        checkoutPage.checkoutMethod();
    }
    @Test
    public void popUPFBCheckoutTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        checkoutPage.fbPopUpCheckout();
        loginPage.popUpFbLogin();
        checkoutPage.checkoutMethod();
    }
    @Test
   public void popUpGmailCheckoutTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        loginPage.popUPGmailLogin();
        loginPage.gmailCredentials("alirajujnu1@gmail.com","pP@01921666");
        checkoutPage.checkoutMethod();
   }
   @Test
   public void popUPSignUPCheckoutTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        signupPage.clickPopUPSignupButton();
        signupPage.popUPSignUPCredentials("Raju","raju102@ht.com","01747358547","pP@01921666");
        checkoutPage.popUPSignUPCheckoutShippingAddress("Raju","Pilkhana,Dhaka","01747359862","1205");
        checkoutPage.checkoutMethod();
   }
}
