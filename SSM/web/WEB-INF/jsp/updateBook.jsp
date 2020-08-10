<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍:</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="/book/updateBook" method="post">
        <%--隐藏域传ID才能更新--%>
        <input type="hidden" name="bookID" value="${selectBook.bookID}">
        <div class="form-group">
            <label>书籍名称:</label>
            <input type="text" name="bookName" value="${selectBook.bookName}" class="form-control" required>
        </div>
        <div class="form-group">
            <label>书籍数量:</label>
            <input type="text" name="bookCounts" value="${selectBook.bookCounts}"  class="form-control" required>
        </div>
        <div class="form-group">
            <label>书籍描述:</label>
            <input type="text"  name="detail" value="${selectBook.detail}"  class="form-control" required>
        </div>
        <button type="submit" class="btn btn-default">修改</button>
    </form>
</div>
</body>
</html>