package com.jesper.seckill.apiService.impl;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.jesper.seckill.api.DemoService;


/**
 * Created by jiangyunxiong on 2018/5/22.
 */

@Component("demoServiceImpl")
public class DemoServiceImpl implements DemoService{



    public void test() {
    	System.out.println("demoService");
    }


}
