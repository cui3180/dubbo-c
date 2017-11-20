package com.cui.dubbo;

import com.cui.doubbo.client.api.TestService;
import com.cui.doubbo.client.domain.Collage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by cjs
 * Date： 2017/11/20.
 * Time： 14:45.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test")
    public  @ResponseBody  String test(Collage collage){

        String s = testService.addCollage(collage);
        return s;
    }
}
