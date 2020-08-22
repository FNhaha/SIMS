<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>学生信息管理系统：主页</title>
    <link rel="icon" type="image/x-ico" href="<c:url value="/images/icon.jpg" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css?v=0.1" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/home.css?v=0.1" />" >
  </head>
  <body>
    <div><h1>学生信息管理系统</h1></div>

    <div><a href="<c:url value="/class/list?page=1" />">班级列表</a></div>
    <div><a href="<c:url value="/student/list?page=1" />">学生列表</a></div>
    <div><a href="<c:url value="/course/list?page=1" />">课程列表</a></div>
  </body>
</html>