package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourAccountPage {

    public YourAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/footer/div[2]/div/div[1]/div[2]/ul/li[4]/a")
    private WebElement addressButton;

    @FindBy(name = "s")
    private WebElement searchingField;

    public void clickAddressButton() {
        addressButton.click();
    }

    public void typeProductName(String productName){
        searchingField.click();
        searchingField.sendKeys(productName);
        searchingField.submit();
    }
}
