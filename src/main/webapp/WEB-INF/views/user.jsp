<%--
  Created by IntelliJ IDEA.
  User: cuong
  Date: 25/09/2022
  Time: 10:37 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table class="table table-hover">


    <c:forEach var="u" items="${users}">
        <tr>
            <td>${u.username}</td>
            <td>${u.pass}</td>
            <td>${u.name}</td>
            <td><a href="user/delete"${u.username}.html>Delete</a> </td>
        </tr>
    </c:forEach>

</table>


<%--<form:form action ="user/insert.htm" modelAttribute="">
    <div>
        <label>Username</label>
        <form:input path="username"/>
    </div>
    <div>
        <label>Password</label>
        <form:input path="password"/>
    </div>
    <div>
        <label>Fullname</label>
        <form:input path="fullname"/>
    </div>

    <div>
        <button class ="btn btn-fefault">Insert</button>
    </div>
</form:form>--%>

</body>
</html>
