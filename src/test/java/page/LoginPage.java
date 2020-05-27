package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {



    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    private WebElement emailInputField;

    @FindBy(name = "password")
    private WebElement passwdInputField;

    @FindBy(id = "submit-login")
    private WebElement submitButton;

    public void logIn(String email,String password){
        emailInputField.click();
        emailInputField.sendKeys(email);
        passwdInputField.click();
        passwdInputField.sendKeys(password);
        submitButton.click();
    }
}

