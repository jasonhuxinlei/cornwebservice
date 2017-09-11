package com.hxl.service;

import com.hxl.entity.Pojo;
import com.hxl.entity.PojoDataSet;
import com.hxl.entity.PojoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
@Component("studentService")
public class WeatherImpl implements  WeatherInterface {
    @Autowired
    private PojoDataSet pojoDateSet;

    @GET
    @Path("/status")
    public String getStatus() {
        return "getStatus";
    }
    @GET
    @Path("/students/{index}")
    public Pojo getStudentById(@PathParam("index") Integer id) {
        List<Pojo> studentList = pojoDateSet.getList();
        Pojo vo = null;
        if (studentList.size() > id) {
            vo = studentList.get(id - 1);
        }
        return vo;
    }
    @GET
    @Path("/students")
    public PojoList getStudentList() {
        List<Pojo> studentList = pojoDateSet.getList();
        PojoList listVo = new PojoList(studentList);
        return listVo;
    }
}
