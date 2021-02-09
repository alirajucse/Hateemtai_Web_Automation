package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CountrySwitchPage {

    private WebDriver driver;
    private By clickCountryIcon= By.xpath("//body//div//div//header//div//div//ul//li//span");
    private By switchToUSA= By.xpath("//span[contains(text(),'United States of America')]");
    private By switchToBDView= By.xpath("//span[contains(text(),'Bangladesh')]");
    private By currencyDropdown= By.xpath("//select[@name='currency']");
    private By currencyUSD= By.tagName(" $ USD");
    private By currencyBDT= By.tagName(" ৳ BDT");
    private By saveButton= By.xpath("//input[@value='Save']");

    public CountrySwitchPage(WebDriver driver){
        this.driver=driver;
    }

    public void switchToUSAViewMethod() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(clickCountryIcon).click();
        Thread.sleep(8000);
        driver.findElement(switchToUSA).click();
        Thread.sleep(5000);
        //  driver.findElement(currencyDropdown).click();
        //  Thread.sleep(6000);
        WebElement element = driver.findElement(currencyDropdown);
        Select select = new Select(element);
        select.selectByVisibleText(" $ USD");
        //driver.findElement(currencyUSD).click();
        Thread.sleep(4000);
        driver.findElement(saveButton).click();
        Thread.sleep(10000);
        }
    public void switchToBDViewMethod() throws InterruptedException {
        Thread.sleep(20000);
        driver.findElement(clickCountryIcon).click();
        Thread.sleep(8000);
        driver.findElement(switchToBDView).click();
        Thread.sleep(5000);
        //  driver.findElement(currencyDropdown).click();
        //  Thread.sleep(6000);
        WebElement element = driver.findElement(currencyDropdown);
        Select select = new Select(element);
        select.selectByVisibleText(" ৳ BDT");
        //driver.findElement(currencyUSD).click();
        Thread.sleep(4000);
        driver.findElement(saveButton).click();
        Thread.sleep(10000);
        }
    }


