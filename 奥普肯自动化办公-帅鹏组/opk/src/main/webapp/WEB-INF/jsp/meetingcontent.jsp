<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function check() {
		var theme = $("#theme").val();
		var meetingDate = $("#meetingDate").val();
		var chairman = $("#chairman").val();
		var recorder = $("#recorder").val();
		var roomId = $("#roomId").val();
		if (theme == null) {
			alert("主题不能为空");
		}
		if (meetingDate == "") {
			alert("会议时间不能为空");
		}
	}
	function fun1() {
		if (confirm("确认发起该会议吗？") == true) {
			return true;
		} else {
			return false;
		}
	}
</script>
</head>

<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">会议纪要</a></li>
		</ul>
	</div>

	<div class="formbody">

		<div class="formtitle">
			<span>会议信息</span>
		</div>

		<ul class="forminfo">
			<form action="updatecontent.action?mId=${meeting.mId}" method="post" id="form1"
				onsubmit="return fun1()">
				<li><label>会议主题</label><label style="width: auto;">${meeting.theme}</label></li>
				<li><label>会议时间</label><label style="width: auto;"><f:formatDate
							value="${meeting.meetingDate}" pattern="yyyy-MM-dd hh:mm" /></label></li>
				<li><label>会议主席</label><label>${meeting.chairmanUser.uName}</label></li>
				<li><label>会议室</label><label>${meeting.meetingRoom.roomName}</label></li>
				<li><label>会议纪要</label></li><textarea name="content" rows="30" cols="100" style="border: 1px solid #999999;margin-bottom: 30px;"></textarea> 
				<li><label>&nbsp;</label><input type="submit" class="btn"
					value="添加" /> </li>
			</form>
		</ul>


	</div>
</body>
</html>