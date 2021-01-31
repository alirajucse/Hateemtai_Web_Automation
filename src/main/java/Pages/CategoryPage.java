package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CategoryPage {

    private WebDriver driver;
    private By groceryCategory=By.xpath("//body/div[@id='root']/div/div/div/div/div/div[@id='responsive-nav']/ul[@id='dropdown-menu']/li[1]/a[1]");
    private By groceryCategoryProduct= By.xpath("//body[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[52]/div[1]/a[1]/div[1]/div[1]");
    private By clickCategoryMobileTablet= By.xpath("//body/div/div/div/div/div/div/div/ul[@role='menu']/li[2]/a[1]");

    public CategoryPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickGroceriesCategory() throws InterruptedException {
        Thread.sleep(15000);
        driver.findElement(groceryCategory).click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView();", groceryCategoryProduct);
        if(driver.findElement(groceryCategoryProduct).isDisplayed())
        {
            System.out.println("Product Found");
        }
        else {
            System.out.println("Product is not found");
        }
        Thread.sleep(5000);
    }

}
