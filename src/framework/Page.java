package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Page extends AbstractPage {

    //private waits 2x 
    private WebElement waitForElementClickability(By locator) {
        return getWait(getDriver()).until(ExpectedConditions.elementToBeClickable(locator));
    }

    private WebElement waitForElementClickability(WebElement element) {
        return getWait(getDriver()).until(ExpectedConditions.elementToBeClickable(element));
    }

    //public waits 2x
    public WebElement waitForElementVisibility(By locator) {
        return getWait(getDriver()).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementVisibility(WebElement element) {
        return getWait(getDriver()).until(ExpectedConditions.visibilityOf(element));
    }
    //public methods

    public void clickOnElement(By locator) {
        WebElement target = waitForElementClickability(locator);
        
        if (target != null) {
            target.click();
        }
    }

    public void clickOnElement(WebElement element) {
        WebElement target = waitForElementClickability(element);
    }

    public String sendTextOnField(By locator) {
        WebElement inputField = waitForElementVisibility(locator);
        inputField.clear();
        String text = Helper.getRandomText();
        inputField.sendKeys(text);
        return text;

    }

//    public String sendTextOnField(WebElement element, inputField) {
//        WebElement inputField = waitForElementVisibility(element);
//        inputField.clear();
//        String text = Helper.getRandomText();
//        inputField.sendKeys(text);
//        return text;
//    }

    public void sendTextOnField(By locator, String text) {
        WebElement inputField = waitForElementVisibility(locator);
        inputField.clear();
        inputField.sendKeys(text);
    }

    public void sendTextOnField(WebElement element, String text) {
        WebElement inputField = waitForElementClickability(element);
        inputField.clear();
        inputField.sendKeys(text);
    }
}
