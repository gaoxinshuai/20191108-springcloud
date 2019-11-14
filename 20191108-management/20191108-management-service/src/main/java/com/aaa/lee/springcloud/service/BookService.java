package com.aaa.lee.springcloud.service;

import com.aaa.lee.springcloud.mapper.BookMapper;
import com.aaa.lee.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    /**
     * 查询所有图书信息
     * @return
     */
    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }
}
