package stepdefinitions;

import cucumber.automation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base {
    public WebDriver driver;
    HomePage h;

    @Given("^User is on Greenkart Landing page$")
    public void user_is_on_greenkart_landing_page() throws IOException {
        driver = getDriver();
    }

    @When("^User searched for (.+) vegetable$")
    public void user_searched_for_vegetable(String name) throws InterruptedException {
        h = new HomePage(driver);
        h.getSearch().sendKeys(name);
        Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) {
        assertTrue(h.getProductName().getText().contains(strArg1));
        driver.close();
    }

    @Then("^Verify selected (.+) items are displayed in Checkout page$")
    public void verify_selected_items_are_displayed_in_checkout_page(String name) {
        assertTrue(h.getProductName().getText().contains(name));
        driver.close();
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() {
        h.getIncrement().click();
        h.getAddToCart().click();
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() {
        h.getCheckCart().click();
        h.getProceedToCheckout().click();
    }
}
