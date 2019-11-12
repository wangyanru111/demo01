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
		<form action="deleteCarArray.action" method="post">
			<div class="tools">

				<ul class="toolbar">
					<li class="click"><span><img src="images/t01.png" /></span>添加</li>
					<li class="click"><span><img src="images/t02.png" /></span>修改</li>
					<li><span><img src="images/t03.png" /></span><input
						type="submit" value="删除"></li>
					<li><span><img src="images/t04.png" /></span>统计</li>

					<li><form method="post" action="search.action">
							<input type="text" name="uId" /> <input type="submit" value="搜索" />
							<form /></li>

				</ul>


				<ul class="toolbar1">
					<li><span><img src="images/t05.png" /></span>设置</li>
				</ul>

			</div>


			<table class="tablelist" style="text-align: center;">
				<thead>
					<tr>
						<th style="text-align: center;"><input name=""
							type="checkbox" value="" checked="checked" /></th>
						<th style="text-align: center;">车辆编号<i class="sort"><img
								src="images/px.gif" /></i></th>
						<th style="text-align: center;">使用状态编号</th>

						<th style="text-align: center;">车牌号</th>
						<th style="text-align: center;">车辆参数</th>
						<th style="text-align: center;">车辆类型编号</th>
						<th style="text-align: center;">操作</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${carlist}" var="list">
						<tr>
							<td><input name="carIds" type="checkbox"
								value="${list.carId}" /></td>
							<td>${list.carId}</td>

							<td
								<c:if test="${list.requestStateId==2}"> style="color:red"</c:if>>${list.requestState.requestState}</td>

							<td>${list.number}</td>
							<td>${list.param}</td>
							<td>${list.carType.carType}</td>


							<td><a href="deletecar.action?carId=${list.carId}"
								class="tablelink"> 删除</a></td>
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