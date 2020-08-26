<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>学生信息管理系统：学生列表</title>
    <link rel="icon" type="image/x-ico" href="<c:url value="/images/icon.jpg" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css?v=0.1" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/studentList.css?v=0.3" />" >
  </head>
  <body>
    <div><h1>学生信息管理系统</h1></div>
    <div><a href="<c:url value="/classList?page=1" />">班级列表</a></div>
    <div><a href="<c:url value="/studentList?page=1" />">学生列表</a></div>
    <div><a href="<c:url value="/courseList?page=1" />">课程列表</a></div>
    <div>
      <div>
        <a class="spittleLocation">姓名</a>
        <a class="spittleLocation">学号</a>
        <a class="spittleLocation">性别</a>
      </div>
      <ul class="studentList">
        <c:forEach items="${studentList}" var="student" >
          <div>
            <a class="spittleLocation"><c:out value="${student.name}" /></a>
            <a class="spittleLocation"><c:out value="${student.id}" /></a>
            <a class="spittleLocation"><c:out value="${student.sex}" /></a>
            <a href="<c:out value="/studentInfo?id=${student.id}"/>">详细信息</a>
          </div>
        </c:forEach>
      </ul>
    </div>
    <div><a href="<c:url value="/add/student" />">添加学生</a></div>
  </body>
</html>