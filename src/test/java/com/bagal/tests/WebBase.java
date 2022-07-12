package com.bagal.tests;

import com.bagal.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebBase {
    @BeforeMethod
    public void setUp() {
        Driver.intiDriver();
    }

    @AfterMethod
    public void tearDown() {
        Driver.quiteDriver();
    }
}
