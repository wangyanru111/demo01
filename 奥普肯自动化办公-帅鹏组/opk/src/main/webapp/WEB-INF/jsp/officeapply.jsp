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
			<form action="officeapply.action" method="post">
				<li><label>物品名称</label><input name="oName" type="text"
					class="dfinput" /></li>
				<li><label>办公用品申购</label> <select name="requestStateId"
					class="dfinput">

						<option value="2">申请</option>

				</select></li>
				<li><label>物品类型编号</label><select class="dfinput" name="officeTypeId">
						<c:forEach items="${list}" var="list">
							<option value="${list.officeTypeId}">${list.officeType}</option>
						</c:forEach>
				</select></li>
				<li><label>库存</label><input name="num" type="number" min="0"
					class="dfinput" /></li>
				<li><label>&nbsp;</label><input type="submit" class="btn"
					value="申请" /> <input type="reset" class="btn" value="取消" /></li>
			</form>
		</ul>


	</div>
</body>
</html>