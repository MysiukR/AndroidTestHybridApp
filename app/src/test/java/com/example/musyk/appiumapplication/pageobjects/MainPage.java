package com.example.musyk.appiumapplication.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(css = "#main > div:nth-child(2) > div:nth-child(2) > a")
    private WebElement buttonDeviceDetails;

    @FindBy(xpath = "//*[@id='main']/div[8]/div[1]")
    private WebElement buttonAlertDialog;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonDeviceDetails() {
        return buttonDeviceDetails;
    }

    public void setButtonDeviceDetails(WebElement buttonDeviceDetails) {
        this.buttonDeviceDetails = buttonDeviceDetails;
    }

    public WebElement getButtonAlertDialog() {
        return buttonAlertDialog;
    }

    public void setButtonAlertDialog(WebElement buttonAlertDialog) {
        this.buttonAlertDialog = buttonAlertDialog;
    }
}
