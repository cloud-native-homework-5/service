package com.cn202005.cloudnative.config;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ykxixi
 * @date 2020-08-06 22:51
 */
@Configuration
public class AopConfiguration
{
    @Bean
    public SentinelResourceAspect sentinelResourceAspect()
    {
        return new SentinelResourceAspect();
    }

}
