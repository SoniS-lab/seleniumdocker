package com.mercurytours.pagobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationConfirmationPage {
    WebDriver driver;
    WebDriverWait wait;
    UtilitiesClass util;
    public RegistrationConfirmationPage(WebDriver driver)
    {
        this.driver=driver;
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver,this);
        util=new UtilitiesClass();
    }

    @FindBy(linkText = "Flights")
    private WebElement flightsLink;

    @FindBy(xpath = "//img[contains(@src,\"mast_register\")]/ancestor::table[1]/tbody/tr[3]")
    private WebElement usernameWelcomeMessage;

    public WebElement getUsernameWelcomeMessage()
    {
        return usernameWelcomeMessage;
    }

    public void openFlightFinderPage()
    {
        util.clickElement(flightsLink);
    }

}
