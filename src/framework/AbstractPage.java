package framework;

import static framework.Configuration.chromeDriverPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {

    private static WebDriver driver = null;
    private static WebDriverWait wait = null;

    public WebDriver getDriver() {
        if (driver == null) {
//            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;

        }
        return driver;
    }

    protected WebDriverWait getWait(WebDriver driver) {
        if (wait == null) {
            wait = new WebDriverWait(driver, 5);
            return wait;
        }
        return wait;
    }

    public void quitDriver() {
        getDriver().quit();
    }
}
