package com.bagal.driver.web.local;

import com.bagal.driver.manager.web.local.ChromeManager;
import com.bagal.driver.manager.web.local.SafariManager;
import com.bagal.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {
    private LocalDriverFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ?
                ChromeManager.getDriver() :
                SafariManager.getDriver();
    }
}
