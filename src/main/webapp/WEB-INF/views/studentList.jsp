<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>学生信息管理系统：学生列表</title>
    <link rel="icon" type="image/x-ico" href="<c:url value="/images/icon.jpg" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css?v=0.1" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/studentList.css?v=0.1" />" >
  </head>
  <body>
    <div><h1>学生信息管理系统</h1></div>
    <div><a href="<c:url value="/" />">返回上层</a></div>
    <div>
      <ul class="studentList">
        <c:forEach items="${studentList}" var="student" >
          <li id="student_<c:out value="student.id"/>">
            <div>
            </div>
          </li>
        </c:forEach>
      </ul>
    </div>
    <div><a href="<c:url value="/add/student" />">添加学生</a></div>
  </body>
</html>