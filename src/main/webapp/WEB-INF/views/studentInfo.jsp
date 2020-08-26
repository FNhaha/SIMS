<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>学生信息管理系统：学生信息</title>
    <link rel="icon" type="image/x-ico" href="<c:url value="/images/icon.jpg" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css?v=0.1" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/studentInfo.css?v=0.1" />" >
  </head>
  <body>
    <div><h1>学生信息管理系统</h1></div>
    <div><a href="<c:url value="/classList?page=1" />">班级列表</a></div>
    <div><a href="<c:url value="/studentList?page=1" />">学生列表</a></div>
    <div><a href="<c:url value="/courseList?page=1" />">课程列表</a></div>
    <div>
      <a>姓名：</a><a><c:out value="${studentInfoVo.name}" /></a><br/>
      <a>学号：</a><a><c:out value="${studentInfoVo.id}" /></a><br/>
      <a>性别:</a><a><c:out value="${studentInfoVo.sex}" /></a><br/>
      <a>出生日期：</a><a><c:out value="${studentInfoVo.birth}" /></a><br/>
      <a>学院：</a><a><c:out value="${studentInfoVo.institute}" /></a><br/>
      <a>专业：</a><a><c:out value="${studentInfoVo.major}" /></a><br/>
      <a>年级：</a><a><c:out value="${studentInfoVo.grade}" /></a><br/>
      <a>班级：</a><a><c:out value="${studentInfoVo.className}" /></a><br/>
      <a>辅导员：</a><a><c:out value="${studentInfoVo.teacher}" /></a><br/>
      <a href="<c:out value="/courseScore/student?studentId=${studentInfoVo.id}" />" >查看课程及成绩</a>
    </div>
    <div><a href="<c:url value="/add/student" />">添加学生</a></div>
  </body>
</html>