package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddressesPage {
    public AddressesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/a")
    private WebElement createNewAddressButton;

    @FindBy(css = ".alert.alert-success")
    private WebElement successInfoField;

    @FindBy(css = ".address-body > h4")
    private List<WebElement> newAddressInfoFields;

    @FindBy(css = ".address-body")
    private List<WebElement> newAddressBodyInfoFields;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[1]/article/div[2]/a[2]/span")
    private WebElement deleteButton;

    @FindBy(css = ".alert.alert-success")
    private WebElement successDeleteInfoField;

    public void clickCreateNewAddressButton() {
        createNewAddressButton.click();
    }

    public String getSuccessInfoMsg() {
        return successInfoField.getText();
    }

    public String getNewAaliasInfo() {
        return newAddressInfoFields.get(0).getText();
    }

    public String getNewCompanyInfo() {
        return newAddressBodyInfoFields.get(0).getText();
    }

    public void clickDeleteButton() {
        deleteButton.click();
    }

    public String getSuccessDeleteInfo() {
        return successDeleteInfoField.getText();
    }
}
