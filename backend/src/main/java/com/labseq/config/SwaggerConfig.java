package com.labseq.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;

import jakarta.ws.rs.ApplicationPath; 
import jakarta.ws.rs.core.Application;

@OpenAPIDefinition(
    info = @Info(
        title = "LabSeq API",
        version = "1.0",
        description = "API para calcular a sequência labseq"
    )
)
@ApplicationPath("/api")
public class SwaggerConfig extends Application {
}