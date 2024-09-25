package com.labseq.config;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class CacheConfig {

    @Produces
    @ApplicationScoped
    public Cache<Integer, Integer> cacheManager() {
        return Caffeine.newBuilder()
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .maximumSize(10000)
                .build();
    }
}