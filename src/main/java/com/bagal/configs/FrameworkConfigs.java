package com.bagal.configs;

import com.bagal.convertors.StringToBrowserTypeConvertor;
import com.bagal.enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/configs/config.properties"

})

public interface FrameworkConfigs extends Config {
   @DefaultValue("CHROME")
   @ConverterClass(StringToBrowserTypeConvertor.class)
   BrowserType browser();
}
