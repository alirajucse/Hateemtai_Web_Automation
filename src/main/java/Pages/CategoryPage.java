package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {

    private WebDriver driver;
    private By groceryCategoryProduct= By.xpath("//div[@aria-hidden='false']//div//div//div//div//div//a[contains(text(),'Mustard Seed (Red) 100 gm')]");
    private By FirstMenuItem=By.xpath("//body/div[@id='root']/div/div/div/div/div/div[@id='responsive-nav']/ul[@id='dropdown-menu']/li[1]/a[1]");
    private By clickCategoryMobileTablet = By.xpath("//body/div/div/div/div/div/div/div/ul[@role='menu']/li[2]/a[1]");

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGroceriesCategory() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(FirstMenuItem).click();
        Thread.sleep(15000);
        if(driver.findElement(FirstMenuItem).isDisplayed()) {
         //   System.out.println("Menu item found");
            driver.findElement(FirstMenuItem).click();
        }
        else{
           System.out.println("Menu item not found");
        }
      //  JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("window.scrollBy(0,-350)", "");
      //  if(driver.findElement(groceryCategoryProduct).isDisplayed()) {
      //      System.out.println("Product Found");
      //  } else {
      //      System.out.println("Product is not found");
      //  }
      //  Thread.sleep(5000);
    }
}


