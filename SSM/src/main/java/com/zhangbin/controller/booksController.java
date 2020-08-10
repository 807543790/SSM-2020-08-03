package com.zhangbin.controller;

import com.zhangbin.pojo.Books;
import com.zhangbin.service.BookSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/8/9-10:51
 */
@Controller
@RequestMapping("/book")
public class booksController {
    //controller调用service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookSrevice bookSrevice;


    //查询所有书籍
    @RequestMapping("/AllBook")
    public String allBook(Model model){
        List<Books> books = bookSrevice.selectAllBook();
        model.addAttribute("list",books);
        return "allBook";
    }

    //跳转添加书籍页面
    @RequestMapping("/addBook")
    public String addBook(){
        return "addBook";
    }

    @RequestMapping("/addEntity")
    public String addEntity(Books books){
        bookSrevice.addBook(books);
        return "redirect:/book/AllBook";
    }
}
