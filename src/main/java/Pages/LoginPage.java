package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
    private WebDriver driver;
    private By loginlink=By.xpath("//a[normalize-space()='LOG IN']");
    private By usernameField = By.name("login_email");
    private By passwordField = By.name("login_password");
    private By loginButton = By.xpath("//*[@id='signuptab-pane-second']/form/div/div[3]/button");
    private By loginVerify =By.id("ddlProduct");
    private By actualResult=By.partialLinkText("MY ACCOUNT");
    private By gmailButton= By.xpath("//body/div[@id='root']/div/div/div/div[@id='signuptab']/div[@id='RegTabContent']/div[@id='signuptab-pane-second']/form/div/div/p/button[1]");
    private By email= By.xpath("//input[@id='identifierId']");
    private By next= By.xpath("//div[@id='identifierNext']//div[2]");
    private By password= By.xpath("//input[@name='password']");
    private By invalidLoginCredentialsCheck= By.xpath("//strong[normalize-space()='Invalid username or password.']");
    private By popupLoginEmailField= By.xpath("//input[@id='login_email']");
    private By popupLoginPasswordField= By.xpath("//input[@id='login_password']");
    private By popUpLoginSubmitButton= By.xpath("//body//div[@role='dialog']//div[@role='document']//div//div//div//div[3]//button[1]");
    private By checkout= By.xpath("//html//body//div//div//header//div//div//div//div//div//div//div//ul//div//div//div//div//div//button");
    private By fbLoginButton= By.xpath("//div[@id='signuptab-pane-second']//form//div//div//button[@type='button'][normalize-space()='Login with Facebook']");
    private By fbEmailField= By.xpath("//input[@id='email']");
    private By fbPasswordField= By.xpath("//input[@id='pass']");
    private By fbLoginConfirmButton= By.xpath("//input[@name='login']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLoginText() throws InterruptedException {
        Thread.sleep(50000);
        driver.findElement(loginlink).click();
    }

    public void setUsername(String username){

        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){

        driver.findElement(loginButton).click();
    }

    public void loginverify() throws InterruptedException{
        Thread.sleep(100000);
        driver.findElement(loginVerify).click();
        Thread.sleep(30000);
        String actualText= driver.findElement(actualResult).getText();
        String expectedResult="MY ACCOUNT";
        Assert.assertEquals(expectedResult,actualText);
    }

    public void clickGmailLoginButton() throws InterruptedException {
        Thread.sleep(50000);
        driver.findElement(gmailButton).click();

    }

    public void tryWithInvalidCredentials() throws InterruptedException {
        Thread.sleep(5000);
        if( driver.findElement(invalidLoginCredentialsCheck).isDisplayed()){
            System.out.println("Invalid username or password");
        }else{
            System.out.println("Testcase failed");
        }
    }

    public void credentialsInput(String mail,String pswrd) throws InterruptedException {

        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

// Perform the click operation that opens new window

// Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

// Perform the actions on new window
        Thread.sleep(50000);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(next).click();
        Thread.sleep(50000);
        driver.findElement(password).sendKeys(pswrd);
        driver.findElement(next).click();
// Close the new window, if that window no more required
        driver.close();

// Switch back to original browser (first window)
        driver.switchTo().window(winHandleBefore);
    }
    public void popUpLogin(String popUpmail,String popUpPwrd) throws InterruptedException {
        Thread.sleep(50000);
        driver.findElement(checkout).click();
        Thread.sleep(100000);
        driver.findElement(popupLoginEmailField).sendKeys(popUpmail);
        Thread.sleep(5000);
        driver.findElement(popupLoginPasswordField).sendKeys(popUpPwrd);
        Thread.sleep(5000);
        driver.findElement(popUpLoginSubmitButton).click();
    }
    public SecureAreaPage clickLoginButton1(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }

    public void facebookLogin(String fbEmail,String fbPasswrd) throws InterruptedException {
       Thread.sleep(100000);
       driver.findElement(fbLoginButton).click();
       Thread.sleep(100000);
        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();
// Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.findElement(fbEmailField).sendKeys(fbEmail);
        Thread.sleep(5000);
        driver.findElement(fbPasswordField).sendKeys(fbPasswrd);
        Thread.sleep(5000);
        driver.findElement(fbLoginConfirmButton).click();
        Thread.sleep(100000);
        // Close the new window, if that window no more required
        driver.close();

// Switch back to original browser (first window)
        driver.switchTo().window(winHandleBefore);
    }
}