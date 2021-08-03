package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccountPage {
    private WebDriver driver;
    private By myAccount= By.xpath("//a[normalize-space()='MY ACCOUNT']");
    private By myProfile= By.xpath("//a[normalize-space()='My Profile']");
    private By myOrder= By.xpath("//a[normalize-space()='My Orders']");
    private By corporateSale= By.xpath("//a[normalize-space()='Corporate Sale']");
    private By corporateSalePriceRequest= By.xpath("//a[normalize-space()='Be a Corporate Client']");
    private By orderAmount= By.xpath("//span[normalize-space()='430.00']");

    public MyAccountPage(WebDriver driver){
        this.driver= driver;
    }

    public void myAccountHomePage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((myAccount)));
        driver.findElement(myAccount).click();
    }
    public void myProfileSection() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((myProfile)));
        driver.findElement(myProfile).click();
    }
    public void myOrder() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((myOrder)));
        driver.findElement(myOrder).click();
        String amount=driver.findElement(orderAmount).getText();
        //float orderAmountVerify=Float.parseFloat(amount);
        System.out.println(amount);
    }
    public void corporateSaleSection() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((corporateSale)));
        driver.findElement(corporateSale).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((corporateSalePriceRequest)));
        if(driver.findElement(corporateSalePriceRequest).isEnabled()){
            driver.findElement(corporateSalePriceRequest).click();
        }
        else{
            System.out.println("Already corporate customer");
        }
    }
}
