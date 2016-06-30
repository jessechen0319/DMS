package com.amd.tool.dms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/7/1.
 */


@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}
