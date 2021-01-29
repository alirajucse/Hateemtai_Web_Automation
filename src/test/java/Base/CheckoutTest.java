package Base;

import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void testSuccessfulLogin() throws InterruptedException {
        Thread.sleep(40000);
        loginPage.clickLoginText();
        Thread.sleep(50000);
        loginPage.setUsername("raju82@ht.com");
        loginPage.setPassword("pP@01921666");
        loginPage.clickLoginButton();
        Thread.sleep(50000);
        loginPage.loginverify();
    }
    public void checkOutTestWithExistingUser() throws InterruptedException {
        checkoutPage.productAddtoCart();
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

}
