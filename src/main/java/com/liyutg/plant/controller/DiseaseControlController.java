package com.liyutg.plant.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.liyutg.plant.entity.DiseaseControl;
import com.liyutg.plant.entity.DiseaseControlExample;
import com.liyutg.plant.service.DiseaseControlServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liyutg
 * @Date 2019/5/10 15:13
 * @description
 */
@RestController
@Api(value = "信息活动服务",description = "用户获取信息相关接口")
@RequestMapping("/message")
public class DiseaseControlController {
    @Autowired
    DiseaseControlServiceImpl diseaseControlService;

    @ApiOperation(value = "获取当前内容列表",notes = "t0",produces = "application/json")
    @GetMapping
    public Page<DiseaseControl> getPage(@RequestParam(name="pageNum",defaultValue="1") int pageNum,
                                                 @RequestParam(name="pageSize",defaultValue="10") int pageSize,
                                                 @RequestParam(name="type01",defaultValue="病虫害 种植技术") String type,
                                                 @RequestParam(name="orderBy",defaultValue="data desc") String orderBy
    ) {
        Page<DiseaseControl> page = PageHelper.startPage(pageNum, pageSize, orderBy);
        DiseaseControlExample example=new DiseaseControlExample();
        DiseaseControlExample.Criteria criteria=example.createCriteria();
        criteria.andType01EqualTo(type);
        diseaseControlService.selectByExample(example);
        return page;
    }

    @ApiOperation(value = "获取单个信息",notes = "t0",produces = "application/json")
    @GetMapping("/get/{id}")
    public DiseaseControl getOne( @PathVariable("id") Integer messageId) {
        return diseaseControlService.selectByPrimaryKey(messageId);
    }

    @ApiOperation(value = "获取条目总数",notes = "t0",produces = "application/json")
    @GetMapping("/count")
    public int count( @RequestParam(name="type01",defaultValue="病虫害 种植技术") String type) {
        DiseaseControlExample example=new DiseaseControlExample();
        DiseaseControlExample.Criteria criteria=example.createCriteria();
        criteria.andType01EqualTo(type);
        return diseaseControlService.countByExample(example);
    }

    @ApiOperation(value = "病害查询",notes = "t0",produces = "application/json")
    @GetMapping("/search")
    public Page<DiseaseControl> search(@RequestParam(name="pageNum",defaultValue="1") int pageNum,
                                        @RequestParam(name="pageSize",defaultValue="10") int pageSize,
                                        @RequestParam(name="type01",defaultValue="病虫害 种植技术") String type,
                                        @RequestParam(name="orderBy",defaultValue="data desc") String orderBy,
                                       @RequestParam(name="searchStr",defaultValue="番茄") String searchStr
    ) {
        Page<DiseaseControl> page = PageHelper.startPage(pageNum, pageSize, orderBy);
        DiseaseControlExample example=new DiseaseControlExample();
        DiseaseControlExample.Criteria criteria=example.createCriteria();
        criteria.andType01EqualTo(type);
        criteria.andTitleLike("%"+searchStr+"%");
        diseaseControlService.selectByExample(example);
        return page;
    }


}
