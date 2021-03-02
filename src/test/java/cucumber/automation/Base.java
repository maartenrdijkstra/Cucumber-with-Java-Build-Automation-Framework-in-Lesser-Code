package cucumber.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    public static Properties properties;

    public WebDriver getDriver() throws IOException {
        properties = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/global.properties");
        properties.load(fis);
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get(properties.getProperty("url"));
        return driver;
    }
}
