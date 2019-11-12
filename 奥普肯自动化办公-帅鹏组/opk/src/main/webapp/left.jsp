<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>

<script type="text/javascript">
	$(function() {
		//导航切换
		$(".menuson li").click(function() {
			$(".menuson li.active").removeClass("active")
			$(this).addClass("active");
		});

		$('.title').click(function() {
			var $ul = $(this).next('ul');
			$('dd').find('ul').slideUp();
			if ($ul.is(':visible')) {
				$(this).next('ul').slideUp();
			} else {
				$(this).next('ul').slideDown();
			}
		});
	})
</script>


</head>

<body style="background: #f0f9fd;">
	<div class="lefttop">
		<span></span>菜单列表
	</div>

	<dl class="leftmenu">

		<dd>
			<div class="title">
				<span><img src="images/leftico01.png" /></span>用户
			</div>
			<ul class="menuson">
				<li class="active" style="margin-top: 5px;"><cite></cite><a
					href="index.action?uId=${current_user.uId}" target="rightFrame">首页</a><i></i></li>
				<li><cite></cite><a href="information.action" target="rightFrame">我的提醒</a><i></i></li>
				<li><cite></cite><a href="registerpage.action"
					target="rightFrame">添加用户</a><i></i></li>
				<li><cite></cite><a href="userlist.action" target="rightFrame">用户列表</a><i></i></li>

			</ul>
		</dd>


		<dd>
			<div class="title">
				<span><img src="images/leftico02.png" /></span>项目
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="projectlist.action"
					target="rightFrame">项目管理</a><i></i></li>
				<li><cite></cite><a href="createprojectpage.action"
					target="rightFrame">创建项目</a><i></i></li>
					<c:if test="${current_user.uId==3}">
				<li><cite></cite><a href="projectmanagement.action"
					target="rightFrame">项目计划管理</a><i></i></li>
					</c:if>
			</ul>
		</dd>


		<dd>
			<div class="title">
				<span><img src="images/leftico03.png" /></span>人事管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="gradelist.action" target="rightFrame">人员考核</a><i></i></li>
				<li><cite></cite><a href="#">常用资料</a><i></i></li>
				<li><cite></cite><a href="#">薪酬管理</a><i></i></li>
				<li><cite></cite><a href="#">人事档案</a><i></i></li>
			</ul>
		</dd>


		<dd>
			<div class="title">
				<span><img src="images/leftico04.png" /></span>办公用品
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="officelist.action"
					target="rightFrame">办公用品信息</a><i></i></li>
				<li><cite></cite><a href="officeapp.action" target="rightFrame">办公用品申购</a><i></i></li>
				<c:if test="${current_user.jobId>7 }">
					<li><cite></cite><a href="updateoffice.action"
						target="rightFrame">物流管理</a><i></i></li>
				</c:if>
			</ul>

		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico01.png" /></span>信息
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">意见箱</a><i></i></li>
				<li><cite></cite><a href="#">论坛管理</a><i></i></li>
				<li><cite></cite><a href="#">新闻发布</a><i></i></li>
			</ul>

		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico02.png" /></span>会议
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="addmeeting.action"
					target="rightFrame">会议发起</a><i></i></li>
				<li><cite></cite><a href="roomlist.action" target="rightFrame">会议室</a><i></i></li>
				<c:if test="${current_user.jobId>2&&current_user.jobId<6 }">
					<li><cite></cite><a href="meetinglist.action?type=1"
						target="rightFrame">会议审批</a><i></i></li>
				</c:if>
				<c:if test="${current_user.jobId==1||current_user.jobId==6 }">
					<li><cite></cite><a href="meetinglist.action?type=2"
						target="rightFrame">会议列表</a><i></i></li>
				</c:if>
			</ul>
		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico03.png" /></span>邮箱
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">收件箱</a><i></i></li>
				<li><cite></cite><a href="#">写邮件</a><i></i></li>
				<li><cite></cite><a href="#">草稿箱</a><i></i></li>
			</ul>

		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico03.png" /></span>车辆
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="carlist.action" target="rightFrame">车辆资料</a><i></i></li>
				<li><cite></cite><a href="carapply.action" target="rightFrame">用车申请</a><i></i></li>
				<c:if test="${current_user.jobId>2&&current_user.jobId<6 }">
					<li><cite></cite><a href="updatecar.action"
						target="rightFrame">车辆使用审批</a><i></i></li>
				</c:if>
			</ul>
		</dd>
	</dl>
</body>
</html>
