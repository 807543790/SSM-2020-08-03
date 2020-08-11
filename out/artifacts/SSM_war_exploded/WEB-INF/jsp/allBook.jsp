<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>书籍列表-显示书籍:</small>
                    </h1>
                </div>
                <div class="col-md-3 column" style="float: right;">
                    <form method="post" action="/book/likeBook">
                        <input type="text" placeholder="请输入查询的书籍" name="bookName">
                        <input type="submit" value="查询" class="btn btn-success">
                    </form>
                </div>
            </div>
        </div>

         <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍详情</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="book" items="${list}">
                        <tr>
                            <td>${book.bookID}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>
                                <a href="/book/toUpdate?bookID=${book.bookID}" class="btn btn-primary btn-sm" style="width: 60px">修改</a>
                                <a href="/book/deleteBook/${book.bookID}" class="btn btn-primary btn-sm" style="width: 60px">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6 column">
            <a class="btn btn-success" href="/book/addBook">添加书籍</a>
        </div>
    </div>
</div>
</body>
</html>
