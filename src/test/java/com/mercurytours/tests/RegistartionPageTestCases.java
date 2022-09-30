package com.mercurytours.tests;

import com.mercurytours.pagobjects.FlightFinderPage;
import com.mercurytours.pagobjects.RegistrationConfirmationPage;
import com.mercurytours.pagobjects.RegistrationPage;
import com.mercurytours.pagobjects.UtilitiesClass;
import com.mercurytours.utilities.WaitUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistartionPageTestCases extends BaseTest {


 @Test
         public void registerUser()
 {
  try {
   Thread.sleep(2000);
  } catch (InterruptedException e) {
   throw new RuntimeException(e);
  }

     RegistrationPage rp= new RegistrationPage(driver);
     RegistrationConfirmationPage rgc=new RegistrationConfirmationPage(driver);
     rp.registerNewUser();
     WaitUtilities w=new WaitUtilities(driver);
     w.waitForElementToBeVisible(driver,10000,rgc.getUsernameWelcomeMessage());
     Assert.assertTrue( u.getElementText(rgc.getUsernameWelcomeMessage()).contains("Sonal"),"Welcome message is not correct");
 }

 @Test
    public void bookFlight()
 {
     RegistrationPage rp= new RegistrationPage(driver);
     RegistrationConfirmationPage rgc=new RegistrationConfirmationPage(driver);
     rp.registerNewUser();
     rgc.openFlightFinderPage();
 }
    @Test
    public void confirmFlight()
    {
        RegistrationPage rp= new RegistrationPage(driver);
        RegistrationConfirmationPage rgc=new RegistrationConfirmationPage(driver);
        FlightFinderPage fp=new FlightFinderPage(driver);
        rp.registerNewUser();
        rgc.openFlightFinderPage();
        fp.goToFlightConfirmationPage();
    }



}
