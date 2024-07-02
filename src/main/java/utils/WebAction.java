package utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class WebAction {
    private static final Logger logger = LoggerFactory.getLogger(WebAction.class.getName());

    WebDriver driver ;
    public WebAction(WebDriver driver){
        this.driver = driver;
    }

    public void enterData(By by, CharSequence...data){
        WebElement elm = getElement(by);
        elm.sendKeys(data);
    }

    public boolean click(By by){
        try {
            WebElement elm = getElement(by);
            elm.click();
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public boolean isElementDisplayed(By by){
        return getElement(by).isDisplayed();
    }

    public WebElement getElement(By by){
        return  driver.findElement(by);
    }

}
