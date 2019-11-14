package com.aaa.lee.springcloud.service;

import com.aaa.lee.springcloud.fallback.ISpringcloudFallbackFactory;
import com.aaa.lee.springcloud.model.Book;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 如果传的参数为普通类型,@RequestParam，并且可以有多个
 * 但是如果所传的参数为实体类,map....必须使用@RequestBody,并且只能有一个
 */
@FeignClient(value = "BOOK-PROVIDER" ,fallbackFactory = ISpringcloudFallbackFactory.class)
public interface ISpringCloudService {

    @RequestMapping("/all")
    List<Book> selectAllBooks();
}
