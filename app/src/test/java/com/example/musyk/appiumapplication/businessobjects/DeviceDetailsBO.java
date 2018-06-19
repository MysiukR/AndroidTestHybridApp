package com.example.musyk.appiumapplication.businessobjects;

import com.example.musyk.appiumapplication.pageobjects.DeviceDetailsPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DeviceDetailsBO {
    private DeviceDetailsPage deviceDetailsPage;
    private WebDriver driver;

    public DeviceDetailsBO(WebDriver driver) {
        deviceDetailsPage = new DeviceDetailsPage(driver);
        this.driver = driver;
    }

    public void clickOK() {
        deviceDetailsPage.getButtonOk().click();
    }

    public String getTitle()
    {
      return deviceDetailsPage.getTitleDeviceDetails().getText();
    }

    public void verifyTitle()
    {
        Assert.assertNotEquals(getTitle(), "Device Details", "There is no identical title in the device details");
    }
}
