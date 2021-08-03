package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private By loginlink = By.xpath("//a[normalize-space()='LOG IN']");
    private By usernameField = By.xpath("//input[@placeholder='Email*']");
    private By passwordField = By.xpath("//input[@placeholder='Password*']");
    private By loginButton = By.xpath("//span[normalize-space()='Login']");
    private By loginVerify = By.xpath("//a[normalize-space()='MY ACCOUNT']");
    private By actualResult = By.partialLinkText("MY ACCOUNT");
    private By gmailButton = By.xpath("//body/div[@id='root']/div/div/div/div[@id='signuptab']/div[@id='RegTabContent']/div[@id='signuptab-pane-second']/form/div/div/p/button[1]");
    private By gmailEmailField= By.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/form/span/section/div/div/div/div/div/div/div/input[1]");
    private By gmailEmailPassword= By.xpath("//body//div//div//div//div//div//div//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//input[1]");
    private By email = By.xpath("//input[@id='identifierId']");
    private By next = By.xpath("//div[@id='identifierNext']//div[2]");
    private By password = By.xpath("//input[@name='password']");
    private By invalidLoginCredentialsCheck = By.xpath("//strong[normalize-space()='Invalid username or password.']");
    private By popupLoginEmailField = By.id("login_email");
    private By popupLoginPasswordField = By.id("login_password");
    private By popUpLoginSubmitButton = By.xpath("//body//div[@role='dialog']//div[@role='document']//div//div//div//div[3]//button[1]");
    private By checkout = By.xpath("//html//body//div//div//header//div//div//div//div//div//div//div//ul//div//div//div//div//div//button");
    private By fbLoginButton = By.xpath("//div[@id='signuptab-pane-second']//form//div//div//button[@type='button'][normalize-space()='Login with Facebook']");
    private By fbEmailField = By.xpath("//input[@name='email']");
    private By fbPasswordField = By.xpath("//input[@name='pass']");
    private By fbLoginConfirmButton = By.xpath("//input[@name='login']");
    private By popUpGmailButton = By.xpath("//body/div[@role='dialog']/div[@role='dialog']/div/div[@role='document']/div/div/div/div/p/button[1]");
    private By popUPFBButton = By.xpath("//body/div[@role='dialog']/div[@role='dialog']/div/div[@role='document']/div/div/div/div/p/span/button[1]");
    private By loginProfileButton= By.id("ddlProduct");
    private By logoutButton= By.partialLinkText("Log O");
    private By popUPFBEmailField= By.id("email");
    private By popUPFBPassField= By.id("pass");
    private By popUPFBSigninButton= By.xpath("//input[@name='login']");
    private By beforeGmailUser= By.xpath("//input[@name='identifier']");
    private By beforeGmailLoginNextButton= By.xpath("//div[@data-is-touch-wrapper='true']//div[2]");
    private By beforeGmailPass= By.xpath("//input[@name='password']");
    private By beforeGmailLoginSubmitButton= By.xpath("//body//div[@data-continent='Southern Asia']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div[@role='presentation']//div//div//div[1]//div[1]//div[1]//button[1]//div[2]");


    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickLoginText() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((loginlink)));
        if(driver.findElement(loginlink).isDisplayed()){
            driver.findElement(loginlink).click();
        }
        else {
            System.out.println("Login link element not found");
        }
    }

    public void LoginCredentialInput(String username,String password) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((usernameField)));
        driver.findElement(usernameField).sendKeys(username);
        wait.until(ExpectedConditions.presenceOfElementLocated((passwordField)));
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((loginButton)));
        driver.findElement(loginButton).click();
    }

    public void loginverify() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((loginProfileButton)));
        boolean loginVerify=driver.findElement(loginProfileButton).isDisplayed();
        if(loginVerify){
            System.out.println("Login successful");
        }
    }

    public void clickGmailLoginButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((gmailButton)));
        driver.findElement(gmailButton).click();

    }

    public void tryWithInvalidCredentials() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((invalidLoginCredentialsCheck)));
        driver.findElement(invalidLoginCredentialsCheck).isDisplayed();
        System.out.println("Test case passed");
    }

    public void credentialsInput(String mail, String pswrd) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window

        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        // Perform the actions on new window
        wait.until(ExpectedConditions.presenceOfElementLocated((email)));
        driver.findElement(email).sendKeys(mail);
        driver.findElement(next).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((password)));
        driver.findElement(password).sendKeys(pswrd);
        driver.findElement(next).click();
        // Close the new window, if that window no more required
        driver.close();
// Switch back to original browser (first window)
        driver.switchTo().window(winHandleBefore);
    }
    public void switchToTab() {
        // Switching between tabs using CTRL + tab keys.
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
    }
    public void gmailLoginSeperately(String gmail,String pass) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        // Open tab 2 using CTRL + T keys.
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

        // Open URL In 2nd tab.
        driver.get("http://www.gmail.com");
        // Call switchToTab() method to switch to the first tab
        switchToTab();
        driver.findElement(beforeGmailUser).sendKeys(gmail);
        wait.until(ExpectedConditions.presenceOfElementLocated((beforeGmailLoginNextButton)));
        driver.findElement(beforeGmailLoginNextButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((beforeGmailPass)));
        driver.findElement(beforeGmailPass).sendKeys(pass);
        wait.until(ExpectedConditions.presenceOfElementLocated((beforeGmailLoginSubmitButton)));
        driver.findElement(beforeGmailLoginSubmitButton).click();
        // Call switchToTab() method to switch to the second tab.
        switchToTab();
        driver.navigate().to("www.gmail.com");
    }

    public void gmailCredentials(String gmail,String gmailPasswrd) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window

        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        wait.until(ExpectedConditions.presenceOfElementLocated((gmailEmailField)));
        // Perform the actions on new window
        driver.findElement(gmailEmailField).sendKeys(gmail);
        wait.until(ExpectedConditions.presenceOfElementLocated((next)));
        driver.findElement(next).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((gmailEmailPassword)));
        driver.findElement(gmailEmailPassword).sendKeys(gmailPasswrd);
        wait.until(ExpectedConditions.presenceOfElementLocated((next)));
        driver.findElement(next).click();
        driver.switchTo().window(winHandleBefore);
    }

    public void popUpLogin(String popUpmail,String popUpPwrd) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUPFBEmailField)));
        driver.findElement(popupLoginEmailField).sendKeys(popUpmail);
        wait.until(ExpectedConditions.presenceOfElementLocated((popupLoginPasswordField)));
        driver.findElement(popupLoginPasswordField).sendKeys(popUpPwrd);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUpLoginSubmitButton)));
        driver.findElement(popUpLoginSubmitButton).click();
    }

    public void ClickfacebookLoginButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((fbLoginButton)));
        driver.findElement(fbLoginButton).click();
    }

    public void fbcredentials(String fbEmail,String fbPasswrd) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        // Store the current window handle
        String winHandleBefore = driver.getWindowHandle();

        // Perform the click operation that opens new window

        // Switch to new window opened
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        // Perform the actions on new window
        driver.findElement(fbEmailField).sendKeys(fbEmail);
        wait.until(ExpectedConditions.presenceOfElementLocated((fbPasswordField)));
        driver.findElement(fbPasswordField).sendKeys(fbPasswrd);
        wait.until(ExpectedConditions.presenceOfElementLocated((fbLoginConfirmButton)));
        driver.findElement(fbLoginConfirmButton).click();
        driver.switchTo().window(winHandleBefore);
        }

    public void popUPGmailLogin() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(popUpGmailButton).click();
        }

    public void clickPopUPFBButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUPFBButton)));
        driver.findElement(popUPFBButton).click();
        }

    public void popUpFbLogin(String fbEmail,String fbPasswrd) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(popUPFBButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((popUPFBEmailField)));
        String winHandleBefore = driver.getWindowHandle();
        // Switch to new window opened
            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }
            // Perform the actions on new window
            driver.findElement(popUPFBEmailField).sendKeys(fbEmail);
            wait.until(ExpectedConditions.presenceOfElementLocated((popUPFBPassField)));
            driver.findElement(popUPFBPassField).sendKeys(fbPasswrd);
            wait.until(ExpectedConditions.presenceOfElementLocated((popUPFBSigninButton)));
            driver.findElement(popUPFBSigninButton).click();
            driver.switchTo().window(winHandleBefore);
        }
    public void logout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.findElement(loginProfileButton).click();
        Thread.sleep(10000);
        driver.findElement(logoutButton).click();
        }

    }

