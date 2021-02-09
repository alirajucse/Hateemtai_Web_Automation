package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class CategoryPage {

    private WebDriver driver;
    private By groceryCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'Mustard Seed (Red) 100 gm')]");
    private By FirstMenuItem=By.xpath("//body/div[@id='root']/div/div/div/div/div/div[@id='responsive-nav']/ul[@id='dropdown-menu']/li[1]/a[1]");
    private By clickCategoryMobileTablet = By.xpath("//body/div/div/div/div/div/div/div/ul[@role='menu']/li[2]/a[1]");
    private By mobileTabletCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'Prooton Screen Protector-RED MI 5')]");
    private By computerAccesoriesCategory= By.xpath("//body/div/div/div/div/div/div/div/ul[@role='menu']/li[3]/a[1]");
    private By computerAccesoriesCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'Transcend V-790W 32GB USB.3.1 White Pen Drive TS32')]");
    private By consumerElectronicsCategory= By.xpath("//body/div/div/div/div/div/div/div/ul[@role='menu']/li[4]/a[1]");
    private By consumerElectronicsCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'Single SS Auto GS LPG A-102 805073')]");
    private By entertaintmentGamingCategory= By.xpath("//body/div/div/div/div/div/div/div/ul[@role='menu']/li[5]/a[1]");
    private By entertaintmentCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'Sony DSC-W800 Silver Digital Camera')]");
    private By healthBeautyCategory= By.xpath("//body/div/div/div/div/div/div/div/ul[@role='menu']/li[6]/a[1]");
    private By healthBeautyCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'Lux Soap Bar Sensuous Sandal 125 gm')]");
    private By womenFashionCategory= By.xpath("//body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]");
    private By womenFashionCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'Red Check Patch Work Half Silk Saree')]");
    private By menFashionCategory= By.xpath("//body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/a[1]");
    private By menFashionCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'White Printed Cotton Short Kurta')]");
    private By wholesaleTradeCategory= By.xpath("//body/div/div/div/div/div/div/div/ul[@role='menu']/li[9]/a[1]");
    private By wholesaleCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'StitchGreen LADIES GLITTER T-SHIRT (For Wholesale)')]");
    private By stationaryOfficeSuppliesCategory= By.xpath("//body/div/div/div/div/div/div/div/ul[@role='menu']/li[10]/a[1]");
    private By stationaryOfficeSuppliesCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'Diamond Binder Clip Black 19 mm (Pack of 12)')]");
    private By moreCategories= By.xpath("//a[normalize-space()='More Categories']");

    public CategoryPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickGroceriesCategory() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(FirstMenuItem).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(1500);
        if(driver.findElement(groceryCategoryProduct).isDisplayed()) {
            System.out.println("Product found");
            System.out.println("Test case passed");
        }
        else{
           System.out.println("Menu item not found");
           System.out.println("Test case failed");
        }
    }
    public void clickMobileTabletCategory() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(clickCategoryMobileTablet).click();
        Thread.sleep(15000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(40000);
        if(driver.findElement(mobileTabletCategoryProduct).isDisplayed()) {
            System.out.println("Product found");
            System.out.println("Test case passed");
        }
        else{
            System.out.println("Menu item not found");
            System.out.println("Test case failed");
        }
    }
    public void clickComputerAccesoriesCategory() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(computerAccesoriesCategory).click();
        Thread.sleep(15000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(40000);
        if(driver.findElement(computerAccesoriesCategoryProduct).isDisplayed()) {
            System.out.println("Product found");
            System.out.println("Test case passed");
        }
        else{
            System.out.println("Menu item not found");
            System.out.println("Test case failed");
        }
    }
    public void clickConsumerElectronicsCategory() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(consumerElectronicsCategory).click();
        Thread.sleep(15000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(40000);
        if(driver.findElement(consumerElectronicsCategoryProduct).isDisplayed()) {
            System.out.println("Product found");
            System.out.println("Test case passed");
        }
        else{
            System.out.println("Menu item not found");
            System.out.println("Test case failed");
        }
    }
    public void clickEntertaintmentCategory() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(entertaintmentGamingCategory).click();
        Thread.sleep(15000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(40000);
        if(driver.findElement(entertaintmentCategoryProduct).isDisplayed()) {
            System.out.println("Product found");
            System.out.println("Test case passed");
        }
        else{
            System.out.println("Menu item not found");
            System.out.println("Test case failed");
        }
    }
    public void clickHealthBeautyCategory() throws InterruptedException, AWTException {
        Thread.sleep(15000);
        driver.findElement(healthBeautyCategory).click();
        Thread.sleep(15000);
        //Robot robot = new Robot();
       // robot.keyPress(KeyEvent.VK_PAGE_DOWN);
       // Thread.sleep(30000);
       // robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(40000);
        if(driver.findElement(healthBeautyCategoryProduct).isDisplayed()) {
            System.out.println("Product found");
            System.out.println("Test case passed");
        }
        else{
            System.out.println("Menu item not found");
            System.out.println("Test case failed");
        }
    }
    public void womenFashionCategory() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(womenFashionCategory).click();
        Thread.sleep(15000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(40000);
        if(driver.findElement(womenFashionCategoryProduct).isDisplayed()) {
            System.out.println("Product found");
            System.out.println("Test case passed");
        }
        else{
            System.out.println("Menu item not found");
            System.out.println("Test case failed");
        }
    }
    public void menFashionCategory() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(menFashionCategory).click();
        Thread.sleep(15000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(40000);
        if(driver.findElement(menFashionCategoryProduct).isDisplayed()) {
            System.out.println("Product found");
            System.out.println("Test case passed");
        }
        else{
            System.out.println("Menu item not found");
            System.out.println("Test case failed");
        }
    }
    public void wholesaleTrade() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(wholesaleTradeCategory).click();
        Thread.sleep(15000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(40000);
        if(driver.findElement(wholesaleCategoryProduct).isDisplayed()) {
            System.out.println("Product found");
            System.out.println("Test case passed");
        }
        else{
            System.out.println("Menu item not found");
            System.out.println("Test case failed");
        }
    }
    public void stationaryOfficeSupplies() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(stationaryOfficeSuppliesCategory).click();
        Thread.sleep(15000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(40000);
        if(driver.findElement(stationaryOfficeSuppliesCategoryProduct).isDisplayed()) {
            System.out.println("Product found");
            System.out.println("Test case passed");
        }
        else{
            System.out.println("Menu item not found");
            System.out.println("Test case failed");
        }
    }
    public void moreCaterories() throws InterruptedException {
        Thread.sleep(15000);
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(moreCategories)).
        build().perform();
        Thread.sleep(5000);
        System.out.println("Test case passed");
    }
}


