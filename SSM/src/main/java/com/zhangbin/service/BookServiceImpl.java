package com.zhangbin.service;

import com.zhangbin.dao.BookMapper;
import com.zhangbin.pojo.Books;

import java.util.List;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/8/3-22:08
 */
public class BookServiceImpl implements BookSrevice {

    //service调用DAO层
    private BookMapper bookMapper;
    //创建SET方法方便Spring管理
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    //实现业务接口
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books selectBook(int id) {
        return bookMapper.selectBook(id);
    }

    public List<Books> selectAllBook() {
        return bookMapper.selectAllBook();
    }
}
