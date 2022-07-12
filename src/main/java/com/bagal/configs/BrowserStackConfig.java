package com.bagal.configs;

import com.bagal.convertors.StringToUrlConvertor;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:${user.dir}/src/test/resources/configs/browser-stack.properties"
})
public interface BrowserStackConfig extends Config {
    String userName();

    String key();

    @DefaultValue("https://${userName}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToUrlConvertor.class)
    URL browserStackUrl();
}
