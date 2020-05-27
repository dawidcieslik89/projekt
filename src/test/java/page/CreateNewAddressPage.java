package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAddressPage {
    public CreateNewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "alias")
    private WebElement aliasInputField;

    @FindBy(name = "company")
    private WebElement companyInputField;

    @FindBy(name = "vat_number")
    private WebElement vatInputField;

    @FindBy(name = "address1")
    private WebElement addressInputField;

    @FindBy(name = "postcode")
    private WebElement postcodeInputField;

    @FindBy(name = "city")
    private WebElement cityInputField;

    @FindBy(name = "id_country")
    private WebElement countryDropDown;

    @FindBy(name = "phone")
    private WebElement phoneInputField;

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div/div/form/footer/button")
    private WebElement submitButton;

    public CreateNewAddressPage fillAliasField(String alias){
        aliasInputField.click();
        aliasInputField.sendKeys(alias);
        return this;
    }
    public CreateNewAddressPage fillCompanyField(String company){
        companyInputField.click();
        companyInputField.sendKeys(company);
        return this;
    }
    public CreateNewAddressPage fillVatField(String vatNumber){
        vatInputField.click();
        vatInputField.sendKeys(vatNumber);
        return this;
    }
    public CreateNewAddressPage fillAddressField(String address){
        addressInputField.click();
        addressInputField.sendKeys(address);
        return this;
    }
    public CreateNewAddressPage fillPostcodeField(String postcode){
        postcodeInputField.click();
        postcodeInputField.sendKeys(postcode);
        return this;
    }
    public CreateNewAddressPage fillCityField(String city){
        cityInputField.click();
        cityInputField.sendKeys(city);
        return this;
    }
    public void fillPhoneField(String phone){
        phoneInputField.click();
        phoneInputField.sendKeys(phone);
    }
    public void setCountry(String country){
        Select countryDrop = new Select(countryDropDown);
        countryDrop.selectByValue(country);
    }
    public void clickSubmitButton(){
        submitButton.click();
    }
}
