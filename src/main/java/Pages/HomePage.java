package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText(" LOG IN");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() throws InterruptedException {
        Thread.sleep(100000);
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
