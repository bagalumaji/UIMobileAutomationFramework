package com.bagal.driver.web.remote;

import com.bagal.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.bagal.driver.manager.web.remote.selenium.SeleniumGridSafariManager;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {
    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType==BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridSafariManager.getDriver();
    }
}
