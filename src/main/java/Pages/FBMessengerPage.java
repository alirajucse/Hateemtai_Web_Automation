package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBMessengerPage {
    private WebDriver driver;
    private By chatAsGuest= By.xpath("//html//body");
    private By chatText= By.xpath("//body");
    public FBMessengerPage(WebDriver driver){
        this.driver=driver;
    }

    public void chatWithoutLogin(String msg) throws InterruptedException {
        Thread.sleep(15000);
    driver.findElement(chatAsGuest).click();
    driver.findElement(chatText).sendKeys(msg);
    }
}
