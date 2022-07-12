package com.bagal.driver;

import com.bagal.configs.ConfigFactory;
import com.bagal.driver.web.local.LocalDriverFactory;

public final class Driver {
    private Driver(){}

    public static void intiDriver(){
        LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
    }
    public static void quiteDriver(){

    }

}
