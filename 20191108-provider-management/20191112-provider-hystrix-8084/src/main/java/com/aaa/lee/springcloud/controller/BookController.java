package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.Book;
import com.aaa.lee.springcloud.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    //@HystrixCommand(fallbackMethod = "selectAllBooksFallBack")
    public List<Book> selectAllBooks() throws Exception {
        List<Book> books = bookService.selectAll();
        if (books.size()>0){
            throw new Exception("模拟异常,测试熔断处理");
        }
        return books;
    }

//    public List<Book> selectAllBooksFallBack(){
//        List<Book> books = new ArrayList<>();
//        Book book = new Book();
//        book.setId(10000000L);
//        book.setBookName("熔断测试-->图书名称");
//        book.setBookPrice(123.12);
//        books.add(book);
//        return books;
//    }
}
