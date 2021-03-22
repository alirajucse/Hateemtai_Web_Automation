package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
    private By checkout= By.xpath("//button[normalize-space()='Checkout']");
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

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void productAddtoCart() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(FirstMenuItem).click();
        Thread.sleep(10000);
        driver.findElement(product).click();
        Thread.sleep(10000);
        driver.findElement(addToCart).click();
        Thread.sleep(2000);
        driver.findElement(cartIcon).click();
        Thread.sleep(7000);
        driver.findElement(checkout).click();
    }
    public void checkoutViaCartDetails() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(FirstMenuItem).click();
        Thread.sleep(10000);
        driver.findElement(product).click();
        Thread.sleep(10000);
        driver.findElement(addToCart).click();
        Thread.sleep(2000);
        driver.findElement(cartIcon).click();
        Thread.sleep(7000);
        driver.findElement(viewCart).click();
        Thread.sleep(8000);
        driver.findElement(checkoutFromViewCart).click();
    }
    public void productAddToCartFromQuickView() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(FirstMenuItem).click();
        Thread.sleep(15000);
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(product);
        builder.moveToElement(element).build().perform();
        Thread.sleep(3000);
        driver.findElement(quickView).click();
        Thread.sleep(15000);
        driver.findElement(quickViewAddToCartButton).click();
        Thread.sleep(4000);
        driver.findElement(quickViewPopUpCloseButton).click();
        Thread.sleep(15000);
        driver.findElement(cartIcon).click();
        Thread.sleep(7000);
        driver.findElement(quickViewCheckoutButtton).click();
    }

    public void checkoutMethod() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(paymentMethodCashOnDelivary).click();
        Thread.sleep(10000);
        driver.findElement(placeOrder).click();
        Thread.sleep(15000);
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
        Thread.sleep(20000);
        driver.findElement(popUPFBButton).click();
    }
    public void gmailPopUpCheckout() throws InterruptedException {
        Thread.sleep(20000);
        driver.findElement(popUpGmailButton).click();
    }
    public void popUPSignUPCheckoutShippingAddress(String name,String address,String phone,String zipcode) throws InterruptedException {
        Thread.sleep(15000);
        if(driver.findElement(shippngAddressName).isDisplayed()) {
            driver.findElement(shippngAddressName).sendKeys(name);
        }
        else{
            System.out.println("Shipping address name element not found");
        }
        Thread.sleep(5000);
        if(driver.findElement(shippngAddressLine1).isDisplayed()) {
            driver.findElement(shippngAddressLine1).sendKeys(address);
        }
        else{
            System.out.println("Shipping address address line 1 element not found");
        }
        Thread.sleep(4000);
        if(driver.findElement(shippngAddressState).isDisplayed()) {
            driver.findElement(shippngAddressState).click();
        }
        else{
            System.out.println("Shipping address state element not found");
        }
        Thread.sleep(7000);
        if(driver.findElement(By.tagName("Dhaka")).isDisplayed()){
            driver.findElement(shippingAddressStateValue).click();
        }
        else{
            System.out.println("Shipping address state name element not found");
        }
        Thread.sleep(5000);
        if(driver.findElement(shippingAddressPhoneNumber).isDisplayed()) {
            driver.findElement(shippingAddressPhoneNumber).sendKeys(name);
        }
        else{
            System.out.println("Shipping address phone number element not found");
        }
        Thread.sleep(5000);
        if(driver.findElement(shippingAddressZipcode).isDisplayed()) {
            driver.findElement(shippingAddressZipcode).sendKeys(zipcode);
        }
        else{
            System.out.println("Shipping address zipcode element not found");
        }
        Thread.sleep(3000);
        if(driver.findElement(shippingAddressSave).isDisplayed()) {
            driver.findElement(shippingAddressZipcode).click();
        }
        else{
            System.out.println("Shipping address save element not found");
        }
    }
}
