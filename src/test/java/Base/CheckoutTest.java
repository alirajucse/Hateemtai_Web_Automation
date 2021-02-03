package Base;

import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest{

    @Test
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
        signupPage.popUPSignUPCredentials("Raju","raju99@ht.com","01747358547","pP@01921666");
        checkoutPage.popUPSignUPCheckoutShippingAddress("Raju","Pilkhana,Dhaka","01747359862","1205");
        checkoutPage.checkoutMethod();
   }
}
