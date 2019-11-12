<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8>
<title>Insert title here</title>
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
.bottonDiv{
	margin: 20px 40% 30px 40%;
}

.botton{
 	width:100px;
 	height: 30px;
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
		<div style="margin: 20px 40% 30px 40%">
			<h5 style="font-size: 18px">第n季度考核</h5>
		</div>
		<form action="grade.action">
			<table class="tablelist" style="text-align: center;">
				<tr>
					<td hidden="true"><input type="text" name="uIdTh"
						value="uIdTh" /></td>
					<td><b>用户名</b></td>
					<td><b>性别</b></td>
					<td><b>年龄</b></td>
					<td><b>入职日期</b></td>
				</tr>
				<tr>
					<td hidden="true"><input type="text" name="uId"
						value="${requestScope.user.uId}" /></td>
					<td>${requestScope.user.uName}</td>
					<td>${requestScope.user.sex}</td>
					<td>${requestScope.user.age}</td>
					<td><f:formatDate value="${requestScope.user.inputDate}"
							pattern="yyyy-MM-dd" /></td>
				</tr>
				<tr>
					<td><b>部门</b></td>
					<td><b>职位</b></td>
					<td><b>职级</b></td>
					<td><b>电话</b></td>
				</tr>
				<tr>
					<td>${requestScope.user.dept.dName}</td>
					<td>${requestScope.user.job.job}</td>
					<td>${requestScope.user.empLevel.level}</td>
					<td>${requestScope.user.tel}</td>
				</tr>
				<tr style="border: 1px dashed #aabbcc;">
					<td colspan="2"><b>主管评价</b></td>
					<td colspan="2"><textarea name="assessContext" rows="10"
							cols="100%"></textarea></td>
				</tr>
				<tr>
					<td style="width: 30%" colspan="2"><b>考核等级</b></td>
					<td style="width: 30%" colspan="2"><select name="gradeId" style="width: 30%">
							<option value="0">-</option>
							<c:forEach items="${requestScope.grades}" var="grade">
								<option value="${grade.gradeId}">${grade.grade}</option>
							</c:forEach>
					</select></td>
				</tr>
			</table>
			<div class = "bottonDiv">
				<input class = "botton" type="submit" /> <input class = "botton" type="reset" />
			</div>
		</form>
	</div>
</body>
</html>