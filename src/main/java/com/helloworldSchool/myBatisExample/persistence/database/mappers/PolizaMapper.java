package com.helloworldSchool.myBatisExample.persistence.database.mappers;

import com.helloworldSchool.myBatisExample.persistence.database.model.Poliza;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PolizaMapper {

    @Select("Select POLIZA_ID, NUM, NIF_TOMADOR from POLIZAMANAGER.POLIZAS where POLIZA_ID = #{idPoliza}")
    @Results(value = {
            @Result(property = "id", column = "POLIZA_ID"),
            @Result(property = "numero", column = "NUM"),
            @Result(property = "nifTomador", column = "NIF_TOMADOR")
    })
    Poliza getPoliza(int idPoliza);

    @Select("Select POLIZA_ID, NUM, NIF_TOMADOR from POLIZAMANAGER.POLIZAS")
    @Results(value = {
            @Result(property = "id", column = "POLIZA_ID"),
            @Result(property = "numero", column = "NUM"),
            @Result(property = "nifTomador", column = "NIF_TOMADOR")
    })
    List<Poliza> getPolizas();
}
