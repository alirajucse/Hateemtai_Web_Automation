package Base;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

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

@Test
public void invalidLoginCredentialsVerify() throws InterruptedException {
    loginPage.clickLoginText();
    loginPage.setUsername("raju82@ht.com");
    loginPage.setPassword("pP@019");
    loginPage.clickLoginButton();
    loginPage.tryWithInvalidCredentials();
}
@Test
public void loginWithGmail() throws InterruptedException {
    loginPage.clickLoginText();
   loginPage.clickGmailLoginButton();
   loginPage.gmailCredentials("alirajujnu1@gmail.com","pP@01921666");
   loginPage.loginverify();
}
@Test
public void popUpLoginTest() throws InterruptedException {
    checkoutPage.productAddtoCart();
    loginPage.popUpLogin("raju82@ht.com","pP@01921666");
    loginPage.loginverify();
}
@Test
public void fbLoginTest() throws InterruptedException {
    loginPage.clickLoginText();
    loginPage.ClickfacebookLoginButton();
    loginPage.fbcredentials("alirajujnubd@gmail.com","pP@01921666");
    loginPage.loginverify();
}
@Test
public void popUPGmailLoginTest() throws InterruptedException {
    checkoutPage.productAddtoCart();
    loginPage.popUPGmailLogin();
    loginPage.gmailCredentials("alirajujnu1@gmail.com","pP@01921666");
    loginPage.loginverify();
}
@Test
public void popUPFacebookLoginTest() throws InterruptedException {
    checkoutPage.productAddtoCart();
    loginPage.popUpFbLogin();
    loginPage.fbcredentials("alirajujnubd@gmail.com","pP@01921666");
    loginPage.loginverify();
}

}
