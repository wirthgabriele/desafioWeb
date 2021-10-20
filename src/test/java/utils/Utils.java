package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {

    public static String getBaseUrl() {
        return "http://automationpractice.com/";
    }

    public void selectInfoByWebElement(WebElement webElement, String valueSelect) {
        Select select = new Select(webElement);
        select.selectByValue(valueSelect);
    }
}
