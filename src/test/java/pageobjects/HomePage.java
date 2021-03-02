package pageobjects;

import cucumber.automation.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type='search']")
    private WebElement search;

    @FindBy(css = "h4.product-name")
    private WebElement productName;

    @FindBy(css = "a.increment")
    private WebElement increment;

    @FindBy(xpath = "//button[contains(text(),'ADD TO CART')]")
    private WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img")
    private WebElement checkCart;

    @FindBy(xpath = "//button[contains(text(),'PROCEED TO CHECKOUT')]")
    private WebElement proceedToCheckout;

    public WebElement getSearch() {
        return search;
    }

    public WebElement getProductName() {
        return productName;
    }

    public WebElement getIncrement() {
        return increment;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getCheckCart() {
        return checkCart;
    }

    public WebElement getProceedToCheckout() {
        return proceedToCheckout;
    }

}
