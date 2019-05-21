package com.liyutg.plant.service;

import com.liyutg.plant.entity.DiseaseControl;
import com.liyutg.plant.entity.DiseaseControlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author xgs
 * @Date 2019/5/10 15:18
 * @description
 */
public interface IDiseaseControlService {
    int countByExample(DiseaseControlExample example);

    int deleteByExample(DiseaseControlExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(DiseaseControl record);

    int insertSelective(DiseaseControl record);

    List<DiseaseControl> selectByExample(DiseaseControlExample example);

    DiseaseControl selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") DiseaseControl record, @Param("example") DiseaseControlExample example);

    int updateByExample(@Param("record") DiseaseControl record, @Param("example") DiseaseControlExample example);

    int updateByPrimaryKeySelective(DiseaseControl record);

    int updateByPrimaryKey(DiseaseControl record);
}
