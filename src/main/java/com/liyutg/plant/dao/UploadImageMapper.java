package com.liyutg.plant.dao;

import com.liyutg.plant.entity.UploadImage;
import com.liyutg.plant.entity.UploadImageExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UploadImageMapper {
    int countByExample(UploadImageExample example);

    int deleteByExample(UploadImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadImage record);

    int insertSelective(UploadImage record);

    List<UploadImage> selectByExample(UploadImageExample example);

    UploadImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadImage record, @Param("example") UploadImageExample example);

    int updateByExample(@Param("record") UploadImage record, @Param("example") UploadImageExample example);

    int updateByPrimaryKeySelective(UploadImage record);

    int updateByPrimaryKey(UploadImage record);
}