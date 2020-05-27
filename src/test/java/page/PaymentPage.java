package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    public PaymentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "payment-option-1")
    private WebElement paybycheckCheckbox;

    @FindBy(name = "conditions_to_approve[terms-and-conditions]")
    private WebElement termsofserviceChceckbox;

    @FindBy(css = ".btn.btn-primary.center-block")
    private WebElement orderWithAnObligationToPayButton;

    public void clickCheckboxes(){
        paybycheckCheckbox.click();
        termsofserviceChceckbox.click();
    }
    public void clickOrderWithAnObligationToPayButton(){
        orderWithAnObligationToPayButton.click();
    }
}
