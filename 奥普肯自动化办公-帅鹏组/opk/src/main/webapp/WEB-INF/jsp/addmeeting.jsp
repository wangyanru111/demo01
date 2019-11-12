<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		if(confirm("确认发起该会议吗？")==true){
			return true;
		}else{
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
			<li><a href="#">会议发起</a></li>
		</ul>
	</div>

	<div class="formbody">

		<div class="formtitle">
			<span>会议信息</span>
		</div>

		<ul class="forminfo">
			<form action="meetingsave.action" method="post" id="form1" onsubmit="return fun1()">
				<li><label>会议主题</label><input name="theme" type="text"
					id="theme" class="dfinput" /></li>
				<li><label>会议时间</label><input name="meetingDate"
					id="meetingDate" type="datetime-local" class="dfinput" /></li>
				<li><label>会议主席</label><select class="dfinput" name="chairman"
					id="chairman">
						<option>-</option>
						<c:forEach items="${list}" var="list">
							<c:if test="${list.jobId>2}">
								<option value="${list.uId}">${list.job.job}--${list.uName}</option>
							</c:if>
						</c:forEach>
				</select></li>
				<li><label>会议记录员</label><select class="dfinput" name="recorder"
					id="recorder">
						<option>-</option>
						<c:forEach items="${list}" var="list">
							<c:if test="${list.jobId<3}">
								<option value="${list.uId}">${list.job.job}--${list.uName}</option>
							</c:if>
						</c:forEach>
				</select></li>
				<li><label>会议室</label> <select class="dfinput" name="roomId"
					id="roomId">
						<option>-</option>
						<c:forEach items="${roomlist}" var="roomlist">
							<option value="${roomlist.roomId}">${roomlist.roomName}</option>
						</c:forEach>
				</select></li>

				<li><label>&nbsp;</label><input type="submit" 
					class="btn" value="添加" /> <input type="reset" class="btn"
					value="取消" /></li>
			</form>
		</ul>


	</div>
</body>
</html>