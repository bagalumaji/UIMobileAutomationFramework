package com.bagal.driver.web.remote;

import com.bagal.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.bagal.driver.manager.web.remote.selenium.SeleniumGridSafariManager;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SeleniumFactory {
    private SeleniumFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, SeleniumGridChromeManager::getDriver);
        MAP.put(BrowserType.SAFARI, SeleniumGridSafariManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }
}
