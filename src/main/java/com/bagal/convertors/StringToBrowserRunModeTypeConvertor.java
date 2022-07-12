package com.bagal.convertors;

import com.bagal.enums.BrowserRunModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserRunModeTypeConvertor implements Converter<BrowserRunModeType> {
    @Override
    public BrowserRunModeType convert(Method method, String browserRunModeType) {
        return BrowserRunModeType.valueOf(browserRunModeType.toUpperCase());
    }
}
