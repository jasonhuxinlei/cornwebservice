package com.hxl.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PojoDataSet {
    private static List<Pojo> list;

    static {
        PojoDataSet.list = new ArrayList<Pojo>();

        for (int i = 0; i < 10; i++) {
            Pojo vo = new Pojo(i, "name" + i, Math.round(100.0f),
                    "desc" + i, (i & 1) == 0);
            PojoDataSet.list.add(vo);
        }
    }

    public static List<Pojo> getList() {
        return PojoDataSet.list;
    }

}
