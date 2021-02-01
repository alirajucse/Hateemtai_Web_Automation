package Base;

import org.testng.annotations.Test;

public class FBMessengerTest extends BaseTest{
    @Test
    public void chatWithoutFBLoginTest() throws InterruptedException {
        fbMessengerPage.chatWithoutLogin("Hello");
    }
}
