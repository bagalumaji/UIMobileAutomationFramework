package com.bagal.driver.web.remote;

import com.bagal.driver.manager.web.remote.selenoid.SelenoidGridChromeManager;
import com.bagal.driver.manager.web.remote.selenoid.SelenoidGridSafariManager;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SelenoidFactory {
    private SelenoidFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);
    static {
        MAP.put(BrowserType.CHROME, SelenoidGridChromeManager::getDriver);
        MAP.put(BrowserType.SAFARI, SelenoidGridSafariManager::getDriver);

    }
    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }
}
