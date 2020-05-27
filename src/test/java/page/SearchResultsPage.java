package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

    public SearchResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[3]/div/div[1]/article/div/a/img")
    private WebElement productSweater;

    public void clickProductSweater(){
        productSweater.click();
    }
}
