package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By clickHomeIcon= By.xpath("//img[@alt='Hateemtai Logo']");
    private LoginPage loginPage;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void homeScreen() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(clickHomeIcon).click();
    }

    public String getPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public boolean verifyHomePageTitle() {
        String expectedPageTitle = "Hateemtai.com | Buy & Sell Worldwide";
        return getPageTitle().contains(expectedPageTitle);
    }


}
