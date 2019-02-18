package com.itheima.microservice.information.mapper;

import com.itheima.microservice.information.pojo.TbInformation;
import com.itheima.microservice.information.pojo.TbInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInformationMapper {
    int countByExample(TbInformationExample example);

    int deleteByExample(TbInformationExample example);

    int deleteByPrimaryKey(String infoId);

    int insert(TbInformation record);

    int insertSelective(TbInformation record);

    List<TbInformation> selectByExampleWithBLOBs(TbInformationExample example);

    List<TbInformation> selectByExample(TbInformationExample example);

    TbInformation selectByPrimaryKey(String infoId);

    int updateByExampleSelective(@Param("record") TbInformation record, @Param("example") TbInformationExample example);

    int updateByExampleWithBLOBs(@Param("record") TbInformation record, @Param("example") TbInformationExample example);

    int updateByExample(@Param("record") TbInformation record, @Param("example") TbInformationExample example);

    int updateByPrimaryKeySelective(TbInformation record);

    int updateByPrimaryKeyWithBLOBs(TbInformation record);

    int updateByPrimaryKey(TbInformation record);
}