package org.pageobject;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorScreenPageObject {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorScreenPageObject.class);

    static {
        logger.debug("Calculator Screen Page Object initialized.");
    }

    public static By btn_result = By.xpath("//*[@id='actions']");
    public static By btn_clear = By.xpath("//input [@value='c']");
    public static By btn_1 = By.xpath("//input[@value='1']");
    public static By btn_2 = By.xpath("//input[@value='2']");
    public static By btn_3 = By.xpath("//input[@value='3']");
    public static By btn_division = By.xpath("//input[@value='/']");
    public static By btn_4 = By.xpath("//input[@value='4']");
    public static By btn_5 = By.xpath("//input[@value='5']");
    public static By btn_6 = By.xpath("//input[@value='6']");
    public static By btn_multiply = By.xpath("//input[@value='*']");
    public static By btn_7 = By.xpath("//input[@value='7']");
    public static By btn_8 = By.xpath("//input[@value='8']");
    public static By btn_9 = By.xpath("//input[@value='9']");
    public static By btn_minus = By.xpath("//input[@value='-']");
    public static By btn_0 = By.xpath("//input[@value='0']");
    public static By btn_dot = By.xpath("//input[@value='.']");
    public static By btn_equals = By.xpath("//input[@value ='=']");
    public static By btn_addition = By.xpath("//input[@value='+']");

}
