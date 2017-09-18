package com.hxl.mapper;

import com.hxl.entity.Pojo;
import com.hxl.entity.PojoList;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface WeatherMapper {
    public List<Pojo> findAll();

}
