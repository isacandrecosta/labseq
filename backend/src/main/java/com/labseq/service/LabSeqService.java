package com.labseq.service;

import io.quarkus.cache.CacheResult;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LabSeqService {

    @CacheResult(cacheName = "labseq-cache")
    public int calculateLabSeq(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 3) return 1;
        if (n == 2) return 0;
        return calculateLabSeq(n - 4) + calculateLabSeq(n - 3);
    }
}