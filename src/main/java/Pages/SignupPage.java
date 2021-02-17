package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
        Thread.sleep(15000);
        driver.findElement(signuplink).click();
    }

    public void signUPInformationInputMethod(String username,String email,String password,String phone) throws InterruptedException {

        Thread.sleep(20000);
        driver.findElement(usernameField).sendKeys(username);
        Thread.sleep(3000);
        driver.findElement(emailField).sendKeys(email);
        Thread.sleep(4000);
        driver.findElement(passwordField).sendKeys(password);
        Thread.sleep(3000);
        driver.findElement(phonenumberField).sendKeys(phone);
        Thread.sleep(3000);
    }

    public void signUPFinalProcessMethod() throws InterruptedException {

        driver.findElement(agreeCheckbox).click();
        Thread.sleep(20000);
        driver.findElement(signupButton).click();
    }

    public void successfulSignUPVerify() throws InterruptedException {
        Thread.sleep(20000);
        Boolean signUpVerify= driver.findElement(signUPVerify).isDisplayed();
        if(signUpVerify){
            System.out.println("Sign up successful");
        }
        else{
            System.out.println("Sign up failed");
        }

    }
    public void clickPopUPSignupButton() throws InterruptedException {
        Thread.sleep(15000);
        if(driver.findElement(popUPSignup).isDisplayed()){
            driver.findElement(popUPSignup).click();
        }
        else {
            System.out.println("Pop up sign up button element not found");
        }
    }
    public void popUPSignUPCredentials(String usrName,String email,String phone,String passwrd) throws InterruptedException {
        Thread.sleep(5000);
        if(driver.findElement(popUpUserName).isDisplayed()){
            driver.findElement(popUpUserName).sendKeys(usrName);
        }
        else{
            System.out.println("Pop up user name input element not found");
        }
        Thread.sleep(2000);
        if(driver.findElement(popUPEmail).isDisplayed()){
            driver.findElement(popUPEmail).sendKeys(email);
        }
        else{
            System.out.println("Pop up email input element not found");
        }
        Thread.sleep(2000);
        if(driver.findElement(popUPPhoneNUmber).isDisplayed()){
            driver.findElement(popUPPhoneNUmber).sendKeys(phone);
        }
        else{
            System.out.println("Pop up phone number element not found");
        }
        Thread.sleep(2000);
        if(driver.findElement(popUPPassword).isDisplayed()){
            driver.findElement(popUPPassword).sendKeys(passwrd);
        }
        else{
            System.out.println("Pop up password element not found");
        }
        Thread.sleep(3000);
        if(driver.findElement(popUPAgreeCheckbox).isDisplayed()){
            driver.findElement(popUPAgreeCheckbox).click();
        }
        else{
            System.out.println("Pop up agree checkbox element not found");
        }
        Thread.sleep(4000);
        if(driver.findElement(popUPSignUPButton).isDisplayed()){
            driver.findElement(popUPSignUPButton).click();
        }
        else{
            System.out.println("Pop up sign up button not found");
        }
    }
    public void existingUserSignUpCheck() throws InterruptedException {
        Thread.sleep(15000);
        if(driver.findElement(existingUserSignUpCheck).isDisplayed()){
            System.out.println("Test case passed");
        }
        else {
            System.out.println("Test case failed");
        }
    }
}
