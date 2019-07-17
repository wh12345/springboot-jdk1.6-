package com.qy.ebws.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.qy.ebws.entity.CxJfxx;
import com.qy.ebws.entity.Jfxx;
import com.qy.ebws.entity.Result;
import com.qy.ebws.service.JfxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Because of you on 2019/7/16.
 */
@Controller
@RequestMapping("/fsjk")
public class FsjkController {
    @Autowired
    private JfxxService jfxxService;
    @Value("${ebws.mtoken}")
    private String token;
    @RequestMapping(value = "/jsjfxx",produces = "application/json; charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public String jsjfxx(@RequestBody JSONObject jsonObj) {
        String mtoken = jsonObj.getString("token");
        Result result = new Result();
        Map<String,Object> map = new HashMap<String,Object>();
        if(token.equals(mtoken)) {
            JSONObject datalist = jsonObj.getJSONObject("datalist");
            Jfxx jfxx= datalist.toJavaObject(Jfxx.class);
            System.out.print(jfxx);
            result =jfxxService.insertJfxx(jfxx);
//            result.setFhjg(1);
//            result.setFhxx("插入成功!");
        }else{
            result.setFhjg(2);
            result.setFhxx("授权码非法!");
        }
        map.put("result",result);
        return JSON.toJSONString(map);
    }

    @RequestMapping(value = "/cxjfxx",produces = "application/json; charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public String cxjfxx(@RequestBody JSONObject jsonObj) {
        String mtoken = jsonObj.getString("token");
        Result result = new Result();
        Map<String,Object> map = new HashMap<String,Object>();
        if(token.equals(mtoken)) {
            JSONObject datalist = jsonObj.getJSONObject("datalist");
            CxJfxx cxJfxx= datalist.toJavaObject(CxJfxx.class);
            System.out.print(cxJfxx);
            map = jfxxService.queryYjfxx(cxJfxx);
        }else{
            result.setFhjg(2);
            result.setFhxx("授权码非法!");
            map.put("result",result);
        }
        return JSON.toJSONString(map);
    }
}
