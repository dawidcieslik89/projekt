package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
    public OrderConfirmationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".h1.card-title")
    private WebElement yourOrderIsConfirmedField;

    public String getConfirmationInfo(){
        return yourOrderIsConfirmedField.getText();
    }
}
