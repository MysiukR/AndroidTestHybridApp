package com.example.musyk.appiumapplication;


import java.util.Set;
import java.util.logging.Logger;

import io.appium.java_client.android.AndroidDriver;

public class DriverContext {
    private static final Logger lOG = Logger.getLogger(TestApp.class.getName());
    private AndroidDriver driver;

    public DriverContext(AndroidDriver driver) {
        this.driver = driver;
    }

    public void changeDriverContext(String containText) {
        Set contextNames = driver.getContextHandles();
        for (Object contextName : contextNames) {
            if (contextName.toString().toUpperCase().contains(containText)) {
                driver.context(contextName.toString());
                lOG.info(String.format("Context Name -> %s", contextName));
                lOG.info(String.format("Switched to %s Context", containText));
            }
        }
    }

    public void getNumberContexts() {
        lOG.info(String.format("Context count %s", driver.getContextHandles().size()));
    }
}
