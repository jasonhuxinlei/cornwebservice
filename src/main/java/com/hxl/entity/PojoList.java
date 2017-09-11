package com.hxl.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement
public class PojoList implements Serializable {
    private static final long serialVersionUID = -2200047544608641662L;
    private List<Pojo> studentList;

    public PojoList() {
    }

    public PojoList(List<Pojo> studentList) {
        this.studentList = studentList;
    }

    public List<Pojo> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Pojo> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "{studentList=" + studentList + "}";
    }
}
