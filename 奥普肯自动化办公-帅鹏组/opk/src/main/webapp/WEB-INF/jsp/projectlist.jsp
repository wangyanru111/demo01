<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$(".click").click(function() {
			$(".tip").fadeIn(200);
		});

		$(".tiptop a").click(function() {
			$(".tip").fadeOut(200);
		});

		$(".sure").click(function() {
			$(".tip").fadeOut(100);
		});

		$(".cancel").click(function() {
			$(".tip").fadeOut(100);
		});

	});
</script>
<style type="text/css">
th {
	text-align: center;
}
</style>

</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">数据表</a></li>
			<li><a href="#">基本内容</a></li>
		</ul>
	</div>

	<div class="rightinfo">

		<div class="tools">

			<ul class="toolbar">

				<li><form method="post" action="search.action" id="f1">
						<input type="text" name="pName" /> <input type="submit"
							value="搜索" form="f1" />
						<form /></li>
				<li class="click"><span><img src="images/t01.png" /></span><a href="createprojectpage.action">添加</a></li>
			</ul>

		</div>


		<table class="tablelist" style="text-align: center;">
			<thead>
				<tr>
					<th style="text-align: center;"><input name="" type="checkbox"
						value="" checked="checked" /></th>
					<th style="text-align: center;">项目编号<i class="sort"><img
							src="images/px.gif" /></i></th>
					<th style="text-align: center;">项目类型</th>
					<th style="text-align: center;">项目名称</th>
					<th style="text-align: center;">创建日期</th>
					<th style="text-align: center;">状态</th>
					<th style="text-align: center;">部门</th>
					<th style="text-align: center;">审批状态</th>

					<th style="text-align: center;">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="list">
					<tr>
						<td><input name="pIds" type="checkbox" value="${list.pId}" /></td>
						<td>${list.pId}</td>
						<td>${list.projectType.proType}</td>
						<td>${list.pName}</td>
						<td><f:formatDate value="${list.createDate}"
								pattern="yyyy-MM-dd" /></td>
						<td>${list.projectState.state}</td>
						<td>${list.dept.dName}</td>
						<td
							<c:if test="${list.approveStateId==4}">style="color:green"</c:if>
							<c:if test="${list.approveStateId==2||list.approveStateId==3}">style="color:red"</c:if>
							<c:if test="${list.approveStateId==1}">style="color:black"</c:if>
							<c:if test="${list.approveStateId==5||list.approveStateId==6}">style="color:darkgray"</c:if>
							>${list.approveState.approveState}</td>
						<td><a href="showprojectdetail.action?pId=${list.pId}"
							class="tablelink">查看</a> <c:if test="${list.approveStateId==1}">
								<a href="submit.action?pId=${list.pId}" class="tablelink">
									提交</a>
							</c:if> <c:if test="${current_user.uId==3&&list.approveStateId==2}">
								<a href="projectdetail.action?pId=${list.pId}" class="tablelink">
									审批</a>
							</c:if> <c:if test="${current_user.uId==4&&list.approveStateId==3}">
								<a href="projectdetail.action?pId=${list.pId}" class="tablelink">
									审批</a>
							</c:if> <c:if test="${list.approveStateId!=6&&current_user.uId==4}">
								<a href="cancel.action?pId=${list.pId}" class="tablelink">
									撤销</a>
							</c:if> <c:if test="${current_user.uId==4}">
								<a href="deleteProject.action?pId=${list.pId}" class="tablelink">
									删除</a>
							</c:if></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</form>

		<div class="pagin">
			<div class="message">
				共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">2&nbsp;</i>页
			</div>
			<ul class="paginList">
				<li class="paginItem"><a href="javascript:;"><span
						class="pagepre"></span></a></li>
				<li class="paginItem"><a href="javascript:;">1</a></li>
				<li class="paginItem current"><a href="javascript:;">2</a></li>
				<li class="paginItem"><a href="javascript:;">3</a></li>
				<li class="paginItem"><a href="javascript:;">4</a></li>
				<li class="paginItem"><a href="javascript:;">5</a></li>
				<li class="paginItem more"><a href="javascript:;">...</a></li>
				<li class="paginItem"><a href="javascript:;">10</a></li>
				<li class="paginItem"><a href="javascript:;"><span
						class="pagenxt"></span></a></li>
			</ul>
		</div>


	</div>

	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>
</body>
</html>