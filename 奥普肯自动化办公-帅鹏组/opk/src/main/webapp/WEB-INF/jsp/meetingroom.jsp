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
			<li><a href="#">会议</a></li>
			<li><a href="#">会议列表</a></li>
		</ul>
	</div>

	<div class="rightinfo">

		<div class="tools">




		</div>


		<table class="tablelist" style="text-align: center;">
			<thead>
				<tr>
					<th style="text-align: center;">会议室编号<i class="sort"><img
							src="images/px.gif" /></i></th>
					<th style="text-align: center;">会议室</th>
					<th style="text-align: center;">使用状态</th>
					<th style="text-align: center;">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${roomList}" var="list">
					<tr>
						<td>${list.roomId}</td>
						<td>${list.roomName}</td>
						<td>${list.requestState.requestState}</td>
						<td><c:if test="${list.requestStateId==1}">
								<a
									href="requestroom.action?roomId=${list.roomId}&requestStateId=${list.requestStateId}"
									class="tablelink">申请使用</a>
							</c:if> <c:if test="${list.requestStateId==2&&current_user.jobId==4}">
								<a
									href="agreeroom.action?roomId=${list.roomId}&requestStateId=${list.requestStateId}"
									class="tablelink">通过</a>&nbsp;|
									<a
									href="rejectroom.action?roomId=${list.roomId}&requestStateId=${list.requestStateId}"
									class="tablelink">驳回</a>
							</c:if> <c:if test="${list.requestStateId==3}">
								<a
									href="backroom.action?roomId=${list.roomId}&requestStateId=${list.requestStateId}"
									class="tablelink">归还</a>
							</c:if></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>




		<div class="tip">
			<div class="tiptop">
				<span>提示信息</span><a></a>
			</div>

			<div class="tipinfo">
				<span><img src="images/ticon.png" /></span>
				<div class="tipright">
					<p>是否确认对信息的修改 ？</p>
					<cite>如果是请点击确定按钮 ，否则请点取消。</cite>
				</div>
			</div>

			<div class="tipbtn">
				<input name="" type="button" class="sure" value="确定" />&nbsp; <input
					name="" type="button" class="cancel" value="取消" />
			</div>

		</div>




	</div>

	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>
</body>
</html>