<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/6/3
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>员工信息</title>
</head>
<body>
<table border="1">
    <tr>
        <th>员工编号</th>
        <th>员工姓名</th>
        <th>职位</th>
        <th>上级领导编号</th>
        <th>入职时间</th>
        <th>基本工资</th>
        <th>奖金</th>
        <th>部门编号</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="m">
    <tr>
        <td>${m.empno}</td>
        <td>${m.ename}</td>
        <td>${m.job}</td>
        <td>${m.mgr}</td>
        <td>${m.hiredate}</td>
        <td>${m.sal}</td>
        <td>${m.comm}</td>
        <td>${m.deptno}</td>
        <td>
            <a href="<%=path%>/emp/deleteemp.do?empno=${m.empno}">删除</a>
            <a href="<%=path%>/emp/toupdate.do?empno=${m.empno}">修改</a>
        </td>
    </tr>
    </c:forEach>
    <a href="<%=path%>/emp/toupdate.do">添加</a>
</body>
</html>