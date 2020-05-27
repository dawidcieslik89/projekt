package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SweaterPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public SweaterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".discount.discount-percentage")
    private WebElement discountField;

    @FindBy(name = "group[1]")
    private WebElement sizeDropDownField;

    @FindBy(id = "quantity_wanted")
    private WebElement quantityInputField;

    @FindBy(xpath = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button")
    private WebElement addToCartField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement checkoutButton;

    public String getDiscount() {
        return discountField.getText();
    }

    public void setSize(String size) {
        Select sizeDropDown = new Select(sizeDropDownField);
        sizeDropDown.selectByVisibleText(size);
    }

    public void setAmountOfProduct(String amount) throws InterruptedException {
        quantityInputField.click();
        Thread.sleep(1000);
        quantityInputField.clear();

//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.attributeToBe(quantityInputField,"value",""));
        Thread.sleep(2000);
        quantityInputField.sendKeys(amount);
    }

    public void clickAddToCart() {
        addToCartField.click();
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }

//    public WebDriverWait getWebDriverWait() {
//        return new WebDriverWait(driver, 10);
//    }
}
