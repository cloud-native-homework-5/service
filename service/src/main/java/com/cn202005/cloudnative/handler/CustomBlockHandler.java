package com.cn202005.cloudnative.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cn202005.cloudnative.vo.ResponseVO;

/**
 * @author ykxixi
 * @date 2020-08-06 22:55
 */
public class CustomBlockHandler {

    public static ResponseVO handlerException(BlockException exception){
        return new ResponseVO(429,"Too many requests",null);
    }
}
