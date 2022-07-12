package com.bagal.tests;

import com.bagal.configs.ConfigFactory;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void demTest(){
        System.out.println("config.browser() = " + ConfigFactory.getConfig().browser());
    }
}
