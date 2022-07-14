package com.bagal.driver.web.remote;

import com.bagal.driver.manager.web.remote.browserstack.BrowserStackGridChromeManager;
import com.bagal.driver.manager.web.remote.browserstack.BrowserStackGridSafariManager;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackFactory {
    private BrowserStackFactory(){}

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME,BrowserStackGridChromeManager::getDriver);
        MAP.put(BrowserType.SAFARI,BrowserStackGridSafariManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType){
        return MAP.get(browserType).get();
    }
}
