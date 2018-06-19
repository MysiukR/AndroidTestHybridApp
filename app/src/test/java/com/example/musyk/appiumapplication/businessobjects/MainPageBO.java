package com.example.musyk.appiumapplication.businessobjects;

import com.example.musyk.appiumapplication.pageobjects.MainPage;

import org.openqa.selenium.WebDriver;

public class MainPageBO {
    private MainPage mainPage;
    private WebDriver driver;

    public MainPageBO(WebDriver driver) {
        mainPage = new MainPage(driver);
        this.driver = driver;
    }

    public void clickOnDeviceDetails() {
        mainPage.getButtonDeviceDetails().click();
    }

    public void clickOnAlertDialog(){ mainPage.getButtonAlertDialog().click();}

    public DeviceDetailsBO goToDeviceDetailsPage()
    {
        return new DeviceDetailsBO(driver);
    }

    public AlertDialogBO goToAlertDialog()
    {
        return new AlertDialogBO(driver);
    }
}
