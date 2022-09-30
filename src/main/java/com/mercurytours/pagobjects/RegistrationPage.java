package com.mercurytours.pagobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegistrationPage {

    WebDriver driver;
    UtilitiesClass u;
    public RegistrationPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        u= new UtilitiesClass();
    }


    @FindBy(linkText = "REGISTER")
    public WebElement registerLink;

    @FindBy(name = "firstName")
    private WebElement firstname;
    @FindBy(name = "lastName")
    private WebElement lastName;
    @FindBy(name = "phone")
    private WebElement phone;
    @FindBy(name = "userName")
    private WebElement email;
    @FindBy(name = "address1")
    private WebElement address;
    @FindBy(name = "city")
    private WebElement city;
    @FindBy(name = "state")
    private WebElement state;
    @FindBy(name = "postalCode")
    private WebElement postalcode;
    @FindBy(name = "country")
    private WebElement countryDropDown;

    @FindBy(id = "email")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPassword;

    @FindBy(name = "submit")
    private WebElement submit;



    public void registerNewUser()
    {
       // RegistrationPage rp= new RegistrationPage(driver);

        firstname.sendKeys("Sonal");
        lastName.sendKeys("Mehra");
        phone.sendKeys("9012586345");
        email.sendKeys("abc@gmail.com");
        address.sendKeys("Marunji Pune");
        city.sendKeys("Pune");
        state.sendKeys("Maharashtra");
        postalcode.sendKeys("411006");
        u.selectByValueMethod(countryDropDown,"AMERICAN SAMOA");
        userName.sendKeys("sonal");
        password.sendKeys("abc@12345");
        confirmPassword.sendKeys("abc@12345");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        u.clickElement(submit);


    }

}
