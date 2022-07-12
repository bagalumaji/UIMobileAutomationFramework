package com.bagal.driver.manager.web.remote.selenium;

import com.bagal.configs.ConfigFactory;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridChromeManager {
    private SeleniumGridChromeManager(){}

    public static WebDriver getDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.CHROME.name());
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridUrl(),capabilities);
    }
}
