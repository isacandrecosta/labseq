package com.labseq.controller;

import com.labseq.service.LabSeqService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.PathParam;


@Path("/labseq")
public class LabSeqController {

    @Inject
    LabSeqService labSeqService;

    @GET
    @Path("/{n}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLabSeqValue(@PathParam("n") int n) {
        int result = labSeqService.calculateLabSeq(n);
        return Response.ok(result).build();
    }
}