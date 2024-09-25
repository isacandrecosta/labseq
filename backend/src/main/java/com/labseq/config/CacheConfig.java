package com.labseq.config;

import io.quarkus.cache.CacheManager;
import jakarta.enterprise.context.ApplicationScoped; // Atualize aqui
import jakarta.inject.Inject;

@ApplicationScoped
public class CacheConfig {

    @Inject
    CacheManager cacheManager;

    // Configuração de cache adicional pode ser feita aqui
}