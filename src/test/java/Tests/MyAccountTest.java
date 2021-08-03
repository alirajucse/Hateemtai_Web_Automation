package Tests;

import Base.TestBase;
import Pages.LoginPage;
import Pages.MyAccountPage;
import org.testng.annotations.Test;

public class MyAccountTest extends TestBase{

    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Test(priority = 1,groups = { "smoke" })
    public void myAccountHomePageTest() throws InterruptedException {
        loginPage.clickLoginText();
        loginPage.LoginCredentialInput("raju82@ht.com","pP@01921666");
        loginPage.clickLoginButton();
        loginPage.loginverify();
        myAccountPage.myAccountHomePage();
    }
    @Test(priority = 2,groups = { "regression" })
    public void myAccountMyProfileTest() throws InterruptedException {
        loginPage.clickLoginText();
        loginPage.LoginCredentialInput("raju82@ht.com","pP@01921666");
        loginPage.clickLoginButton();
        loginPage.loginverify();
        myAccountPage.myProfileSection();
    }
    @Test(priority = 3,groups = { "smoke" })
    public void myOrderTest() throws InterruptedException {
        loginPage.clickLoginText();
        loginPage.LoginCredentialInput("raju82@ht.com","pP@01921666");
        loginPage.clickLoginButton();
        loginPage.loginverify();
        myAccountPage.myOrder();
    }
    @Test(priority = 3,groups = { "regression" })
    public void corporateSaleTest() throws InterruptedException {
        loginPage.clickLoginText();
        loginPage.LoginCredentialInput("raju82@ht.com","pP@01921666");
        loginPage.clickLoginButton();
        loginPage.loginverify();
        myAccountPage.corporateSaleSection();
    }
}
