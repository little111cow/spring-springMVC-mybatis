package com.ssm.controller;

import com.ssm.entity.Books;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute("books",books.toString());
        return "books";
    }
}
