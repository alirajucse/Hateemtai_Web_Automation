package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBMessengerPage {
    private WebDriver driver;
    private By iframeElementI = By.name("f4aaa88c83ff6c");
    private By chatAsGuest= By.xpath("//body");
    private By chatText= By.xpath("//body");

    public FBMessengerPage(WebDriver driver){
        this.driver=driver;
    }

    public void chatWithoutLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Total Frames --" + size);

        driver.switchTo().frame(0); //switching the frame by name
       // driver.switchTo().frame(1);
        driver.findElement(chatAsGuest).click();
        System.out.println("********We are switch to the iframe*******");
       // driver.findElement(By.xpath("html/body/a/img")).click();
        //Clicks the iframe

      //  System.out.println("*********We are done***************");
   // driver.findElement(chatAsGuest).click();
        // driver.findElement(chatText).sendKeys(msg);

    }
}
