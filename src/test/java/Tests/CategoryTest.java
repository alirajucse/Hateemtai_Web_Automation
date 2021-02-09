package Tests;
import Base.TestBase;
import Pages.CategoryPage;
import Pages.HomePage;
import org.testng.annotations.Test;

import java.awt.*;

public class CategoryTest extends TestBase{
    private CategoryPage categoryPage;
    private HomePage homePage;


    @Test
    public void groceriesCategoryTest() throws InterruptedException {
      categoryPage.clickGroceriesCategory();
    }

    @Test
    public void mobileTabletCategoryProductTest() throws InterruptedException {
        categoryPage.clickMobileTabletCategory();
    }
    @Test
    public void computerAccessoriesCategoryTest() throws InterruptedException {
        categoryPage.clickComputerAccesoriesCategory();
    }
    @Test
    public void consumerElectronicsCategoryTest() throws InterruptedException {
        categoryPage.clickConsumerElectronicsCategory();
    }
    @Test
    public void entertaintmentCategoryTest() throws InterruptedException {
        categoryPage.clickEntertaintmentCategory();
    }
    @Test
    public void healthBeautyCategoryTest() throws AWTException, InterruptedException {
        categoryPage.clickHealthBeautyCategory();
    }
    @Test
    public void womenFashionCategoryTest() throws AWTException, InterruptedException {
        categoryPage.womenFashionCategory();
    }
    @Test
    public void menFashionCategoryTest() throws InterruptedException {
        categoryPage.menFashionCategory();
    }
    @Test
    public void wholesaleTradeCategoryTest() throws InterruptedException {
        categoryPage.wholesaleTrade();
    }
    @Test
    public void stationaryOfficeSuppliesCategoryTest() throws InterruptedException {
        categoryPage.stationaryOfficeSupplies();
    }
    @Test
    public void moreCategoriesTest() throws InterruptedException {
        categoryPage.moreCaterories();
    }

}
