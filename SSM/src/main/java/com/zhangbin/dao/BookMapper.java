package com.zhangbin.dao;

import com.zhangbin.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/8/3-21:50
 */
public interface BookMapper {
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
//    模糊查询
    List<Books> likeSelectBook(@Param("bookName") String bookName);
}

