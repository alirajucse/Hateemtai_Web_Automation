package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

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
    private By FirstMenuItem=By.xpath("//body/div[@id='root']/div/div/div/div/div/div[@id='responsive-nav']/ul[@id='dropdown-menu']/li[1]/a[1]");
    private By product= By.xpath("//body//div[@id='root']//div[@id='store']//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]");
    private By addToCart= By.xpath("//button[normalize-space()='add to cart']");
    private By cart= By.xpath("//img[@src='./img/cartIcon.png']");
    private By checkout= By.xpath("//html//body//div//div//header//div//div//div//div//div//div//div//ul//div//div//div//div//div//button");
    private By paymentMethodCashOnDelivary= By.xpath("//label[normalize-space()='Cash on Delivery']");
    private By placeOrder= By.xpath("//body//div[@id='root']//form//div//button[1]");
    private By successfulOrderMessage= By.xpath("//p[normalize-space()='Your Order has been successfully processed.']");
    private By popUPFBButton=By.xpath("//body/div/div/div/div/div/div/div/div/p/span/button[1]");

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void productAddtoCart() throws InterruptedException {
        Thread.sleep(50000);
        driver.findElement(FirstMenuItem).click();
        Thread.sleep(40000);
        driver.findElement(product).click();
        Thread.sleep(40000);
        driver.findElement(addToCart).click();
        Thread.sleep(2000);
        driver.findElement(cart).click();
        Thread.sleep(30000);
        driver.findElement(checkout).click();
    }

    public void checkoutMethod() throws InterruptedException {
        Thread.sleep(50000);
        driver.findElement(paymentMethodCashOnDelivary).click();
        Thread.sleep(10000);
        driver.findElement(placeOrder).click();
        Thread.sleep(40000);
       // String expectedResult= "Your Order has been successfully processed.";
       // String actualResult= driver.findElement(successfulOrderMessage).getText();
       // Assert.assertEquals(expectedResult,actualResult);
        Boolean checkoutVerify= driver.findElement(successfulOrderMessage).isDisplayed();
        if(checkoutVerify)
        {
            System.out.println("Checkout successful");
        }
        else
        {
            System.out.println("Checkout failed");
        }
    }
    public void fbPopUpCheckout() throws InterruptedException {
        Thread.sleep(40000);
        driver.findElement(popUPFBButton).click();
    }

}
