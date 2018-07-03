package com.EugeneStudio.springbootTemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletResponse;
import java.util.Map;

@Controller("templateController")
public class templateController {

    @ResponseBody
    @RequestMapping(value = "/EugeneExam", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public Object getExam(@RequestBody Map<String, Object> requestMap, ServletResponse response) {
        String id = requestMap.get("id").toString();
        /*
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, PATCH, DELETE, PUT");
        httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        */
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/EugeneExam/{id}", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public Object getExam(@PathVariable("id") String id, ServletResponse response) {
        /*
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, PATCH, DELETE, PUT");
        httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        */
        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/EugeneLiu", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public Object test() {
        return "Hello World";
    }
}
