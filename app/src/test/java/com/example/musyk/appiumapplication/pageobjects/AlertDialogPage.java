package com.example.musyk.appiumapplication.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class AlertDialogPage extends PageObject {

    @FindBy(id = "android:id/button1")
    private WebElement nativeButtonOk;

    @FindBy(id="android:id/message")
    private WebElement alertMessage;

    @FindBy(id="android:id/alertTitle")
    private WebElement alertTitle;

    public AlertDialogPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNativeButtonOk() {
        return nativeButtonOk;
    }

    public void setNativeButtonOk(MobileElement nativeButtonOk) {
        this.nativeButtonOk = nativeButtonOk;
    }

    public WebElement getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(MobileElement alertMessage) {
        this.alertMessage = alertMessage;
    }

    public WebElement getAlertTitle() {
        return alertTitle;
    }

    public void setAlertTitle(MobileElement alertTitle) {
        this.alertTitle = alertTitle;
    }
}
