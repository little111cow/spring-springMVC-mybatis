package com.ssm.service;

import com.ssm.dao.bookMapper;
import com.ssm.entity.Books;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookServiceImpl implements bookService {
    @Setter
    @Autowired
    private bookMapper bookMapper;
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
