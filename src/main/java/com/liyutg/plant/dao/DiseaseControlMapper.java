package com.liyutg.plant.dao;

import com.liyutg.plant.entity.DiseaseControl;
import com.liyutg.plant.entity.DiseaseControlExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface DiseaseControlMapper {
    int countByExample(DiseaseControlExample example);

    int deleteByExample(DiseaseControlExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(DiseaseControl record);

    int insertSelective(DiseaseControl record);

    List<DiseaseControl> selectByExample(DiseaseControlExample example);

    List<DiseaseControl> selectByKeyWord(@Param("keyword") String keyword);


    DiseaseControl selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") DiseaseControl record, @Param("example") DiseaseControlExample example);

    int updateByExample(@Param("record") DiseaseControl record, @Param("example") DiseaseControlExample example);

    int updateByPrimaryKeySelective(DiseaseControl record);

    int updateByPrimaryKey(DiseaseControl record);
}