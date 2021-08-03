package Tests;
import Base.TestBase;
import Pages.CategoryPage;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class CategoryTest extends TestBase{
    private WebDriver driver;
    private CategoryPage categoryPage;
    private HomePage homePage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = getDriver();
        categoryPage=new CategoryPage(driver);
    }
    @Test(priority = 1,groups = { "smoke" })
    public void groceriesCategoryTest() throws InterruptedException {
      categoryPage.clickGroceriesCategory();
    }

    @Test(priority = 3,groups = { "smoke" })
    public void mobileTabletCategoryProductTest() throws InterruptedException {
        categoryPage.clickMobileTabletCategory();
    }
    @Test(priority = 4,groups = { "smoke" })
    public void computerAccessoriesCategoryTest() throws InterruptedException {
        categoryPage.clickComputerAccesoriesCategory();
    }
    @Test(priority = 5,groups = { "smoke" })
    public void consumerElectronicsCategoryTest() throws InterruptedException {
        categoryPage.clickConsumerElectronicsCategory();
    }
    @Test(priority = 6,groups = { "smoke" })
    public void entertaintmentCategoryTest() throws InterruptedException {
        categoryPage.clickEntertaintmentCategory();
    }
    @Test(priority = 7,groups = { "smoke" })
    public void healthBeautyCategoryTest() throws AWTException, InterruptedException {
        categoryPage.clickHealthBeautyCategory();
    }
    @Test(priority = 8,groups = { "smoke" })
    public void womenFashionCategoryTest() throws AWTException, InterruptedException {
        categoryPage.womenFashionCategory();
    }
    @Test(priority = 9,groups = { "smoke" })
    public void menFashionCategoryTest() throws InterruptedException {
        categoryPage.menFashionCategory();
    }
    @Test(priority = 10,groups = { "smoke" })
    public void wholesaleTradeCategoryTest() throws InterruptedException {
        categoryPage.wholesaleTrade();
    }
    @Test(priority = 11,groups = { "smoke" })
    public void stationaryOfficeSuppliesCategoryTest() throws InterruptedException {
        categoryPage.stationaryOfficeSupplies();
    }
    @Test(priority = 12,groups = { "smoke" })
    public void moreCategoriesTest() throws InterruptedException {
        categoryPage.moreCaterories();
    }
    @Test(priority = 2,groups = { "smoke" })
    public void cookedFoodMenuItemTest() throws InterruptedException {
        categoryPage.cookedFoodMenu();
    }
}
