package com.liyutg.plant.service;

import com.liyutg.plant.dao.UploadImageMapper;
import com.liyutg.plant.entity.UploadImage;
import com.liyutg.plant.entity.UploadImageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xgs
 * @Date 2019/5/11 15:30
 * @description
 */
@Service
public class UploadImageServiceImpl implements IUploadImageService{

    @Autowired
    UploadImageMapper uploadImageMapper;

    @Override
    public int countByExample(UploadImageExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UploadImageExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(UploadImage record) {
        return 0;
    }

    @Override
    public int insertSelective(UploadImage record) {
        return uploadImageMapper.insertSelective(record);
    }

    @Override
    public List<UploadImage> selectByExample(UploadImageExample example) {
        return null;
    }

    @Override
    public UploadImage selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UploadImage record, UploadImageExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UploadImage record, UploadImageExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UploadImage record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UploadImage record) {
        return 0;
    }
}
