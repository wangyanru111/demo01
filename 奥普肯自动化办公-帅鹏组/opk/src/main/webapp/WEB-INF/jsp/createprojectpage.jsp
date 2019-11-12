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
			<form action="createproject.action" method="post">
				</select>
				</li>
				<li><label>项目类型</label><select class="dfinput" name="proTid">
						<option>-</option>
						<c:forEach items="${list}" var="list">
							<option value="${list.proTid}">${list.proType}</option>
						</c:forEach>
				</select></li>

				<li><label>项目名称</label><input name="pName" type="text"
					class="dfinput" /><i></i></li>

				<li><label>申请部门</label><select class="dfinput" name="dId">
						<option>-</option>
						<c:forEach items="${list1}" var="list1">
							<option value="${list1.dId}">${list1.dName}</option>
						</c:forEach>
				</select></li>

				<li><label>项目描述</label> <textarea name="context"
						class="dfinput" style="height: 250px"></textarea><i></i></li>

				<li><label>&nbsp;</label><input type="submit" class="btn"
					value="添加" /> <input name="" type="reset" class="btn" value="取消" /></li>


			</form>
		</ul>


	</div>
</body>
</html>