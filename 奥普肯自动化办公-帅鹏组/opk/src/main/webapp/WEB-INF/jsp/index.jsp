<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
<style type="text/css">
.tablelist td {
	font-size: 18px;
	color: #01204f;
	padding: 5px 50px;
	width: auto;
	border: none;
}
</style>
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
		</ul>
	</div>

	<div class="mainindex">


		<div class="welinfo">
			<span><img src="images/sun.png" alt="天气" /></span> <b>${current_user.uName}早上好，欢迎使用信息管理系统</b>
			<a href="#">帐号设置</a>
		</div>

		<div class="welinfo">
			<span><img src="images/time.png" alt="时间" /></span> <i>您上次登录的时间：2013-10-09
				15:22</i> （不是您登录的？<a href="#">请点这里</a>）
		</div>

		<div class="xline"></div>

	</div>
	<div>
		<table class="tablelist"
			style="width: 25%; margin: 0 auto; border: none;">
			<tr>
				<td>用户名：${user.uName}</td>
				<td></td>
			</tr>
			<tr>
				<td>部门：${user.dept.dName}</td>

			</tr>
			<tr>
				<td>职级：${user.empLevel.level}</td>

			</tr>
			<tr>
				<td>职位：${user.job.job}</td>

			</tr>
			<tr>
				<td>性别：${user.sex}</td>

			</tr>
			<tr>
				<td>年龄：${user.age}</td>

			</tr>
			<tr>
				<td>电话：${user.tel}</td>

			</tr>
			<tr>
				<td>注册日期：<f:formatDate value="${user.inputDate}" pattern="yyyy-MM-dd" /></td>

			</tr>
		</table>
	</div>
</body>
</html>
