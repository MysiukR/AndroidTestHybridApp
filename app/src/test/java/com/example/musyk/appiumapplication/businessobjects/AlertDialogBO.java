package com.example.musyk.appiumapplication.businessobjects;

import com.example.musyk.appiumapplication.pageobjects.AlertDialogPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.example.musyk.appiumapplication.Constants.TEXT_HELLO_WORLD;
import static com.example.musyk.appiumapplication.Constants.TITLE_ALERT_TEXT;

public class AlertDialogBO {
    private AlertDialogPage alertDialogPage;
    private WebDriver driver;

    public AlertDialogBO(WebDriver driver) {
        alertDialogPage = new AlertDialogPage(driver);
        this.driver = driver;
    }

    public String getTitle() {
        return alertDialogPage.getAlertTitle().getText();
    }

    public String getMessage() {
        return alertDialogPage.getAlertMessage().getText();
    }

    public void clickOk() {
        alertDialogPage.getNativeButtonOk().click();
    }

    public void verifyTitle() {
        Assert.assertNotEquals(getTitle(), TITLE_ALERT_TEXT, "There is no identical title in the notification");
    }

    public void verifyAlertMessage() {
        Assert.assertNotEquals(getMessage(), TEXT_HELLO_WORLD, "There is no identical text in the notification");
    }

}
