package com.ssm.dao;

import com.ssm.entity.Books;

import java.util.List;

public interface bookMapper {
    List<Books> queryAllBooks();
}
