package com.bagal.driver.web.local;

import com.bagal.driver.manager.web.local.ChromeManager;
import com.bagal.driver.manager.web.local.SafariManager;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {
    private LocalDriverFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> MAP = new EnumMap<>(BrowserType.class);

  //  private static final  Supplier<WebDriver> CHROME = ChromeManager::getDriver;
   // private static final  Supplier<WebDriver> SAFARI = SafariManager::getDriver;

   /* static {
        MAP.put(BrowserType.CHROME, CHROME);
        MAP.put(BrowserType.SAFARI, SAFARI);
    }*/

    static {
        MAP.put(BrowserType.CHROME,ChromeManager::getDriver);
        MAP.put(BrowserType.SAFARI,SafariManager::getDriver);

    }
    public static WebDriver getDriver(BrowserType browserType) {
       return MAP.get(browserType).get();
    }

    /*public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ?
                ChromeManager.getDriver() :
                SafariManager.getDriver();
    }*/
}
