package MyStepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class BuyingProccessDefs {

    private WebDriver driver;
    private SweaterPage sweaterPage;
    private static final String PASSWORD = "Pass123";
    private static final String EMAIL = "losowymail99@gmail.com";

    @Given("User open browser go to Mystore page and login")
    public void userOpenBrowserGoToMystorePageAndLogin() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIn(EMAIL, PASSWORD);
    }

    @When("User search (.*) in to searching field")
    public void userSearchSweaterInToSearchingField(String productName) {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.typeProductName(productName);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.clickProductSweater();
    }

    @And("User choose (.*) size")
    public void userChooseSize(String size) {
        sweaterPage = new SweaterPage(driver);
        sweaterPage.setSize(size);
    }

    @And("User set amount (.*) of product and add to cart")
    public void userSetAmountOfProductAndAddToCart(String amount) throws InterruptedException {
        sweaterPage.setAmountOfProduct(amount);
        sweaterPage.clickAddToCart();
    }
//    @And("User can (.*) euro")
//    public void userCanEuro(String expectedDiscountAmount) {
//        String discountAmount = sweaterPage.getDiscount();
//        Assert.assertEquals(expectedDiscountAmount,discountAmount);
//    }

    @And("User go to checkout")
    public void userGoToCheckout() throws InterruptedException {
        Thread.sleep(2000);
        sweaterPage.clickCheckoutButton();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickCheckoutButton();
    }


    @And("User confirm sending address")
    public void userConfirmSendingAddress() {
        OrderConfirmationAddressPage orderConfirmationAddressPage = new OrderConfirmationAddressPage(driver);
        orderConfirmationAddressPage.clickContinueButton();
    }

    @And("User choose self pick up in store")
    public void userChooseSelfPickUpInStore() {
        ShippingMethodPage shippingMethodPage = new ShippingMethodPage(driver);
        shippingMethodPage.clickContinueButton();
    }

    @And("User choose pay by check and agree with terms of service")
    public void userChoosePayByCheckAndAgreeWithTermsOfService() {
        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.clickCheckboxes();
        paymentPage.clickOrderWithAnObligationToPayButton();
    }

    @Then("User can see {string} and takes a screenshot")
    public void userCanSeeAndTakesAScreenshot(String expectedMsg) throws IOException {
        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
        String confirmationMsg = orderConfirmationPage.getConfirmationInfo();
        Assert.assertEquals(expectedMsg, confirmationMsg);

        Screenshot screenshot = new AShot().takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "png", new File("/home/chillout/file.png"));
    }
}
