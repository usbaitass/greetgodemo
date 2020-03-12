package com.usbaitass.greetgo.demotest.mapper;

import com.usbaitass.greetgo.demotest.model.Data;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DataMapper {

    @Select("SELECT * FROM data WHERE id = #{id}")
    public Data findById(long id);

    @Select("select * from data")
    public List<Data> findAll();

}
