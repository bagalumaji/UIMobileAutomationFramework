package com.bagal.driver.web.remote;

import com.bagal.driver.manager.web.remote.browserstack.BrowserStackGridChromeManager;
import com.bagal.driver.manager.web.remote.browserstack.BrowserStackGridSafariManager;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {
    private BrowserStackFactory(){}

    public static WebDriver getDriver(BrowserType browserType){
        return browserType==BrowserType.CHROME
                ? BrowserStackGridChromeManager.getDriver()
                : BrowserStackGridSafariManager.getDriver();
    }
}
