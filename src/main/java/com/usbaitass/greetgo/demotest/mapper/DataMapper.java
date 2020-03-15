package com.usbaitass.greetgo.demotest.mapper;

import com.usbaitass.greetgo.demotest.model.Data;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DataMapper {

    @Select("SELECT * FROM data WHERE id = #{id}")
    Data findById(long id);

}
