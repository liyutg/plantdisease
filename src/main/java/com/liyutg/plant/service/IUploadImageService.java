package com.liyutg.plant.service;

import com.liyutg.plant.entity.UploadImage;
import com.liyutg.plant.entity.UploadImageExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


public interface IUploadImageService {
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