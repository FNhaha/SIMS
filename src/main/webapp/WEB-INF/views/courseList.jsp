<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>学生信息管理系统：课程列表</title>
    <link rel="icon" type="image/x-ico" href="<c:url value="/images/icon.jpg" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css?v=0.1" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/courseList.css?v=0.3" />" >
  </head>
  <body>
    <div><h1>学生信息管理系统</h1></div>
    <div><a href="<c:url value="/classList?page=1" />">班级列表</a></div>
    <div><a href="<c:url value="/studentList?page=1" />">学生列表</a></div>
    <div><a href="<c:url value="/courseList?page=1" />">课程列表</a></div>
    <div>
      <div>
        <a class="spittleLocation">课程名</a>
        <a class="spittleLocation">学院</a>
        <a class="spittleLocation">任课老师</a>
        <a class="spittleLocation">课时</a>
        <a class="spittleLocation">学分</a>
      </div>
      <ul class="courseList">
        <c:forEach items="${courseList}" var="course" >
          <div>
            <a class="spittleLocation"><c:out value="${course.name}" /></a>
            <a class="spittleLocation"><c:out value="${course.institute}" /></a>
            <a class="spittleLocation"><c:out value="${course.teacher}" /></a>
            <a class="spittleLocation"><c:out value="${course.period}" /></a>
            <a class="spittleLocation"><c:out value="${course.credit}" /></a>
            <a href="<c:out value="/courseInfo?id=${course.id}"/>">详细信息</a>
          </div>
        </c:forEach>
      </ul>
    </div>
    <div><a href="<c:url value="/add/course" />">添加课程</a></div>
  </body>
</html>