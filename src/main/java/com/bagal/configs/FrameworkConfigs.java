package com.bagal.configs;

import com.bagal.convertors.StringToBrowserRemoteModeTypeConvertor;
import com.bagal.convertors.StringToBrowserRunModeTypeConvertor;
import com.bagal.convertors.StringToBrowserTypeConvertor;
import com.bagal.enums.BrowserRemoteModeType;
import com.bagal.enums.BrowserType;
import com.bagal.enums.BrowserRunModeType;
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

   @ConverterClass(StringToBrowserRunModeTypeConvertor.class)
   BrowserRunModeType browserRunMode();

   @ConverterClass(StringToBrowserRemoteModeTypeConvertor.class)
   BrowserRemoteModeType browserRemoteMode();
}
