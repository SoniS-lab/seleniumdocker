package com.mercurytours.pagobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilitiesClass {

    public Select getSelectDropDown(WebElement element)
    {
        Select s= new Select(element);
        return s;
    }

    public void selectByValueMethod(WebElement element,String value)
    {
        Select s = getSelectDropDown(element);
        s.selectByValue(value);
    }
    public void selectByIndexMethod(WebElement element,int index)
    {
        Select s = getSelectDropDown(element);
        s.selectByIndex(index);
    }
    public void selectByVisibleText(WebElement element, String visibleText)
    {
        Select s = getSelectDropDown(element);
        s.selectByVisibleText(visibleText);
    }

    public void clickElement(WebElement element)
    {
        element.click();
    }

    public void enterTextInWebElement(WebElement element,String text)
    {
        element.sendKeys(text);
    }

    public String getElementText(WebElement ele)
    {
        return ele.getText();
    }

}
