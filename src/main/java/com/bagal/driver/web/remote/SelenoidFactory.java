package com.bagal.driver.web.remote;

import com.bagal.driver.manager.web.remote.selenoid.SelenoidGridChromeManager;
import com.bagal.driver.manager.web.remote.selenoid.SelenoidGridSafariManager;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {
    private SelenoidFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType==BrowserType.CHROME
                ? SelenoidGridChromeManager.getDriver()
                : SelenoidGridSafariManager.getDriver();
    }
}
