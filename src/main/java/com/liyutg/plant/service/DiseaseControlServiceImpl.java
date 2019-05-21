package com.liyutg.plant.service;

import com.liyutg.plant.dao.DiseaseControlMapper;
import com.liyutg.plant.entity.DiseaseControl;
import com.liyutg.plant.entity.DiseaseControlExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xgs
 * @Date 2019/5/10 15:15
 * @description
 */
@Service
public class DiseaseControlServiceImpl implements IDiseaseControlService{

    @Autowired
    DiseaseControlMapper diseaseControlMapper;


    @Override
    public int countByExample(DiseaseControlExample example) {
        return diseaseControlMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DiseaseControlExample example) {
        return diseaseControlMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer messageId) {
        return diseaseControlMapper.deleteByPrimaryKey(messageId);
    }

    @Override
    public int insert(DiseaseControl record) {
        return diseaseControlMapper.insert(record);
    }

    @Override
    public int insertSelective(DiseaseControl record) {
        return diseaseControlMapper.insertSelective(record);
    }

    @Override
    public List<DiseaseControl> selectByExample(DiseaseControlExample example) {
        return diseaseControlMapper.selectByExample(example);
    }

    @Override
    public DiseaseControl selectByPrimaryKey(Integer messageId) {
        return diseaseControlMapper.selectByPrimaryKey(messageId);
    }

    @Override
    public int updateByExampleSelective(DiseaseControl record, DiseaseControlExample example) {
        return diseaseControlMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(DiseaseControl record, DiseaseControlExample example) {
        return diseaseControlMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(DiseaseControl record) {
        return diseaseControlMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DiseaseControl record) {
        return diseaseControlMapper.updateByPrimaryKey(record);
    }
}
