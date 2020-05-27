package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationAddressPage {
    public OrderConfirmationAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "confirm-addresses")
    private WebElement continueButton;

    public void clickContinueButton(){
        continueButton.click();
    }
}
