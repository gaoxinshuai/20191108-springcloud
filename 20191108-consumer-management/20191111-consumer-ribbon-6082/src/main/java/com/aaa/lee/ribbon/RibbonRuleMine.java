package com.aaa.lee.ribbon;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonRuleMine {
    /**
     * 使用随机的算法实现负载均衡
     * @return
     */
//    @Bean
//    public RandomRule randomRule(){
//        return new RandomRule();
//    }
}
