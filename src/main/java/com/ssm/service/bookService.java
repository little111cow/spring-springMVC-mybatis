package com.ssm.service;

import com.ssm.entity.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bookService {
    List<Books> queryAllBooks();

    Books queryBookById(@Param("bookId")int bookId);

    int insertBook(Books books);
}
