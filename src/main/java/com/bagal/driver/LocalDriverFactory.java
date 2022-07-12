package com.bagal.driver;

import com.bagal.configs.FrameworkConfigFactory;
import com.bagal.driver.manager.ChromeManager;
import com.bagal.driver.manager.SafariManager;
import com.bagal.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {
    private LocalDriverFactory(){}

    public static WebDriver getDriver(){
        if(FrameworkConfigFactory.getConfig().browser()== BrowserType.CHROME)
            return ChromeManager.getDriver();
        else return SafariManager.getDriver();
    }
}
