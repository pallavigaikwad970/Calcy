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
    /**
     * This method is use to enter number .
     * If user providing number more then 9999 and less then 0
     * this method will return InvalidCalculatorNumberException
     * If number is equal to 0, it clicks on a button represented by btn_0.
     * If number is equal to 1, it clicks on a button represented by btn_1.
     * This pattern continues up to 9, where each value of number corresponds to clicking a specific button.
     * If number is not between 0 and 9 (inclusive), it throws an InvalidCalculatorNumberException with a
     * message indicating the invalid number.
     */

    public void enterNumber(int number) throws InvalidCalculatorNumberException {
        logger.debug("Attempting to click number: {}", number);
        if (number < 0 || number > 9999) {
            throw new InvalidCalculatorNumberException("Invalid number: " + number);
        }
         if (number == 0) {
             wAction.click(btn_0);
          //  driver.findElement(btn_0).click();
        } else if (number == 1) {
             wAction.click(btn_1);
          // driver.findElement(btn_1).click();
        } else if (number == 2) {
             wAction.click(btn_2);
            //driver.findElement(btn_2).click();
        } else if (number == 3) {
             wAction.click(btn_3);
           // driver.findElement(btn_3).click();
        } else if (number == 4) {
             wAction.click(btn_4);
            // driver.findElement(btn_4).click();
        } else if (number == 5) {
             wAction.click(btn_5);
          //  driver.findElement(btn_5).click();
        } else if (number == 6) {
             wAction.click(btn_6);
          // driver.findElement(btn_6).click();
        } else if (number == 7) {
             wAction.click(btn_7);
           // driver.findElement(btn_7).click();
        } else if (number == 8) {
             wAction.click(btn_8);
           //  driver.findElement(btn_8).click();
        } else if (number == 9) {
             wAction.click(btn_9);
            // driver.findElement(btn_9).click();
        } else {
            throw new InvalidCalculatorNumberException("Invalid number: " + number);
        }
    }
    /**
     * This method is use to click button .
     * It declares a variable buttonElement of type WebElement.
     * It uses a switch statement to determine which button to click based on the value of buttonType.
     * For each case ("add", "sub", "div", etc.), it finds the corresponding button element using driver.findElement()
     * method and assigns it to the buttonElement variable.
     * After finding the button element, it logs a debug message indicating which button was clicked.
     * If buttonType does not match any of the predefined cases, it throws an InvalidCalculatorNumberException
     * with an appropriate error message.
     * Finally, it clicks on the identified button element using buttonElement.click().
     */

    public void clickButton(String buttonType) throws InvalidCalculatorNumberException {
       // WebElement buttonElement;
        switch (buttonType) {
            case "add":
                wAction.click(btn_addition);
                // buttonElement = driver.findElement(btn_addition);
                logger.debug("Clicked the addition button");
                break;
            case "sub":
                wAction.click(btn_minus);
                //buttonElement = driver.findElement(btn_minus);
                logger.debug("Clicked the subtraction button");
                break;
            case "div":
                wAction.click(btn_division);
                // buttonElement = driver.findElement(btn_division);
                logger.debug("Clicked the division button");
                break;
            case "mul":
                wAction.click(btn_multiply);
                // buttonElement = driver.findElement(btn_multiply);
                logger.debug("Clicked the multiplication button");
                break;
            case "equals":
                wAction.click(btn_equals);
                // buttonElement = driver.findElement(btn_equals);
                logger.debug("Clicked the equals button");
                break;
            case "dot":
                wAction.click(btn_dot);
                //buttonElement = driver.findElement(btn_dot);
                logger.debug("Clicked the dot button");
                break;
            case "clear":
                wAction.click(btn_clear);
                //  buttonElement = driver.findElement(btn_clear);
                logger.debug("Clicked the clear button");
                break;
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
              //  buttonElement = driver.findElement(btn_addition);
                break;
            case "sub":
               wAction.click(btn_minus);
               // buttonElement = driver.findElement(btn_minus);
                break;
            case "div":
                wAction.click(btn_division);
             ///   buttonElement = driver.findElement(btn_division);
                break;
            case "mul":
                wAction.click(btn_multiply);
                //buttonElement = driver.findElement(btn_multiply);
                break;
            case "equals":
                wAction.click(btn_equals);
              //  buttonElement = driver.findElement(btn_equals);
                break;
            case "dot":
                wAction.click(btn_dot);
               // buttonElement = driver.findElement(btn_dot);
                break;
            case "clear":
                wAction.click(btn_dot);
                //buttonElement = driver.findElement(btn_clear);
                break;
            default:
                // If an invalid button type is provided, return false
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
