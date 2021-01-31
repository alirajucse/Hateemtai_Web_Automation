package Base;

import org.testng.annotations.Test;

public class CategoryTest extends BaseTest{

    @Test
    public void groceriesCategoryTest() throws InterruptedException {
        categoryPage.clickGroceriesCategory();
    }
}
