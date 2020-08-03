package com.zhangbin.service;

import com.zhangbin.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/8/3-22:07
 */
public interface BookSrevice {
    //    增加
    int addBook(Books books);
    //    删除
    int deleteBook(@Param("bookID") int id);
    //    修改
    int updateBook(Books books);
    //    查询
    Books selectBook(@Param("bookID") int id);
    //    全部查询
    List<Books> selectAllBook();
}
