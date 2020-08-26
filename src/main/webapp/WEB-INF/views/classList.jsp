<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>学生信息管理系统：班级列表</title>
    <link rel="icon" type="image/x-ico" href="<c:url value="/images/icon.jpg" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css?v=0.1" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/classList.css?v=0.2" />" >
  </head>
  <body>
    <div><h1>学生信息管理系统</h1></div>
    <div><a href="<c:url value="/classList?page=1" />">班级列表</a></div>
    <div><a href="<c:url value="/studentList?page=1" />">学生列表</a></div>
    <div><a href="<c:url value="/courseList?page=1" />">课程列表</a></div>
    <div>
      <div>
        <a class="spittleLocation">学院</a>
        <a class="spittleLocation">专业</a>
        <a class="spittleLocation">年级</a>
        <a class="spittleLocation">班级</a>
        <a class="spittleLocation">辅导员</a>
      </div>
      <ul class="classList">
        <c:forEach items="${classList}" var="class" >
          <div>
            <a class="spittleLocation"><c:out value="${class.institute}" /></a>
            <a class="spittleLocation"><c:out value="${class.major}" /></a>
            <a class="spittleLocation"><c:out value="${class.grade}" /></a>
            <a class="spittleLocation"><c:out value="${class.name}" /></a>
            <a class="spittleLocation"><c:out value="${class.teacher}" /></a>
            <a href="<c:out value="/classInfo?id=${class.id}"/>">详细信息</a>
          </div>
        </c:forEach>
      </ul>
    </div>
    <div><a href="<c:url value="/add/class" />">添加班级</a></div>
  </body>
</html>