package Tests;
import Base.TestBase;
import Pages.FBMessengerPage;
import org.testng.annotations.Test;

public class FBMessengerTest extends TestBase {

    private FBMessengerPage fbMessengerPage;

    @Test
    public void chatWithoutFBLoginTest() throws InterruptedException {
        fbMessengerPage.chatWithoutLogin();
    }
}
