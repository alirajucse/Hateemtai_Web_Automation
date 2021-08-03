package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((clickCountryIcon)));
        driver.findElement(clickCountryIcon).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((switchToUSA)));
        driver.findElement(switchToUSA).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((currencyDropdown)));
        //  driver.findElement(currencyDropdown).click();
        //  Thread.sleep(6000);
        WebElement element = driver.findElement(currencyDropdown);
        Select select = new Select(element);
        select.selectByVisibleText(" $ USD");
        //driver.findElement(currencyUSD).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((saveButton)));
        driver.findElement(saveButton).click();
        }
    public void switchToBDViewMethod() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated((clickCountryIcon)));
        driver.findElement(clickCountryIcon).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((switchToBDView)));
        driver.findElement(switchToBDView).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((currencyDropdown)));
        //  driver.findElement(currencyDropdown).click();
        //  Thread.sleep(6000);
        WebElement element = driver.findElement(currencyDropdown);
        Select select = new Select(element);
        select.selectByVisibleText(" ৳ BDT");
        //driver.findElement(currencyUSD).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((saveButton)));
        driver.findElement(saveButton).click();
        }
    }


