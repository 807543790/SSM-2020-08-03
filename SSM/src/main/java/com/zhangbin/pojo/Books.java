package com.zhangbin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 认认真真敲代码，开开心心每一天
 *
 * @Date 2020/8/3-21:46
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private String bookCounts;
    private String detail;
}
