package com.bagal.driver.manager.web.remote.browserstack;

import com.bagal.configs.BrowserStackConfigFactory;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackGridSafariManager {
    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.SAFARI.name());
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackUrl(), capabilities);
    }
}
