package Base;

import org.testng.annotations.Test;

public class signUPTest extends BaseTest{

    @Test
    public void signUPTestWithValidInformation() throws InterruptedException {
        signupPage.signUpLinkClick();
        signupPage.signUPInformationInputMethod("Raju","raju91@ht.com","pP@01921666","01747458963");
        signupPage.signUPFinalProcessMethod();
        loginPage.loginverify();
    }
    @Test
    public void popUPSignupTest() throws InterruptedException {
        checkoutPage.productAddtoCart();
        signupPage.clickPopUPSignupButton();
        signupPage.popUPSignUPCredentials("Raju","raju93@ht.com","01747359585","pP@01921666");
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
