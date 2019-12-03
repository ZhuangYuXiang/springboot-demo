package com.example.demo.util;

import com.alibaba.fastjson.JSONObject;

/**
 * JSON对象转换类
 */
public class JSONFORMAT {
    /**
     *  将对象转为JSON字符串
     * @param object
     * @return
     */
    public static String toJsonString(Object object){
        JSONObject json = new JSONObject();
        return  json.toJSONString(object);
    }

    /**
     *  将JSON字符串转为对应的对象
      * @param jsonString
     * @param tClass
     * @param <T>
     * @return
     */
    public static  <T>T toJavaObject(String jsonString, Class<T> tClass){
        JSONObject json = JSONObject.parseObject(jsonString);
        return json.toJavaObject(tClass);
    }
}
