<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
<h1>添加书籍页面</h1>
  <form method="get" action="${pageContext.request.contextPath}/books/addbook">
      <input type="text" name="bookName" placeholder="输入书名"/>
      <input type="text" name="detail" placeholder="输入细节"/>

      <input type="submit"/>
  </form>
  </body>
</html>
