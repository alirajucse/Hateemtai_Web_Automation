package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    private By cartIcon= By.xpath("//img[@src='./img/cartIcon.png']");
    private By quickViewCheckoutButtton= By.xpath("//a[normalize-space()='Checkout']");
    private By checkout= By.xpath("//a[@href='/checkout']");
    private By viewCart= By.xpath("//a[normalize-space()='View Cart']");
    private By checkoutFromViewCart= By.xpath("//a[@href='/checkout']");
    private By paymentMethodCashOnDelivary= By.xpath("//label[normalize-space()='Cash on Delivery']");
    private By placeOrder= By.xpath("//body//div[@id='root']//form//div//button[1]");
    private By successfulOrderMessage= By.xpath("//p[normalize-space()='Your Order has been successfully processed.']");
    private By popUPFBButton=By.xpath("//body/div[@role='dialog']/div[@role='dialog']/div/div[@role='document']/div/div/div/div/p/span/button[1]");
    private By popUpGmailButton= By.xpath("//body/div[@role='dialog']/div[@role='dialog']/div/div[@role='document']/div/div/div/div/p/button[1]");
    private By shippngAddressName= By.xpath("//input[@placeholder='Enter Your Full Name']");
    private By shippngAddressLine1= By.xpath("//input[@placeholder='Area, Street address, P.O. box, Company, C/O']");
    private By shippngAddressState= By.xpath("//body/div/div/div/div/div/div/div/form/div/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]");
    //private By shippingAddressStateValue= By.linkText("Dhaka");
    private By shippngAddressCity= By.xpath("//body/div/div/div/div/div/div/div/form/div/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]");
    private By shippingAddressPhoneNumber= By.xpath("//input[@placeholder='Phone Number']");
    private By shippingAddressZipcode= By.xpath("//input[@placeholder='ZIP Code/Postal Code']");
    private By shippingAddressSave= By.xpath("//button[normalize-space()='Save']");
    private By quickView= By.xpath("//body//div//div//div//div//div//div//div//div//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]");
    private By quickViewAddToCartButton= By.xpath("//div[@role='document']//div//div//div//div//div//div//div//button[contains(text(),'add to cart')]");
    private By quickViewPopUpCloseButton= By.xpath("//span[@aria-hidden='true']");
    private By shippingAddressStateValue  = By.xpath("//*[text()=’Dhaka’]");
    private By confirmButton= By.xpath("//span[normalize-space()='Confirm']");
    private By cashOnDeliveryMethod= By.xpath("//label[normalize-space()='Cash on Delivery']");
    private By placeOrderButton= By.xpath("//button[normalize-space()='Place Order']");


    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void productAddtoCart() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((FirstMenuItem)));
        driver.findElement(FirstMenuItem).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((product)));
        driver.findElement(product).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((addToCart)));
        driver.findElement(addToCart).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((cartIcon)));
        driver.findElement(cartIcon).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((product)));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        wait.until(ExpectedConditions.presenceOfElementLocated((checkout)));
        driver.findElement(checkout).click();
    }
    public void checkoutViaCartDetails() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((FirstMenuItem)));
        driver.findElement(FirstMenuItem).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((product)));
        driver.findElement(product).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((addToCart)));
        driver.findElement(addToCart).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((cartIcon)));
        driver.findElement(cartIcon).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((viewCart)));
        driver.findElement(viewCart).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((checkoutFromViewCart)));
        driver.findElement(checkoutFromViewCart).click();
    }
    public void productAddToCartFromQuickView() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((FirstMenuItem)));
        driver.findElement(FirstMenuItem).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((product)));
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(product);
        builder.moveToElement(element).build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated((quickView)));
        driver.findElement(quickView).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((quickViewAddToCartButton)));
        driver.findElement(quickViewAddToCartButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((quickViewPopUpCloseButton)));
        driver.findElement(quickViewPopUpCloseButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((cartIcon)));
        driver.findElement(cartIcon).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((quickViewCheckoutButtton)));
        driver.findElement(quickViewCheckoutButtton).click();
    }

    public void checkoutMethod() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((confirmButton)));
        driver.findElement(confirmButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((cashOnDeliveryMethod)));
        driver.findElement(cashOnDeliveryMethod).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((placeOrderButton)));
        driver.findElement(placeOrderButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((successfulOrderMessage)));
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
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUPFBButton)));
        driver.findElement(popUPFBButton).click();
    }
    public void gmailPopUpCheckout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((popUpGmailButton)));
        driver.findElement(popUpGmailButton).click();
    }
    public void popUPSignUPCheckoutShippingAddress(String name,String address,String phone,String zipcode) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((shippngAddressName)));
        driver.findElement(shippngAddressName).isDisplayed();
        driver.findElement(shippngAddressName).sendKeys(name);
        wait.until(ExpectedConditions.presenceOfElementLocated((shippngAddressLine1)));
        driver.findElement(shippngAddressLine1).isDisplayed();
        driver.findElement(shippngAddressLine1).sendKeys(address);
        wait.until(ExpectedConditions.presenceOfElementLocated((shippngAddressState)));
        driver.findElement(shippngAddressState).isDisplayed();
        driver.findElement(shippngAddressState).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((shippingAddressStateValue)));
        driver.findElement(By.tagName("Dhaka")).isDisplayed();
        driver.findElement(shippingAddressStateValue).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((shippingAddressPhoneNumber)));
        driver.findElement(shippingAddressPhoneNumber).isDisplayed();
        driver.findElement(shippingAddressPhoneNumber).sendKeys(name);
        wait.until(ExpectedConditions.presenceOfElementLocated((shippingAddressZipcode)));
        driver.findElement(shippingAddressZipcode).isDisplayed();
        driver.findElement(shippingAddressZipcode).sendKeys(zipcode);
        wait.until(ExpectedConditions.presenceOfElementLocated((shippingAddressSave)));
        driver.findElement(shippingAddressSave).isDisplayed();
        driver.findElement(shippingAddressZipcode).click();
    }
}
