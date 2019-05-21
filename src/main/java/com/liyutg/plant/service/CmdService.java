package com.liyutg.plant.service;

import ch.qos.logback.core.util.FileUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.liyutg.plant.utils.FileUtils;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static com.liyutg.plant.utils.FileUtils.textToFile;

/**
 * @author xgs
 * @Date 2019/5/18 1:31
 * @description
 */
@Service
public class CmdService {

    public static Map map = new HashMap() ;


    class MyThread extends Thread{

        String filePath, fileName;

        public MyThread(String filePath,String fileName) {
            this.filePath=filePath; this.fileName=fileName;
            map.put("0","apple healthy（苹果健康）");
            map.put("1","Apple_Scab general（苹果黑星病一般）");
            map.put("2","Apple_Scab serious（苹果黑星病严重）");
            map.put("3","Apple Frogeye Spot（苹果灰斑病）");
            map.put("4","Cedar Apple Rust  general（苹果雪松锈病一般）");
            map.put("5","Cedar Apple Rust serious（苹果雪松锈病严重）");
            map.put("6","Cherry healthy（樱桃健康）");
            map.put("7","Cherry_Powdery Mildew  general（樱桃白粉病一般）");
            map.put("8","Cherry_Powdery Mildew  serious（樱桃白粉病严重）");
            map.put("9","Corn healthy（玉米健康）");
            map.put("10","Cercospora zeaemaydis Tehon and Daniels general（玉米灰斑病一般）");
            map.put("11","Cercospora zeaemaydis Tehon and Daniels  serious（玉米灰斑病严重）");
            map.put("12","Puccinia polysora  general（玉米锈病一般）");
            map.put("13","Puccinia polysora serious（玉米锈病严重）");
            map.put("14","Corn Curvularia leaf spot fungus general（玉米叶斑病一般）");
            map.put("15","Corn Curvularia leaf spot fungus  serious（玉米叶斑病严重）");
            map.put("16","Maize dwarf mosaic virus（玉米花叶病毒病）");
            map.put("17","Grape heathy（葡萄健康）");
            map.put("18","Grape Black Rot Fungus general（葡萄黑腐病一般）");
            map.put("19","Grape Black Rot Fungus serious（葡萄黑腐病严重）");
            map.put("20","Grape Black Measles Fungus general（葡萄轮斑病一般）");
            map.put("21","Grape Black Measles Fungus serious（葡萄轮斑病严重）");
            map.put("22","Grape Leaf Blight Fungus general（葡萄褐斑病一般）");
            map.put("23","Grape Leaf Blight Fungus  serious（葡萄褐斑病严重）");
            map.put("24","Citrus healthy（柑桔健康）");
            map.put("25","Citrus Greening June  general（柑桔黄龙病一般）");
            map.put("26","Citrus Greening June  serious（柑桔黄龙病严重）");
            map.put("27","Peach healthy（桃健康）");
            map.put("28","Peach_Bacterial Spot general（桃疮痂病一般）");
            map.put("29","Peach_Bacterial Spot  serious（桃疮痂病严重）");
            map.put("30","Pepper healthy（辣椒健康）");
            map.put("31","Pepper scab general（辣椒疮痂病一般）");
            map.put("32","Pepper scab  serious（辣椒疮痂病严重）");
            map.put("33","Potato healthy（马铃薯健康）");
            map.put("34","Potato_Early Blight Fungus general（马铃薯早疫病一般）");
            map.put("35","Potato_Early Blight Fungus serious（马铃薯早疫病严重）");
            map.put("36","Potato_Late Blight Fungus general（马铃薯晚疫病一般）");
            map.put("37","Potato_Late Blight Fungus  serious（马铃薯晚疫病严重）");
            map.put("38","Strawberry healthy（草莓健康）");
            map.put("39","Strawberry_Scorch general（草莓叶枯病一般）");
            map.put("40","Strawberry_Scorch serious（草莓叶枯病严重）");
            map.put("41","Tomato healthy（番茄健康）");
            map.put("42","tomato powdery mildew  general（番茄白粉病一般）");
            map.put("43","tomato powdery mildew  serious（番茄白粉病严重）");
            map.put("44","Tomato Bacterial Spot Bacteria general（番茄疮痂病一般）");
            map.put("45","Tomato Bacterial Spot Bacteria  serious（番茄疮痂病严重）");
            map.put("46","Tomato_Early Blight Fungus general（番茄早疫病一般）");
            map.put("47","Tomato_Early Blight Fungus  serious（番茄早疫病严重）");
            map.put("48","Tomato_Late Blight Water Mold  general（番茄晚疫病菌一般）");
            map.put("49","Tomato_Late Blight Water Mold serious（番茄晚疫病菌严重）");
            map.put("50","Tomato_Leaf Mold Fungus general（番茄叶霉病一般）");
            map.put("51","Tomato_Leaf Mold Fungus serious（番茄叶霉病严重）");
            map.put("52","Tomato Target Spot Bacteria  general（番茄斑点病一般）");
            map.put("53","Tomato Target Spot Bacteria  serious（番茄斑点病严重）");
            map.put("54","Tomato_Septoria Leaf Spot Fungus  general（番茄斑枯病一般）");
            map.put("55","Tomato_Septoria Leaf Spot Fungus  serious（番茄斑枯病严重）");
            map.put("56","Tomato Spider Mite Damage general（番茄红蜘蛛损伤一般）");
            map.put("57","Tomato Spider Mite Damage serious（番茄红蜘蛛损伤严重）");
            map.put("58","Tomato YLCV Virus general（番茄黄化曲叶病毒病一般）");
            map.put("59","Tomato YLCV Virus  serious（番茄黄化曲叶病毒病严重）");
            map.put("60","Tomato Tomv（番茄花叶病毒病）");

        }

        @Override
        public void run() {
            System.out.printf("run");
            Process p;
            String cmd = "python D:\\bishe\\py36-l\\image_classification\\infer-my.py";
            try {
                p = Runtime.getRuntime().exec(cmd);
                InputStream fis = p.getInputStream();
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                String line = br.readLine();
                line=line.replace("[","");
                line=line.replace("]","");
                System.out.printf("run--"+line);
                JSONArray jsonArray=new JSONArray();
                JSONObject jsonObject=new JSONObject();
                jsonArray.clear();
                jsonObject.put("image_id",fileName);
                jsonObject.put("disease_class",map.get(line));
                jsonArray.add(jsonObject);
                String jsonStr = jsonArray.toJSONString();
                FileUtils.textToFile(filePath,jsonStr);
                System.out.printf("run--end");
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }

    public void exeinfo(String fileName){
        //写入json文件
        String filePath="D:\\bishe\\py36-l\\image_classification\\data\\ILSVRC2012\\test_list.json";
//        String jsonStr;
//        try {
//            jsonStr = FileUtils.readFile(filePath+fileName);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        JSONArray jsonArray=new JSONArray();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("image_id",fileName);
        jsonObject.put("disease_class",null);
        jsonArray.add(jsonObject);
        String jsonStr = jsonArray.toJSONString();
        FileUtils.textToFile(filePath,jsonStr);
        MyThread thread = new MyThread(filePath, fileName);
        thread.run();
    }
}
