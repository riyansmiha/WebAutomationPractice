package Registration_Page;

import SetUp_Page.SetUp;
import SetUp_Page.Utilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Reg_Runner extends SetUp {
    Create_Account objlogin1;
    Utilities utilities;

    @Test(enabled = true, priority = 0)
    public void Reg_first() {
        driver.get("http://automationpractice.com/index.php");
        objlogin1 = new Create_Account(driver);
        utilities = new Utilities(driver);
        String nn = objlogin1.Reg_first();
        Assert.assertEquals(nn, "User One");
        System.out.println(nn);
    }
}