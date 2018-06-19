package com.example.musyk.appiumapplication;

import com.example.musyk.appiumapplication.businessobjects.AlertDialogBO;
import com.example.musyk.appiumapplication.businessobjects.DeviceDetailsBO;
import com.example.musyk.appiumapplication.businessobjects.MainPageBO;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import static com.example.musyk.appiumapplication.Constants.ANDROID_VERSION;
import static com.example.musyk.appiumapplication.Constants.APP_ACTIVITY_NAME;
import static com.example.musyk.appiumapplication.Constants.APP_PACKAGE_NAME;
import static com.example.musyk.appiumapplication.Constants.DEVICE_NAME;
import static com.example.musyk.appiumapplication.Constants.PATH_TO_DRIVER;
import static com.example.musyk.appiumapplication.Constants.PLATFORM_NAME;


public class TestApp {

    AndroidDriver driver;
    DesiredCapabilities capabilities = new DesiredCapabilities();
    @Before
    public void setUp() throws MalformedURLException {
        capabilities.setCapability("deviceName", DEVICE_NAME);
        capabilities.setCapability(CapabilityType.BROWSER_NAME, PLATFORM_NAME);
        capabilities.setCapability(CapabilityType.VERSION, ANDROID_VERSION);
        capabilities.setCapability("platformName", PLATFORM_NAME);
        capabilities.setCapability("appPackage", APP_PACKAGE_NAME);
        capabilities.setCapability("appActivity", APP_ACTIVITY_NAME);
        capabilities.setCapability("chromedriverExecutable", String.format("%s%s",System.getProperty("user.dir"),PATH_TO_DRIVER));
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void testHybridNativeApp() {
        DriverContext driverContext = new DriverContext(driver);
        driverContext.getNumberContexts();
        driverContext.changeDriverContext("WEBVIEW");
        MainPageBO mainPageBO = new MainPageBO(driver);
        mainPageBO.clickOnDeviceDetails();
        DeviceDetailsBO deviceDetailsBO = mainPageBO.goToDeviceDetailsPage();
        deviceDetailsBO.verifyTitle();
        deviceDetailsBO.clickOK();
        mainPageBO.clickOnAlertDialog();
        driverContext.changeDriverContext("NATIVE_APP");
        AlertDialogBO alertDialogBO = mainPageBO.goToAlertDialog();
        alertDialogBO.verifyTitle();
        alertDialogBO.verifyAlertMessage();
        alertDialogBO.clickOk();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void End() {
        driver.quit();
    }
}