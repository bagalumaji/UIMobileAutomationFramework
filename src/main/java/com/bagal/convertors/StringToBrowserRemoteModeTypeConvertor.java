package com.bagal.convertors;

import com.bagal.enums.BrowserRemoteModeType;
import com.bagal.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserRemoteModeTypeConvertor implements Converter<BrowserRemoteModeType> {
    @Override
    public BrowserRemoteModeType convert(Method method, String remoteMode) {
        return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
    }
}
