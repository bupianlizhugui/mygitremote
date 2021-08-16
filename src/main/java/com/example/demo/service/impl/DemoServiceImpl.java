package com.example.demo.service.impl;

import com.example.demo.domain.vo.UserVO;
import com.example.demo.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public UserVO hello(Long id) {
        if (id.equals(1L)) {
            UserVO result = new UserVO();
            result.setId(1L);
            result.setUsername("zhangsan");
            return result;
        } else {
            UserVO result = new UserVO();
            result.setId(2L);
            result.setUsername("lishi");
            return result;
        }

    }
}
