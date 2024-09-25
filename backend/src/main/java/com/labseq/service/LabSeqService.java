package com.labseq.service;

import com.github.benmanes.caffeine.cache.Cache;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

@ApplicationScoped
public class LabSeqService {

    private static final Logger LOG = Logger.getLogger(LabSeqService.class);

    @Inject
    Cache<Integer, Integer> cacheManager;

    public int calculateLabSeq(int n) {
        return calculateLabSeqWithCache(n);
    }

    private int calculateLabSeqWithCache(int n) {
        Integer cachedValue = cacheManager.getIfPresent(n);
        if (cachedValue != null) {
            LOG.infof("Cache hit for n=%d, value=%d", n, cachedValue);
            return cachedValue;
        } else {
            LOG.infof("Cache miss for n=%d", n);
            return cacheManager.get(n, this::calculateLabSeqWithoutCache);
        }
    }

    private int calculateLabSeqWithoutCache(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 3) return 1;
        if (n == 2) return 0;
        return calculateLabSeqWithCache(n - 4) + calculateLabSeqWithCache(n - 3);
    }
}