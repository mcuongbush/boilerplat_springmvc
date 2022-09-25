<%--
  Created by IntelliJ IDEA.
  User: cuong
  Date: 25/09/2022
  Time: 8:30 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <base href="${pageContext.servletContext.contextPath}/">
    <meta charset="utf-8" />
    <title>Tiêu đề</title>
</head>
<body>
<p>
<h3>Thông tin cá nhân</h3>
<img src="files/${photo_name}">
<br>
<h3>${fullname}</h3>
</p>
<p>
<h3>Hồ sơ xin việc</h3>
<ul>
    <li>File Name: ${cv_name}</li>
    <li>File Type: ${cv_type}</li>
    <li>File Size: ${cv_size}</li>
</ul>
</p>
</body>
</html>

