package MyStepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.AddressesPage;
import page.CreateNewAddressPage;
import page.LoginPage;
import page.YourAccountPage;

public class AddNewAddressDefs {

    private WebDriver driver;
    private CreateNewAddressPage createNewAddressPage;
    private AddressesPage addressesPage;
    private static final String PASSWORD = "Pass123";
    private static final String EMAIL = "losowymail99@gmail.com";

    @Given("User is logged in to shop")
    public void userIsLoggedInToShop() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.logIn(EMAIL, PASSWORD);

    }

    @When("User goes to YourAddressesPage and click CreateNewAddress")
    public void userGoesToYourAddressesPage() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickAddressButton();
        addressesPage = new AddressesPage(driver);
        addressesPage.clickCreateNewAddressButton();
    }

    @And("User fills (.*),(.*),(.*),(.*),(.*),(.*),(.*) fields")
    public void userFillsAliasCompanyVatNumberAddressPostcodeCityPhoneFields(String ali, String comp, String vat, String address, String pcode, String city, String phone) {
        createNewAddressPage = new CreateNewAddressPage(driver);
        createNewAddressPage
                .fillAliasField(ali)
                .fillCompanyField(comp)
                .fillVatField(vat)
                .fillAddressField(address)
                .fillPostcodeField(pcode)
                .fillCityField(city)
                .fillPhoneField(phone);
    }

    @And("User choose country and save changes")
    public void userChooseCountryAndSaveChanges() {
        createNewAddressPage.setCountry("17");
        createNewAddressPage.clickSubmitButton();
    }

    @Then("User see {string}")
    public void userSee(String message) {
        String succesMsg = addressesPage.getSuccessInfoMsg();
        Assert.assertEquals(message, succesMsg);
    }

    @And("User check (.*),(.*),(.*),(.*),(.*),(.*),(.*) is correct")
    public void userCheckAliasCompanyVatNumberAddressPostcodeCityPhoneIsCorrect(String ali, String comp, String vat, String address, String pcode, String city, String phone) {

        String extendAli = addressesPage.getNewAaliasInfo();
        Assert.assertEquals(ali, extendAli);
        String newCompanyInfo = addressesPage.getNewCompanyInfo();
        Assert.assertTrue(newCompanyInfo.contains(comp));
        Assert.assertTrue(newCompanyInfo.contains(vat));
        Assert.assertTrue(newCompanyInfo.contains(address));
        Assert.assertTrue(newCompanyInfo.contains(pcode));
        Assert.assertTrue(newCompanyInfo.contains(city));
        Assert.assertTrue(newCompanyInfo.contains(phone));
    }

//    @When("User click delete address")
//    public void userClickDeleteAddress() {
//        addressesPage.clickDeleteButton();
//    }
//
//    @Then("User can see {string}")
//    public void userCanSee(String expectedDelMessage) {
//        String successDelMessage = addressesPage.getSuccessDeleteInfo();
//        Assert.assertEquals(expectedDelMessage, successDelMessage);
//    }
}
