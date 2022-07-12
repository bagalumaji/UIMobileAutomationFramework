package com.bagal.driver.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public final class ChromeManager {
    private ChromeManager(){}

    public static WebDriver getDriver(){
        return WebDriverManager.chromedriver().create();

    }
}
