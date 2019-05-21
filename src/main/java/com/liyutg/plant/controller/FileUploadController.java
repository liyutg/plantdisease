package com.liyutg.plant.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liyutg.plant.entity.UploadImage;
import com.liyutg.plant.service.CmdService;
import com.liyutg.plant.service.IUploadImageService;
import com.liyutg.plant.utils.FileUtils;
import com.liyutg.plant.utils.UUIDUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liyutg
 * @Date 2019/5/11 15:12
 * @description
 */

@RestController
@Api(value = "文件上传服务",description = "用户获取信息相关接口")
public class FileUploadController {

    @Autowired
    IUploadImageService uploadImageService;
    @Autowired
    CmdService cmdService;

    /**
     * 文件上传具体实现方法;
     *
     * @return
     */

    @RequestMapping(value = "/upload/add", method = RequestMethod.POST)
    public Map addFile(HttpServletRequest request) {
        MultipartHttpServletRequest params=((MultipartHttpServletRequest) request);
        List<MultipartFile> files = ((MultipartHttpServletRequest) request)
                .getFiles("file");
        String dimClass=params.getParameter("dimClass");
        String opType=params.getParameter("opType");
        String filename= UUIDUtil.get32UUIDString()+".jpg";

        if("add".equals(opType)){
            UploadImage uploadImage = new UploadImage();
            uploadImage.setDimClass(dimClass);
            uploadImage.setImageName(filename);
            uploadImageService.insertSelective(uploadImage);
        }

        Map map = new HashMap<String,String>();

        MultipartFile file;
        BufferedOutputStream stream;

        file = files.get(0);
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                stream = new BufferedOutputStream(new FileOutputStream(
                        new File("D:\\bishe\\py36-l\\image_classification\\data\\ILSVRC2012\\test\\"+filename)));
                stream.write(bytes);
                stream.close();
                cmdService.exeinfo(filename);
                map.put("status","200");
                map.put("message","upload successful");
                map.put("filename",filename);
                return map;
            } catch (Exception e) {
                map.put("status","500");
                map.put("message","You failed to upload  => "
                        + e.getMessage());
                return map;
            }
        } else {
            map.put("status","204");
            map.put("message","You failed to upload because the file was empty.");
            return map;
        }
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public Map getResult(@RequestParam(name="filename",defaultValue="1.jpg") String fileName) {

        String filePath="D:\\bishe\\py36-l\\image_classification\\data\\ILSVRC2012\\test_list.json";
        String jsonStr="";
        try {
            jsonStr = FileUtils.readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray jsonArray= JSONArray.parseArray(jsonStr);
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        Map map = new HashMap<String,String>();
        map.put("status","200");
        map.put("result",jsonObject.get("disease_class"));
        return map;
    }


}
