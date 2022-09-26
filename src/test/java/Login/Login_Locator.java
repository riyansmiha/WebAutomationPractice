package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.text.ParseException;

public class Login_Locator {
    WebDriver driver;

    @FindBy(xpath = "//a[@class='login'][contains(.,'Sign in')]")
    WebElement signbtn;

    @FindBy(xpath = ("//input[@id='email']"))
    WebElement email;

    @FindBy(xpath = ("//input[@data-validate='isPasswd']"))
    WebElement password;
    @FindBy(xpath = "//span[contains(.,'User One')]")
    WebElement Testassert;

    public Login_Locator(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String Login_With_Fst() {
        signbtn.click();
        email.sendKeys("riyan@gmail.com");
        password.sendKeys("123456");
        return  Testassert.getText();
    }
}