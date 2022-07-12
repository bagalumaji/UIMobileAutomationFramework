package com.bagal.convertors;

import com.bagal.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserTypeConvertor implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserType) {
        return BrowserType.valueOf(browserType.toUpperCase());
    }
}
