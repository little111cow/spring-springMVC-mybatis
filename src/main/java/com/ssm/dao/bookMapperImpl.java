package com.ssm.dao;

import com.ssm.entity.Books;
import lombok.Setter;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class bookMapperImpl implements bookMapper {
    @Setter
    @Autowired
    private SqlSessionTemplate sqlSession;

    public int insertBook(Books books) {
        return sqlSession.getMapper(bookMapper.class).insertBook(books);
    }

    private Logger LOGGER = Logger.getLogger(this.getClass().toString());

    public List<Books> queryAllBooks() {
        LOGGER.info("执行queryAllBooks方法");
        return sqlSession.getMapper(bookMapper.class).queryAllBooks();
    }

    public Books queryBookById(int bookId) {
        return sqlSession.getMapper(bookMapper.class).queryBookById(bookId);
    }
}
