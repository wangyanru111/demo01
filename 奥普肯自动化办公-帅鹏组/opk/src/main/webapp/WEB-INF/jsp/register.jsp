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
			<form action="regist.action" method="post">
				<li><label>用户名</label><input name="uName" type="text"
					class="dfinput" /><i>用户名不能以数字开头</i></li>
				<li><label>用户密码</label><input name="pass" type="password"
					class="dfinput" maxlength="11"/><i>密码最多11位</i></li>
				
				<li><label>性别</label><cite><input name="sex"
						type="radio" value="男" checked="checked" />男&nbsp;&nbsp;&nbsp;&nbsp;<input
						name="sex" type="radio" value="女" />女</cite></li>
				<li><label>电话</label><input name="tel" type="text"
					class="dfinput" /></li>

				<li><label>年龄</label><input name="age" type="number" max="120"
					min="0" class="dfinput" /></li>

				<li><label>部门</label> <select class="dfinput" name="dId">
						<option>-</option>
						<c:forEach items="${requestScope.depts}" var = "dept">
							<option value = "${dept.dId}">${dept.dName}</option>
						</c:forEach>
				</select></li>
				<li><label>职级编号</label> <select class="dfinput" name="lId">
						<option>-</option>
						<c:forEach items="${requestScope.empLevels}" var = "empLevel">
							<option value = "${empLevel.lId}">${empLevel.level}</option>
						</c:forEach>
				</select></li>
				<li><label>职位编号</label> <select class="dfinput" name="jobId">
						<option>-</option>
						<c:forEach items="${requestScope.jobs}" var = "job">
							<option value = "${job.jobId}">${job.job}</option>
						</c:forEach>
				</select></li>

				<li><label>&nbsp;</label><input type="submit" class="btn"
					value="添加" /> <input  type="reset" class="btn" value="取消" /></li>
			</form>
		</ul>


	</div>
</body>
</html>