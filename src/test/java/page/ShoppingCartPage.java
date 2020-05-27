package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    public ShoppingCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section/div/div/section/div/div[2]/div[1]/div[2]/div/a")
    private WebElement checkoutButton;

    public void clickCheckoutButton(){
        checkoutButton.click();
    }
}
