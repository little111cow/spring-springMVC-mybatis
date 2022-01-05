package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.entity.Books;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/books")
public class bookController {

    @Setter
    @Autowired
    @Qualifier("bookServiceImpl")
    private com.ssm.service.bookService bookService;

    @RequestMapping("/allbooks")
    public String getAllBooks(Model model){
        List<Books> books = bookService.queryAllBooks();
        Object json =  JSON.toJSON(books);
        model.addAttribute("books",json);
        return "books";
    }

    @RequestMapping("/querybookbyid/{bookId}")  //RestFul风格
    public String queryBookById(@PathVariable("bookId") int bookId,Model model){
        Books books = bookService.queryBookById(bookId);
        model.addAttribute("books",books.toString());
        return "books";

    }

    @RequestMapping("/toaddbook")
    public String toAddBook(){
        return "addBook";
    }

    @RequestMapping(value = "/addbook")
    public String addbook(@RequestParam("bookName") String bookName, @RequestParam("detail") String detail){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Books books = context.getBean("books",Books.class);
        books.setBookName(bookName);
        books.setDetail(detail);
        bookService.insertBook(books);
        return "redirect:/books/allbooks";
    }

}
