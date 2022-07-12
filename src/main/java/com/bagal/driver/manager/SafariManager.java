package com.bagal.driver.manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public final class SafariManager {
    private SafariManager(){}

    public static WebDriver getDriver(){
        return WebDriverManager.safaridriver().create();
    }
}
