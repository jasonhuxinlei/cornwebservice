package com.hxl.service;

import com.hxl.entity.Pojo;
import com.hxl.entity.PojoList;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Produces(MediaType.APPLICATION_JSON)
@Path("/studentService")
public interface WeatherInterface {

    @GET
    @Path("/status")
    public String getStatus();

    @GET
    @Path("/students/{index}")
    public Pojo getStudentById(@PathParam("index") Integer id);

    @GET
    @Path("/students")
    public PojoList getStudentList();
}
