<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
  <head>
    <title>学生信息管理系统：学生列表</title>
    <link rel="icon" type="image/x-ico" href="<c:url value="/images/icon.jpg" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css?v=0.1" />" >
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/studentAddForm.css?v=0.1" />" >
  </head>
  <body>
    <div><h1>学生信息管理系统</h1></div>

    <div><a href="<c:url value="/student/list?page=1" />">返回上层</a></div>
    <div>
      <sf:form method="POST" modelAttribute="student">
        <sf:errors path="*" element="div" cssClass="errors" />
        <sf:label path="id" cssErrorClass="error">学号</sf:label>:
        <sf:input path="id" cssErrorClass="error" /><br/>
        <sf:label path="name" cssErrorClass="error">姓名</sf:label>:
        <sf:input path="name" cssErrorClass="error" /><br/>
        <sf:label path="password" cssErrorClass="error">密码</sf:label>:
        <sf:input path="password" cssErrorClass="error" /><br/>
        <sf:label path="sex" cssErrorClass="error">性别</sf:label>:
        <sf:input path="sex" cssErrorClass="error" /><br/>
        <sf:label path="birth" cssErrorClass="error">生日</sf:label>:
        <sf:input path="birth" cssErrorClass="error" /><br/>
        <sf:label path="classId" cssErrorClass="error">班级</sf:label>:
        <sf:input path="classId" cssErrorClass="error" /><br/>
        <input type="submit" value="提交" />
      </sf:form>
    </div>
  </body>
</html>