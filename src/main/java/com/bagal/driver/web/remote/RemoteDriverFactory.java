package com.bagal.driver.web.remote;

import com.bagal.enums.BrowserRemoteModeType;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}
    private static final Map<BrowserRemoteModeType, Function<BrowserType,WebDriver>> MAP = new EnumMap<>(BrowserRemoteModeType.class);
    static {
        MAP.put(BrowserRemoteModeType.SELENIUM,SeleniumFactory::getDriver);
        MAP.put(BrowserRemoteModeType.SELENOID,SelenoidFactory::getDriver) ;
        MAP.put(BrowserRemoteModeType.BROWSER_STACK,BrowserStackFactory::getDriver);
    }
    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){
       return MAP.get(browserRemoteModeType).apply(browserType);
    }
}
