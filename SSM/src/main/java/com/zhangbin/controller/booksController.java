package com.zhangbin.controller;

import com.zhangbin.pojo.Books;
import com.zhangbin.service.BookSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

    //添加书籍
    @RequestMapping("/addEntity")
    public String addEntity(Books books){
        bookSrevice.addBook(books);
        return "redirect:/book/AllBook";//添加完毕重定向到书籍展示页面
    }

    //跳转添加书籍页面
    @RequestMapping("/toUpdate")
    public String toUpdate(int bookID,Model model){
        Books books = bookSrevice.selectBook(bookID);
        model.addAttribute("selectBook",books);
        return "updateBook";
    }

    //跳转添加书籍页面
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println(books.toString());
        bookSrevice.updateBook(books);
        return "redirect:/book/AllBook";//添加完毕重定向到书籍展示页面
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookid}")
    public String deleteBook(@PathVariable("bookid") int id){
        bookSrevice.deleteBook(id);
        return "redirect:/book/AllBook";//添加完毕重定向到书籍展示页面
    }
}
