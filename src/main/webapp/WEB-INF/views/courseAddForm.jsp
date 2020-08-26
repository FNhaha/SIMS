<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>学生信息管理系统：添加课程</title>
    <link rel="icon" type="image/x-ico" href="<c:url value="/images/icon.jpg" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css?v=0.1" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/courseAddForm.css?v=0.1" />" >
  </head>
  <body>
    <div><h1>学生信息管理系统</h1></div>

    <div><a href="<c:url value="/classList?page=1" />">班级列表</a></div>
    <div><a href="<c:url value="/studentList?page=1" />">学生列表</a></div>
    <div><a href="<c:url value="/courseList?page=1" />">课程列表</a></div>
    <div>
      <sf:form method="POST" modelAttribute="course">
        <sf:errors path="*" element="div" cssClass="errors" />
        <sf:label path="name" cssErrorClass="error">课程名称</sf:label>:
        <sf:input path="name" cssErrorClass="error" /><br/>
        <sf:label path="institute" cssErrorClass="error">学院</sf:label>:
        <sf:input path="institute" cssErrorClass="error" /><br/>
        <sf:label path="teacher" cssErrorClass="error">任课教师</sf:label>:
        <sf:input path="teacher" cssErrorClass="error" /><br/>
        <sf:label path="period" cssErrorClass="error">课时</sf:label>:
        <sf:input path="period" cssErrorClass="error" /><br/>
        <sf:label path="credit" cssErrorClass="error">学分</sf:label>:
        <sf:input path="credit" cssErrorClass="error" /><br/>
        <input type="submit" value="提交" />
      </sf:form>
    </div>
  </body>
</html>