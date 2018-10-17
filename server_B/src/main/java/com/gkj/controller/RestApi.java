package com.gkj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author guokunjin
 * @Version 1.0
 * @Date 13:46 2018/10/17
 * @Modified By:
 */
@RestController
public class RestApi {
    @Value("${profile}")
    String profile;
    @GetMapping("version")
    public Map restTest(){
        Map map=new HashMap();
        map.put("appName","SpringBoot Server 2");
        map.put("version","1.0.SNAPSHOT");
        map.put("profile",profile);
        return map;
    }
}
