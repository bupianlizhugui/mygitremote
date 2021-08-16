package com.example.demo.controller;

import com.example.demo.domain.vo.UserVO;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public UserVO getUser(Long id) {
        return demoService.hello(id);
    }
}
