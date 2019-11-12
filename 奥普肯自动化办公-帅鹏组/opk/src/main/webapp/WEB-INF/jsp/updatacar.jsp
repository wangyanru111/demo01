<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">表单</a></li>
		</ul>
	</div>

	<div class="formbody">

		<div class="formtitle">
			<span>基本信息</span>
		</div>

		<ul class="forminfo">
			<form action="updatecars.action" method="post">
			<li><label>车牌号</label>
			<select name="carId" class="dfinput" >
			<option>-</option>
			<c:forEach items="${listcar}" var = "car">
			<c:if test="${car.requestStateId==2}">
			<option value="${car.carId}">${car.number}</option>
			</c:if>
			</c:forEach>
			</select>
			</li>
				
				<li><label>管理员审批</label>
				<select name="requestStateId" class="dfinput">
				<option value="1">审批不通过</option>
				<option value="2">审批中</option>
				<option value="3">通过审批</option>
				</select>
				
				</li>
				
				<li><label>&nbsp;</label><input type="submit" class="btn"
					value="确认审批" /> <input  type="reset" class="btn" value="取消" /></li>
			</form>
		</ul>


	</div>
</body>
</html>