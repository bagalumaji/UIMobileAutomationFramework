package com.bagal.driver.web.remote;

import com.bagal.enums.BrowserRemoteModeType;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}
    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){
        if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM)
            return SeleniumFactory.getDriver(browserType);
        else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID)
           return SelenoidFactory.getDriver(browserType);
        else
            return BrowserStackFactory.getDriver(browserType);
    }
}
