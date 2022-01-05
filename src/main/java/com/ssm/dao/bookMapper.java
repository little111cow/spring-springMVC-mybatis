package com.ssm.dao;

import com.ssm.entity.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface bookMapper {
    List<Books> queryAllBooks();

    Books queryBookById(@Param("bookId")int bookId);

    int insertBook(Books books);
}
