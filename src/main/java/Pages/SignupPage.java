package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

    private WebDriver driver;
    private By signuplink=By.xpath("//a[contains(text(),'SIGN UP')]");
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

    public SignupPage(WebDriver driver){
        this.driver = driver;
    }

    public void signUpLinkClick() throws InterruptedException {
        Thread.sleep(50000);
        driver.findElement(signuplink).click();
    }

    public void signUPInformationInputMethod(String username,String email,String password,String phone) throws InterruptedException {

        Thread.sleep(60000);
        driver.findElement(usernameField).sendKeys(username);
        Thread.sleep(10000);
        driver.findElement(emailField).sendKeys(email);
        Thread.sleep(10000);
        driver.findElement(passwordField).sendKeys(password);
        Thread.sleep(10000);
        driver.findElement(phonenumberField).sendKeys(phone);
        Thread.sleep(10000);
    }

    public void signUPFinalProcessMethod() throws InterruptedException {

        driver.findElement(agreeCheckbox).click();
        Thread.sleep(20000);
        driver.findElement(signupButton).click();
    }

    public void successfulSignUPVerify(){

    }

}
