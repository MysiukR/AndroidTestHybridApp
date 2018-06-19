package com.example.musyk.appiumapplication.pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeviceDetailsPage extends PageObject {
    @FindBy(xpath = "//*[@id='popup']/div[2]/a")
    private WebElement buttonOk;

    @FindBy(xpath = " //*[@id=\"popup-title\"]")
    private WebElement titleDeviceDetails;

    public DeviceDetailsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonOk() {
        return buttonOk;
    }

    public void setButtonOk(WebElement buttonOk) {
        this.buttonOk = buttonOk;
    }

    public WebElement getTitleDeviceDetails() {
        return titleDeviceDetails;
    }

    public void setTitleDeviceDetails(WebElement titleDeviceDetails) {
        this.titleDeviceDetails = titleDeviceDetails;
    }
}
