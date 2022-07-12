package com.bagal.tests;

import com.bagal.configs.FrameworkConfigFactory;
import org.testng.annotations.Test;

public class DemoTest {
    @Test
    public void demTest(){
        System.out.println("config.browser() = " + FrameworkConfigFactory.getConfig().browser());
    }
}
