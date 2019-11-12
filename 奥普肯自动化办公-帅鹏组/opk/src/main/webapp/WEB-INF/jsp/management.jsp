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
		<form action="updatestateid.action?pId=${project.pId}" method="post">
			<table class="tablelist"
				style="width: 25%; margin: 0 auto; border: none;">
				<tr>
					<td>项目编号：${project.pId}</td>
					<td></td>
				</tr>
				<tr>
					<td>项目类型：${project.projectType.proType}</td>

				</tr>
				<tr>
					<td>项目名称：${project.pName}</td>

				</tr>
				<tr>
					<td>创建日期：<f:formatDate value="${project.createDate}"
							pattern="yyyy-MM-dd" /></td>
				</tr>
				<tr>
					<td>项目状态:<select class="dfinput" name="stateId">
					        <option value="${project.stateId}" style="display: none;">${project.projectState.state}</option>			        
							<option value="1">未启动</option>
							<option value="2">项目初期</option>
							<option value="3">项目中期</option>
							<option value="4">项目后期</option>
							<option value="5">项目结束</option>
					</select>
						</li></td>
				</tr>
				<tr>
					<td>申请部门：${project.dept.dName}</td>
				</tr>
				<tr>
					<td>审批状态：${project.approveState.approveState}</td>
				</tr>
				<tr>
					<td>详细内容：${project.context}</td>
				</tr>
			</table>
			<center>

				<button>
					<input type="submit" style="font-size: 20px"></input>
				</button>
				<button>
					<a href="" style="font-size: 20px">取消</a>
				</button>
			</center>
		</form>
	</div>
</body>
</html>
