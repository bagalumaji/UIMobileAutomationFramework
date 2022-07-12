package com.bagal.convertors;

import com.bagal.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConvertor implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browserType) {
        Map<String, BrowserType> map = Map.of("CHROME", BrowserType.CHROME, "SAFARI", BrowserType.SAFARI);
        return map.getOrDefault(browserType.toUpperCase(), BrowserType.CHROME);
    }
}
