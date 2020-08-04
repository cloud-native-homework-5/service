package com.cn202005.cloudnative.controller;

import com.cn202005.cloudnative.vo.MessageVO;
import com.cn202005.cloudnative.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class SimpleAPIController {

    @Autowired
    MessageVO messageVO;

    @GetMapping("/msg")
    public ResponseVO simpleAPI(){
        return new ResponseVO(200, "success", messageVO);
    }

}
