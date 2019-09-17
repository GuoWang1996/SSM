<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/6/3
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="<%=path%>/emp/insertorupdateemp.do">
    <input type="hidden" value="${emp.empno}" name="empno" >
    员工姓名：<input type="text" name="ename" value="${emp.ename}" ><br/>
    员工职位：<input type="text" name="job" value="${emp.job}" ><br/>
    员工上级领导：<input type="text" name="mgr" value="${emp.mgr}" ><br/>
    员工基本工资：<input type="text" name="sal" value="${emp.sal}" ><br/>
    员工奖金：<input type="text" name="comm" value="${emp.comm}" ><br/>
    部门编号：<input type="text" name="deptno" value="${emp.deptno}" ><br/>
    <input type="submit" value="保存">
</form>
</body>
</html>