package Tests;

import Base.TestBase;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    private WebDriver driver;
    private LoginPage loginPage;
    private CheckoutPage checkoutPage;
    private HomePage homePage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = getDriver();
        loginPage=new LoginPage(driver);
        checkoutPage=new CheckoutPage(driver);
        homePage=new HomePage(driver);
    }
@Parameters({ "email", "password" })
@Test(priority = 1,groups = { "Login","smoke" })
public void testSuccessfulLogin(String email,String pass) throws InterruptedException {
    loginPage.clickLoginText();
    loginPage.LoginCredentialInput(email,pass);
    loginPage.clickLoginButton();
    homePage.homeScreen();
    loginPage.loginverify();
    loginPage.logout();
}
@Test(priority = 3,groups = { "Login" })
public void invalidLoginCredentialsVerify() throws InterruptedException {
    homePage.homeScreen();
    loginPage.clickLoginText();
    loginPage.LoginCredentialInput("raju82@ht.com","pP@01");
    loginPage.clickLoginButton();
    loginPage.tryWithInvalidCredentials();
}
@Test(priority = 5,groups = { "Login"})
public void loginWithGmail() throws InterruptedException {
   homePage.homeScreen();
   loginPage.clickLoginText();
   loginPage.clickGmailLoginButton();
   //loginPage.gmailCredentials("alirajujnu2@gmail.com","pP@01921666");
  // homePage.homeScreen();
  // loginPage.loginverify();
   loginPage.logout();
}
@Test(priority = 2,groups = { "Login" })
public void popUpLoginTest() throws InterruptedException {
    homePage.homeScreen();
    checkoutPage.productAddtoCart();
    loginPage.popUpLogin("raju82@ht.com","pP@01921666");
    homePage.homeScreen();
    Thread.sleep(10000);
    loginPage.loginverify();
    loginPage.logout();
}
@Test(priority = 4,groups = { "Login","smoke" })
public void fbLoginTest() throws InterruptedException {
    homePage.homeScreen();
    loginPage.clickLoginText();
    loginPage.ClickfacebookLoginButton();
    loginPage.fbcredentials("alirajujnubd@gmail.com","pP@01921666");
    homePage.homeScreen();
    Thread.sleep(10000);
    loginPage.loginverify();
    loginPage.logout();
}
@Test(priority = 6,groups = { "smoke" })
public void popUPGmailLoginTest() throws InterruptedException {
    homePage.homeScreen();
    checkoutPage.productAddtoCart();
    loginPage.popUPGmailLogin();
    loginPage.gmailCredentials("alirajujnu@gmail.com","pP@01921666");
    homePage.homeScreen();
    Thread.sleep(10000);
    loginPage.loginverify();
    loginPage.logout();
}
@Test(priority = 3,groups = { "smoke" })
public void popUPFacebookLoginTest() throws InterruptedException {
    homePage.homeScreen();
    checkoutPage.productAddtoCart();
    loginPage.clickPopUPFBButton();
    loginPage.popUpFbLogin("alirajujnubd@gmail.com","pP@01921666");
    homePage.homeScreen();
    Thread.sleep(10000);
    loginPage.loginverify();
    loginPage.logout();
}
@Test(priority = 1,groups = { "smoke" })
public void beforeGmailLoginTest() throws InterruptedException {
    loginPage.gmailLoginSeperately("alirajujnu1@gmail.com","pP@01921666");
  }
}
