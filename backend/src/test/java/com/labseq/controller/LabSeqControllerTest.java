package com.labseq.controller;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.labseq.service.LabSeqService;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class LabSeqControllerTest {

    @Mock
    LabSeqService labSeqService;

    @InjectMocks
    LabSeqController labSeqController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        Mockito.when(labSeqService.calculateLabSeq(0)).thenReturn(0);
        Mockito.when(labSeqService.calculateLabSeq(1)).thenReturn(1);
        Mockito.when(labSeqService.calculateLabSeq(4)).thenReturn(1);
    }

    @Test
    public void testGetLabSeqValue() {
        given()
          .when().get("/labseq/0")
          .then()
             .statusCode(200)
             .body(is("0"));

        given()
          .when().get("/labseq/1")
          .then()
             .statusCode(200)
             .body(is("1"));

        given()
          .when().get("/labseq/4")
          .then()
             .statusCode(200)
             .body(is("1"));
    }
}