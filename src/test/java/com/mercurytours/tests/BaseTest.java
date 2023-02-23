package com.mercurytours.tests;

import com.mercurytours.pagobjects.UtilitiesClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BaseTest
{
    UtilitiesClass u;
    WebDriver driver;
    MutableCapabilities m;
    ChromeOptions c;
    @BeforeMethod
    public void initializeDriver()
    {
        String host="127.0.0.1";
        String url="";
        u=new UtilitiesClass();
        m=new ChromeOptions();
        m.setCapability("acceptInsecureCerts",true);
        Map<String, Object> cloudOptions = new HashMap<>();
       // cloudOptions.put("ACCEPT_INSECURE_CERTS","true");
       // cloudOptions.put("cloud:options", cloudOptions);
        c=new ChromeOptions();
       // c.setAcceptInsecureCerts(true);OR
        c.setCapability("acceptInsecureCerts", true);
        if (System.getProperty("BROWSER")=="firefox") {
            m=new FirefoxOptions();

        }
        if (System.getProperty("HUB_HOST") != null) {
            host=System.getProperty("HUB_HOST");

        }
        url=url+"http://"+host+":4444";
       // WebDriverManager.chromedriver().setup();

       // driver = new ChromeDriver();
        try {
            System.out.println("Browser is "+ System.getProperty("BROWSER"));
            driver=new RemoteWebDriver(new URL(url),m);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teatDown()
    {
         driver.quit();
    }
}
