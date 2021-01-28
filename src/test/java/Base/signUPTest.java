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
}
