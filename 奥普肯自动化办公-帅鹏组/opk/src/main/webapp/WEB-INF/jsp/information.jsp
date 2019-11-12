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
			<li><a href="#">用户</a></li>
			<li><a href="#">我的提醒</a></li>
		</ul>
	</div>

	<div class="rightinfo">


		<h1 style="font-size: 28px;font-family: '微软雅黑';">会议</h1>
		<hr style="height: 3px;margin: 10px 0;background-color: black;"/>
		<table class="tablelist" style="text-align: center;">
			<thead>
				<tr>
					<th style="text-align: center;">会议编号<i class="sort"><img
							src="images/px.gif" /></i></th>
					<th style="text-align: center;">会议主题</th>
					<th style="text-align: center;">会议时间</th>
					<th style="text-align: center;">会议主席</th>
					<th style="text-align: center;">会议记录员</th>
					<th style="text-align: center;">会议室</th>
					<th style="text-align: center;">审批状态</th>
					<th style="text-align: center;">会议纪要</th>
				</tr>
			</thead>
			<tbody>
					<c:forEach items="${meetinglist}" var="list">
					<c:if
						test="${current_user.uId==list.recorder||current_user.uId==list.chairman}">
						<tr>
							<td>${list.mId}</td>
							<td>${list.theme}</td>
							<td><f:formatDate value="${list.meetingDate}"
									pattern="yyyy-MM-dd hh:mm" /></td>
							<td>${list.chairmanUser.uName}</td>
							<td>${list.recorderUser.uName}</td>
							<td>${list.meetingRoom.roomName}</td>
							<!-- 审批状态的字体颜色设置 -->
							<td
								<c:if test="${list.approveStateId==4}">
						style="color:green;"
						</c:if>
								<c:if test="${list.approveStateId<4}">
						style="color:red;"
						</c:if>
								<c:if test="${list.approveStateId==5||list.approveStateId==6}">
						style="color:darkgray;"
						</c:if>
								<c:if test="${list.approveStateId==7}">
						style="color:blue;"
						</c:if>>${list.approveState.approveState}</td>
							<td>${list.content}</td>
						</tr>
					</c:if>
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