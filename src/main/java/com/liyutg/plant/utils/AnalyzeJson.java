//package com.liyutg.plant.utils;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.regex.Pattern;
//
////import net.sf.json.JSONArray;
////import net.sf.json.JSONObject;
//
//public class AnalyzeJson {
//	  private final static String regex = "\"([^\\\" ]+?)\":";
//	public static void main(String[] args) {
//       try {
//		String jsonStr = readFile("F:/text/json/tomcat.json");
//    	Map<String,String> reserveMap = new HashMap<String,String>();
//    	Map<String,String> returnNodeMap = new HashMap<String,String>();//储存Jsona节点关系：key：最子节点，value:所以低级节点
//		Map<String, Object> map = json2Map(jsonStr,0,"","",reserveMap,returnNodeMap);
//	//	System.out.println(map);
//		System.out.println(">>>>"+returnNodeMap);
//		//List<String> nodeList = new ArrayList<String>();
//		for(Map.Entry<String,String> mapEntry : returnNodeMap.entrySet())
//		{
//			String key = mapEntry.getKey();
//			String value = mapEntry.getValue();
//			String getNode = value+key;
//			//System.out.println(">>>>>>getNode:"+getNode);
//			gainJsonMapValue(map,getNode);
//		}
//
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	}
//
//	/**
//	 * 将json字符串转为Map结构
//     * 如果json复杂，结果可能是map嵌套map
//	 * @param jsonStr json格式字符串
//	 * @param index  当前第几个节点(相同表示同一级的节点)
//	 * @param fatherName 上一级节点的名称
//	 * @param currNode 当前节点加上级节点的名称 格式：F>F2>F3>...
//	 * @param reserveMap  储存节点信息
//	 * @param returnNodeMap 返回节点信息
//	 * @return
//	 */
//    public static Map<String, Object> json2Map(String jsonStr,int index,String fatherName,String currNode,Map<String,String> reserveMap,Map<String,String> returnNodeMap) {
//        Map<String, Object> map = new HashMap<>();
//        index++; //第几个节点
//        if(jsonStr != null && !"".equals(jsonStr)){
//            //最外层解析
//            JSONObject json = JSONObject.fromObject(jsonStr);
//            for (Object k : json.keySet()) {
//            	 Object v = json.get(k);
//
//                //如果内层还是数组的话，继续解析
//                if (v instanceof JSONArray) {
//                    List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
//                    Iterator<JSONObject> it = ((JSONArray) v).iterator();
//
//                    while (it.hasNext()) {
//                    	Object o = it.next();
//                    	if(o instanceof JSONObject)
//                    	{
//
//                    		//如果节点不存在，则断续添加
//                    		 if(!reserveMap.containsKey(k.toString()))
//                    		 {
//                    			// System.out.println(k.toString()+"*****oldStr3:"+oldStr+"**present paranmeters:"+nodeMap.get(oldStr));
//                    			 returnNodeMap.put(k.toString(), reserveMap.get(fatherName));
//                    			 //返回节点中如果存在节点，则取出修改为当前节点信息
//                    			 if(returnNodeMap.containsKey(k.toString()))
//                    			 {
//                    				 String getResValue = returnNodeMap.get(k.toString());
//                    				 //已经存在的返回节点不能为空
//                    				 if(getResValue != null && !"".equals(getResValue))
//                    				 {
//
//                    					 currNode= (getResValue.endsWith(">")? getResValue : getResValue+">")+ k.toString()+">";
//                    				 }
//                    				 else
//                    				 {
//                    					 currNode +=k.toString()+">";
//                    				 }
//                    			 }
//                    			 //否则添加当前节点
//                    			 else
//                    			 {
//                    				 currNode +=k.toString()+">";
//                    			 }
//                    			 reserveMap.put(k.toString(),currNode);
//                    		 }
//                    		 JSONObject json2 = (JSONObject) o;
//                             list.add(json2Map(json2.toString(),index,k.toString(),currNode,reserveMap,returnNodeMap));
//                    	}
//
//                    }
//
//                    //保存节点
//                    if(!reserveMap.containsKey(k.toString()))
//                    {
//                    	//System.out.println(k.toString()+">>>>oldStr2:"+oldStr+">>>present paranmeters:"+nodeMap.get(oldStr));
//                    	returnNodeMap.put(k.toString(), reserveMap.get(fatherName));
//                    	currNode +=k.toString()+">";
//                    	reserveMap.put(k.toString(), currNode);
//
//                    }
//                    map.put(k.toString(), list);
//                }
//                //还是JsonObject对象，则再次遍历
//                else if(isJsonObject(v.toString()))
//                {
//                	//保存返回节点和当前节点
//            		 if(!reserveMap.containsKey(k.toString()))
//            		 {
//
//            			 //System.out.println(k.toString()+"@@@@@@oldStr1:"+oldStr+">>>present paranmeters:"+nodeMap.get(oldStr));
//            			 returnNodeMap.put(k.toString(), reserveMap.get(fatherName));
//            			 currNode +=k.toString() + ">";
//            			 reserveMap.put(k.toString(), currNode);
//
//            		 }
//
//            		json2Map(v.toString(),index,k.toString(),currNode,reserveMap,returnNodeMap);
//            		map.put(k.toString(), v);
//                }
//                else {
//                    map.put(k.toString(), v);
//                }
//            }
//            return map;
//        }else{
//            return null;
//        }
//    }
//
//
//    /**
//     * 根据json报文和结点获取相应的值
//     * @param map 已经解析过的Json
//     * @param listNode 要获取的字段在json中的节点路径（用">"分割）
//     * @return
//     */
//    public static List<Map<String,Object>> gainJsonMapValue(Map jsonMap,String stringNode){
//
//        List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
//        String[] nodeArray = stringNode.split(">");
//        for (int i = 0; i < nodeArray.length; i++) {
//            if (jsonMap.get(nodeArray[i]) instanceof List) {
//                if (i < nodeArray.length&& null != jsonMap.get(nodeArray[i]) && "" != jsonMap.get(nodeArray[i])) {
//                    Map<String,Object> mapList = jsonMap;
//                    if (((List<Map<String,Object>>)mapList.get(nodeArray[i])).size() > 0) {
//                    	Map map = new HashMap();
//                    	map.put(nodeArray[i], ((List<Map<String,Object>>)mapList.get(nodeArray[i])));
//                    	 resultList.add(map);
//
//                    }
//                }
//                break;
//            }
//            else{
//                if (i < nodeArray.length - 1 && null != jsonMap.get(nodeArray[i]) && "" != jsonMap.get(nodeArray[i])) {
//                	jsonMap = (Map) jsonMap.get(nodeArray[i]);
//                }else{
//                    Map<String,Object> resultMap = new HashMap<String,Object>();
//                    resultMap.put(nodeArray[i],jsonMap.get(nodeArray[i])+"");//nodeArray
//                    resultList.add(resultMap);
//                }
//            }
//        }
//        System.out.println("#####"+resultList);
//        return resultList;
//    }
//
//
//    public static String readFile(String path) throws IOException
//    {
//    	 File file = new File(path);//定义一个file对象，用来初始化FileReader
//         //  FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
//           InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
//           BufferedReader bReader = new BufferedReader(isr);//new一个BufferedReader对象，将文件内容读取到缓存
//           StringBuilder sb = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
//           String s = "";
//           while ((s =bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
//               sb.append(s.trim());//将读取的字符串
//           }
//           bReader.close();
//           String str = sb.toString();
//           return str;
//    }
//
//    /**
//     * To determine whether a string is JsonObject {@link org.json.JSONObject}
//     * @param jsonStr {@link java.lang.String}
//     * @return boolean
//     */
//    private static boolean isJsonObject(final String jsonStr) {
//        if (jsonStr == null) return false;
//        return Pattern.matches("^\\{.*\\}$", jsonStr.trim());
//    }
//
//    /**
//     * To determine whether a string is JsonArray {@link org.json.JSONArray};
//     * @param jsonStr {@link java.lang.String}
//     * @return boolean
//     */
//    private static boolean isJsonArray(final String jsonStr) {
//        if (jsonStr == null) return false;
//        return Pattern.matches("^\\[.*\\]$", jsonStr.trim());
//    }
//}
//---------------------
//作者：Owen William
//来源：CSDN
//原文：https://blog.csdn.net/owen_william/article/details/83901555
//版权声明：本文为博主原创文章，转载请附上博文链接！