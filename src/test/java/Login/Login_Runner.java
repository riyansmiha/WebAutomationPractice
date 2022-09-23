package Login;

import SetUp_Page.SetUp;
import SetUp_Page.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.ParseException;

public class Login_Runner extends SetUp {
    Login_Locator objlogin;
    Utilities utilities;

    @Test(enabled = true, priority = 0)
    public void Login_With_Fst() throws IOException, ParseException, InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        objlogin = new Login_Locator (driver);
        utilities = new Utilities(driver);
        String nn=objlogin.Login_With_Fst();
        Assert.assertEquals(nn, "User One");
        System.out.println(nn);
    }
}
