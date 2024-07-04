package org.modules;

import org.exception.InvalidCalculatorNumberException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.WebAction;
import utils.WebVerification;

import static org.pageobject.CalculatorScreenPageObject.*;

public class CalculatorModule {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorModule.class);
    public WebDriver driver;
    public WebAction wAction;
    public WebVerification wVerification;
    public CalculatorModule(WebDriver driver) {
        this.driver = driver;
        wAction = new WebAction(this.driver);
        wVerification = new WebVerification();
    }
    public void enterNumber(int number) throws InvalidCalculatorNumberException {
        logger.debug("Attempting to click number: {}", number);
        if (number < 0 || number > 9) {
            throw new InvalidCalculatorNumberException("Invalid number: " + number);
        }
        switch (number) {
            case 0 -> wAction.click(btn_0);
            case 1 -> wAction.click(btn_1);
            case 2 -> wAction.click(btn_2);
            case 3 -> wAction.click(btn_3);
            case 4 -> wAction.click(btn_4);
            case 5 -> wAction.click(btn_5);
            case 6 -> wAction.click(btn_6);
            case 7 -> wAction.click(btn_7);
            case 8 -> wAction.click(btn_8);
            case 9 -> wAction.click(btn_9);
            default-> throw new InvalidCalculatorNumberException("Invalid number: " + number);
        }
    }
    public void clickButton(String buttonType) throws InvalidCalculatorNumberException {
        logger.debug("Attempting to click button: {}", buttonType);
        switch (buttonType) {
            case "add" -> wAction.click(btn_addition);
            case "sub" -> wAction.click(btn_minus);
            case "div" -> wAction.click(btn_division);
            case "mul" -> wAction.click(btn_multiply);
            case "equals" -> wAction.click(btn_equals);
            case "dot" -> wAction.click(btn_dot);
            case "clear" -> wAction.click(btn_clear);
            default -> throw new InvalidCalculatorNumberException("Invalid button type: " + buttonType);
        }
    }

    public int getResult() {
        String resultText = driver.findElement(btn_result).getText().replaceAll("\\D", "");
        int result = Integer.parseInt(resultText);
        logger.debug("Result obtained: {}", result);
        return result;
    }

    public boolean isEnabled(By by) {
        return driver.findElement(by).isEnabled();
    }

    public boolean isDisplayed(By by) {
         return driver.findElement(by).isDisplayed();
    }

    public boolean resultArea(By by) {
        return driver.findElement(by).getText().contains("+");
    }

    public boolean verifyButton(String buttonType) {
        WebElement buttonElement = null;
        switch (buttonType) {
            case "add":
                wAction.click(btn_addition);
                break;
            case "sub":
               wAction.click(btn_minus);
                break;
            case "div":
                wAction.click(btn_division);
                break;
            case "mul":
                wAction.click(btn_multiply);
                break;
            case "equals":
                wAction.click(btn_equals);
                break;
            case "dot":
                wAction.click(btn_dot);
                break;
            case "clear":
                wAction.click(btn_dot);
                break;
            default:
                return false;
        }
        // Check if the button element is not null and is displayed and enabled
        if (buttonElement != null && buttonElement.isDisplayed() && buttonElement.isEnabled()) {
            logger.debug("Button '{}' is displayed and enabled", buttonType);
            return true;
        } else {
            logger.debug("Button '{}' is not displayed or enabled", buttonType);
            return false;
        }
    }
}
