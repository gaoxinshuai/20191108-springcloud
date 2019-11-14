package com.aaa.lee.springcloud.fallback;

import com.aaa.lee.springcloud.model.Book;
import com.aaa.lee.springcloud.service.ISpringCloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ISpringcloudFallbackFactory implements FallbackFactory<ISpringCloudService> {

    @Override
    public ISpringCloudService create(Throwable throwable) {
        return new ISpringCloudService() {
            @Override
            public List<Book> selectAllBooks() {
                System.out.println("我是测试熔断的方法,我被访问了,ISpringCloudService接口中的selectAllBooks方法抛出异常");
                return null;
            }
        };
    }
}
