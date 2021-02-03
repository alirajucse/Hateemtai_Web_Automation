package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    private WebDriver driver;
    private By myAccount= By.xpath("//a[normalize-space()='MY ACCOUNT']");
    private By myProfile= By.xpath("//a[normalize-space()='My Profile']");
    private By myOrder= By.xpath("//a[normalize-space()='My Orders']");
    private By corporateSale= By.xpath("//a[normalize-space()='Corporate Sale']");
    private By corporateSalePriceRequest= By.xpath("//a[normalize-space()='Be a Corporate Client']");

    public MyAccountPage(WebDriver driver){
        this.driver= driver;
    }

    public void myAccountHomePage() throws InterruptedException {
        Thread.sleep(20000);
        driver.findElement(myAccount).click();
        Thread.sleep(3000);
    }
    public void myProfileSection() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(myProfile).click();
        Thread.sleep(5000);
    }
    public void myOrder() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(myOrder).click();
        Thread.sleep(3000);
    }
    public void corporateSaleSection() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(corporateSale).click();
        Thread.sleep(4000);
        if(driver.findElement(corporateSalePriceRequest).isEnabled()){
            driver.findElement(corporateSalePriceRequest).click();
        }
        else{
            System.out.println("Already corporate customer");
        }
    }
}
