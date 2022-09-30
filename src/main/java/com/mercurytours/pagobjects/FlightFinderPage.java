package com.mercurytours.pagobjects;

import com.mercurytours.utilities.WaitUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightFinderPage {
    WebDriver driver;
    WaitUtilities wait;
    UtilitiesClass util;
    public FlightFinderPage(WebDriver driver) {
        this.driver=driver;
        wait=new WaitUtilities(driver);
        util=new UtilitiesClass();
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "findFlights")
    private WebElement continueButton;

    public void goToFlightConfirmationPage()
    {
        wait.waitForElementToBeVisible(driver,30,continueButton);
        util.clickElement(continueButton);

    }
}

