package Base;

import org.testng.annotations.Test;

public class CountrySwitchTest extends BaseTest{

    @Test
    public void switchToUSAViewTest() throws InterruptedException {
        countrySwitchPage.switchToUSAViewMethod();
    }
    @Test
    public void switchToBDViewTest() throws InterruptedException {
        countrySwitchPage.switchToUSAViewMethod();
        countrySwitchPage.switchToBDViewMethod();
    }
}
