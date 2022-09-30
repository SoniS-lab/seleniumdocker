package com.mercurytours.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtilities
{
    WebDriver driver;
    public WaitUtilities(WebDriver driver)
    {
        this.driver=driver;
    }
    public void waitForElementToBeVisible(WebDriver driver,int seconds, WebElement element)
    {
        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(seconds));
        w.until(ExpectedConditions.visibilityOf(element));
    }
}
