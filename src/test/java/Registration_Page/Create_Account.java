package Registration_Page;

import SetUp_Page.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Create_Account extends SetUp {
    WebDriver driver;

    @FindBy(xpath = "//input[contains(@id,'email_create')]")
    WebElement create_email;

    @FindBy(xpath = "//input[contains(@id,'id_gender1')]")
    WebElement title;

    @FindBy(xpath = "//input[contains(@id,'customer_firstname')]")
    WebElement fname;

    @FindBy(xpath = "//input[contains(@id,'customer_lastname')]")
    WebElement lanme;

    @FindBy(xpath = "//input[contains(@data-validate,'isEmail')]")
    WebElement validate_email;

    @FindBy(xpath = "//input[contains(@data-validate,'isPasswd')]")
    WebElement Pass;

    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletter;

    @FindBy(xpath = "//input[contains(@id,'optin')]")
    WebElement partners;

    @FindBy(xpath = "//input[contains(@data-validate,'isPasswd')]")
    WebElement fname2;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lanme2;

    @FindBy(xpath = "//input[contains(@id,'company')]")
    WebElement company;

    @FindBy(xpath = "//input[contains(@id,'address1')]")
    WebElement address;

    @FindBy(xpath = "//input[contains(@id,'address1')]")
    WebElement city;

    @FindBy(xpath = "//select[contains(@id,'id_state')]")
    WebElement dropdwn;

    public Create_Account(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String Reg_first() {
        create_email.sendKeys("riyan@gmail.com");
        title.click();
        fname.sendKeys("Riyan");
        lanme.sendKeys("Sajib");
        validate_email.click();
        Pass.sendKeys("123456");
        newsletter.click();
        partners.click();
        fname2.sendKeys("Riyan");
        lanme2.sendKeys("Sajib");
        company.sendKeys("Riseuplabs");
        address.sendKeys("Uttara");
        city.sendKeys("Dhaka");
        dropdwn.click();

        return null;
    }


}