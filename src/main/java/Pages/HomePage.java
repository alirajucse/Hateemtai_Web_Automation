package Pages;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
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
