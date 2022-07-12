package com.bagal.configs;

import org.aeonbits.owner.ConfigCache;

public final class FrameworkConfigFactory {
    private FrameworkConfigFactory(){}

    public static FrameworkConfigs getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfigs.class);
    }
}
