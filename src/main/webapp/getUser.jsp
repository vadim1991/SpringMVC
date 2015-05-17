<%--
  Created by IntelliJ IDEA.
  User: swift-seeker-89717
  Date: 13.05.2015
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <script src="js/jquery-2.1.1.min.js"></script>
</head>
<body>

</body>
<script>
  $.ajax({
    url:"/user/1",
    method:"get",
    dataType:"json",
    success:function(data) {
      alert(data.name);
    }
  })
</script>
</html>
