package com.labseq.service;

import com.github.benmanes.caffeine.cache.Cache;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class LabSeqServiceTest {

    @Inject
    LabSeqService labSeqService;

    @Inject
    Cache<Integer, Integer> cacheManager;

    @BeforeEach
    public void setup() {
        cacheManager.invalidateAll();
    }

    @Test
    public void testCacheFunctionality() {
        int value1 = labSeqService.calculateLabSeq(10);
        assertEquals(2, value1);

        int value2 = labSeqService.calculateLabSeq(10);
        assertEquals(2, value2);

        assertEquals(2, cacheManager.getIfPresent(10));
    }
}