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
    }
    @Test(priority = 1,groups = { "Category" })
    public void groceriesCategoryTest() throws InterruptedException {
      categoryPage.clickGroceriesCategory();
    }

    @Test(priority = 2,groups = { "Category" })
    public void mobileTabletCategoryProductTest() throws InterruptedException {
        categoryPage.clickMobileTabletCategory();
    }
    @Test(priority = 1,groups = { "Category" })
    public void computerAccessoriesCategoryTest() throws InterruptedException {
        categoryPage.clickComputerAccesoriesCategory();
    }
    @Test(priority = 1,groups = { "Category" })
    public void consumerElectronicsCategoryTest() throws InterruptedException {
        categoryPage.clickConsumerElectronicsCategory();
    }
    @Test(priority = 1,groups = { "Category" })
    public void entertaintmentCategoryTest() throws InterruptedException {
        categoryPage.clickEntertaintmentCategory();
    }
    @Test(priority = 1,groups = { "Category" })
    public void healthBeautyCategoryTest() throws AWTException, InterruptedException {
        categoryPage.clickHealthBeautyCategory();
    }
    @Test(priority = 1,groups = { "Category" })
    public void womenFashionCategoryTest() throws AWTException, InterruptedException {
        categoryPage.womenFashionCategory();
    }
    @Test(priority = 1,groups = { "Category" })
    public void menFashionCategoryTest() throws InterruptedException {
        categoryPage.menFashionCategory();
    }
    @Test(priority = 1,groups = { "Category" })
    public void wholesaleTradeCategoryTest() throws InterruptedException {
        categoryPage.wholesaleTrade();
    }
    @Test(priority = 1,groups = { "Category" })
    public void stationaryOfficeSuppliesCategoryTest() throws InterruptedException {
        categoryPage.stationaryOfficeSupplies();
    }
    @Test(priority = 1,groups = { "Category" })
    public void moreCategoriesTest() throws InterruptedException {
        categoryPage.moreCaterories();
    }
}
