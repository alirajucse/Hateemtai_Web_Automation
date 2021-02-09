package Tests;

import Base.TestBase;
import Pages.LoginPage;
import Pages.SignupPage;
import Pages.CheckoutPage;
import org.testng.annotations.Test;

public class signUPTest extends TestBase {

    private SignupPage signupPage;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;

    @Test
    public void signUPTestWithValidInformation() throws InterruptedException {
        signupPage.signUpLinkClick();
        signupPage.signUPInformationInputMethod("Raju","raju100@ht.com","pP@01921666","01747458963");
        signupPage.signUPFinalProcessMethod();
        loginPage.loginverify();
    }
    @Test
    public void popUPSignupTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        signupPage.clickPopUPSignupButton();
        signupPage.popUPSignUPCredentials("Raju","raju101@ht.com","01747359585","pP@01921666");
        signupPage.successfulSignUPVerify();
    }
    @Test
    public void existingUserSignUpTest() throws InterruptedException {
        signupPage.signUpLinkClick();
        signupPage.signUPInformationInputMethod("Raju","raju82@ht.com","pP@01921666","01747359873");
        signupPage.signUPFinalProcessMethod();
        signupPage.existingUserSignUpCheck();
    }
}
