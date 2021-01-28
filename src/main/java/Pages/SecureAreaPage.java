package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert = By.xpath("//*[@id='ddlProduct']/a");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        String expectedResult=" MY ACCOUNT";

        return driver.findElement(statusAlert).getText();
    }
}
