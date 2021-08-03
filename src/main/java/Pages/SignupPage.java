package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage {

    private WebDriver driver;
    private By signuplink=By.xpath("//header//li[3]//a[1]");
    private By usernameField = By.xpath("//body/div/div/div/div/div/div/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]");
    private By emailField = By.xpath("//div[@id='signuptab-pane-first']//div[2]//div[2]//div[1]//input[1]");
    private By passwordField = By.xpath("//body//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[2]//div[1]//input[1]");
    private By phonenumberField =By.xpath("//body//div//div//div//div//div//div//div//div//div//div[2]//div[2]//input[1]");
    private By agreeCheckbox=By.xpath("//input[@name='agree']");
    private By signupButton= By.xpath("//div[@id='signuptab-pane-first']//form//div//div//button[@type='submit']");
    private By email= By.xpath("//input[@id='identifierId']");
    private By next= By.xpath("//div[@id='identifierNext']//div[2]");
    private By password= By.xpath("//input[@name='password']");
    private By invalidLoginCredentialsCheck= By.xpath("//strong[normalize-space()='Invalid username or password.']");
    private By popUPSignup= By.xpath("//div[normalize-space()='SIGN UP']");
    private By popUpUserName=By.xpath("//input[@name='firstName']");
    private By popUPEmail= By.xpath("//div[@role='document']//div//div//div//form//div//input[@name='email']");
    private By popUPPhoneNUmber= By.xpath("//input[@name='mobilePhone']");
    private By popUPPassword= By.xpath("//input[@name='password']");
    private By popUPAgreeCheckbox= By.xpath("//label[@for='terms']//span");
    private By popUPSignUPButton= By.xpath("//div[@role='dialog']//div[7]//button[1]");
    private By signUPVerify = By.id("ddlProduct");
    private By existingUserSignUpCheck= By.xpath("//div[@role='tabpanel']//div[2]//div[2]//div[1]//span[1]");


    public SignupPage(WebDriver driver){

        this.driver = driver;
    }

    public void signUpLinkClick() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(signuplink));
        driver.findElement(signuplink).click();
    }

    public void signUPInformationInputMethod(String username,String email,String password,String phone) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((usernameField)));
        driver.findElement(usernameField).sendKeys(username);
        wait.until(ExpectedConditions.presenceOfElementLocated((emailField)));
        driver.findElement(emailField).sendKeys(email);
        wait.until(ExpectedConditions.presenceOfElementLocated((passwordField)));
        driver.findElement(passwordField).sendKeys(password);
        wait.until(ExpectedConditions.presenceOfElementLocated((phonenumberField)));
        driver.findElement(phonenumberField).sendKeys(phone);
    }

    public void signUPFinalProcessMethod() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((agreeCheckbox)));
        driver.findElement(agreeCheckbox).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((signupButton)));
        driver.findElement(signupButton).click();
    }

    public void successfulSignUPVerify() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((signUPVerify)));
        Boolean signUpVerify= driver.findElement(signUPVerify).isDisplayed();
        if(signUpVerify){
            System.out.println("Sign up successful");
        }
        else{
            System.out.println("Sign up failed");
        }

    }
    public void clickPopUPSignupButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUPSignup)));
        if(driver.findElement(popUPSignup).isDisplayed()){
            driver.findElement(popUPSignup).click();
        }
        else {
            System.out.println("Pop up sign up button element not found");
        }
    }
    public void popUPSignUPCredentials(String usrName,String email,String phone,String passwrd) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUpUserName)));
        driver.findElement(popUpUserName).sendKeys(usrName);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUPEmail)));
        driver.findElement(popUPEmail).sendKeys(email);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUPPhoneNUmber)));
        driver.findElement(popUPPhoneNUmber).sendKeys(phone);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUPPassword)));
        driver.findElement(popUPPassword).sendKeys(passwrd);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUPAgreeCheckbox)));
        driver.findElement(popUPAgreeCheckbox).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((popUPSignUPButton)));
        driver.findElement(popUPSignUPButton).click();
    }
    public void existingUserSignUpCheck() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((existingUserSignUpCheck)));
        if(driver.findElement(existingUserSignUpCheck).isDisplayed()){
            System.out.println("Test case passed");
        }
        else {
            System.out.println("Test case failed");
        }
    }
}
